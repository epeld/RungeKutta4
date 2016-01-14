package peldan.math.de;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import peldan.math.Interval;
import peldan.math.Vector;

public abstract class BaseSolver implements Solver{

	@Override
	public List<Vector> solve(Equation eq, Interval interval, int n) {
		if(n == 0) return new ArrayList<>();
		if(n == 1) return Arrays.asList(eq.getInitial());
		
		List<Vector> ys = new ArrayList<>(n);
		ys.add(eq.getInitial());
		
		final double h = interval.getLength() / (n - 1 + 1);
		for(int i = 0; i < n; i++) {
			Vector prev = ys.get(i);
			Vector next = nextY(eq, prev, i * h, h);
			
			ys.add(next);
		}
		return ys;
	}

	
	public abstract Vector nextY(Equation eq, Vector y, double t, double h);
}
