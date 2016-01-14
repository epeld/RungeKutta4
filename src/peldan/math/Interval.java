package peldan.math;

public class Interval {

	private final double end;
	private final double start;

	public Interval(double start, double end) {
		this.start = start;
		this.end = end;
	}
	
	public double getLength() {
		return getEnd() - getStart();
	}

	public double getStart() {
		return start;
	}

	public double getEnd() {
		return end;
	}
}
