package c9.math;

public class vector {
	private point start;
	private point end;

	public point getStart() {
		return start;
	}

	public point getEnd() {
		return end;
	}

	public vector(point myStart, point myEnd) {
		start = myStart;
		end = myEnd;
	}
}
