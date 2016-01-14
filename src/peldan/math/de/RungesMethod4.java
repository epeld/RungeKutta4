package peldan.math.de;

import peldan.math.Vector;

public class RungesMethod4 extends BaseSolver {

	@Override
	public Vector nextY(Equation eq, Vector y, double t, double h) {
		Vector f1 = eq.calculateDerivative(y, t);
		Vector f2 = eq.calculateDerivative(y.add(f1.scalarMultiply(h / 2.0)), t + h / 2.0);
		Vector f3 = eq.calculateDerivative(y.add(f2.scalarMultiply(h / 2.0)), t + h / 2.0);
		Vector f4 = eq.calculateDerivative(y.add(f3.scalarMultiply(h)), t + h);
		
		Vector f2f3 = f2.add(f3);
		Vector dydt = f1.add(f4).add(f2f3.scalarMultiply(2));
		
		return y.add(dydt.scalarMultiply(h / 6.0));
	}

}

