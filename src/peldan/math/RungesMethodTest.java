package peldan.math;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import peldan.math.de.Equation;
import peldan.math.de.RungesMethod4;
import peldan.math.de.examples.Sine;

public class RungesMethodTest {

	@Test
	public void test() {
		RungesMethod4 solver = new RungesMethod4();
		
		Equation eq = new Sine();
		
		List<Vector> solution = solver.solve(eq, new Interval(0, 2 * Math.PI), 40);
		
		final double h = 2 * Math.PI / (solution.size() - 1);
		for(int i = 0; i < solution.size(); i++) {
			
			double t = i * h;
			
			double yapprox = solution.get(i).get(0).doubleValue();
			double dydtapprox = solution.get(i).get(1).doubleValue();
			//System.out.println(i * h + " " + y + " " + dydt);
			double y = Math.sin(t);
			double dydt = Math.cos(t);
			
			double err1 = Math.abs(y - yapprox);
			//double err2 = Math.abs(dydt - dydtapprox);
			
			System.out.println(err1);// + " " + err2);
			
			//Assert.assertTrue(err1 < 1e-3);
			//Assert.assertTrue(err2 < 1e-3);
			//Assert.assertEquals(Math.sin(i * h), yapprox, 1e-2);
			//Assert.assertEquals(Math.cos(i * h), dydtapprox, 1e-2);
		}
	}

}

