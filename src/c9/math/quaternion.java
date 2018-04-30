package c9.math;

public class quaternion {
	public quaternion(double myScalar, double myI, double myJ, double myK) {
		scalar = myScalar;
		i = myI;
		j = myJ;
		k = myK;
	}

	private double scalar;
	private double i;
	private double j;
	private double k;

	public double getScalar() {
		return scalar;
	}

	public double getI() {
		return i;
	}

	public double getJ() {
		return j;
	}

	public double getK() {
		return k;
	}
}
