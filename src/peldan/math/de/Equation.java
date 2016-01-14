package peldan.math.de;

import java.util.List;

import peldan.math.Vector;

public interface Equation {
	public Vector calculateDerivative(Vector vars, double t);

	public Vector getInitial();
}
