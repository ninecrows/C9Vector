package c9.math;

public class point {
	// Construct a point at the origin.
	public point() {
		x = 0.0;
		y = 0.0;
		z = 0.0;
		w = 0.0;
	}

	// Construct a point at a defined point in space.
	public point(double myX, double myY, double myZ) {
		x = myX;
		y = myY;
		z = myZ;
		w = 0.0;
	}

	// Construct a point with all values inserted.
	public point(double myX, double myY, double myZ, double myW) {
		x = myX;
		y = myY;
		z = myZ;
		w = myW;
	}

	public double getX() {
		return (x);
	}

	public double getY() {
		return (y);
	}

	public double getZ() {
		return (z);
	}

	public double getW() {
		return (w);
	}
	
	private double x;
	private double y;
	private double z;
	private double w;
}
