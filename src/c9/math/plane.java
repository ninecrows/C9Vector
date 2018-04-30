package c9.math;

public class plane {
	private point[] points;

	// Needs exactly three points.
	public plane(point point1, point point2, point point3) {
		points = new point[3];
		points[0] = point1;
		points[1] = point2;
		points[2] = point3;
	}

	public plane(point point1, vector normal) {
		points = new point[3];
		points[0] = new point(0, 0, 0);
		points[1] = new point(0, 0, 0);
		points[2] = new point(0, 0, 0);
	}
}
