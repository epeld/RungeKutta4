package peldan.math;

import java.util.ArrayList;
import java.util.List;

public class Vector {

	private final List<Double> coords;

	public Vector(int n) {
		this.coords = new ArrayList<Double>(n);
		for (int i = 0; i < n; i++) {
			coords.add(0.0);
		}
		
		assert coords.size() == n;
	}
	
	public Vector(List<Double> c) {
		this.coords = c;
	}

	public Vector scalarMultiply(double h) {
		List<Double> cs = new ArrayList<>(this.coords.size());
		for(Double d : coords) {
			cs.add(d * h);
		}
		return new Vector(cs);
	}

	public Vector add(Vector v) {
		assert v.getSize() == this.getSize();
		
		List<Double> cs = new ArrayList<>(this.coords.size());
		for(int i = 0; i < coords.size(); i++) {
			Double coord1 = coords.get(i);
			Double coord2 = v.get(i);
			cs.add(coord1 + coord2);
		}
		
		return new Vector(cs);
	}

	public int getSize() {
		return coords.size();
	}

	public Double get(int i) {

		return coords.get(i);
	}
	
	public void set(int i, double v) {
		coords.set(i, v);
	}
}
