package peldan.math.de;

import java.util.List;

import peldan.math.Interval;
import peldan.math.Vector;

public interface Solver {
	public List<Vector> solve(Equation eq, Interval interval, int n);
}
