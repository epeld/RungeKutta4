package peldan.math.de.examples;

import peldan.math.Vector;



public class Sine implements peldan.math.de.Equation {

	@Override
	public Vector calculateDerivative(Vector vars, double t) {
				
		Vector next = new Vector(2);
		next.set(1, -vars.get(0));
		next.set(0, vars.get(1));
		
		return next;
	}

	@Override
	public Vector getInitial() {
		Vector vector = new Vector(2);
		vector.set(1, 1.0);
		return vector; // Initial zero
	}

}
