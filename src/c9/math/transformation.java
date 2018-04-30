package c9.math;

public class transformation {
	private double[][] matrix;

	public transformation() {
		matrix = new double[4][4];

		// Identity matrix.
		matrix[0][0] = 1.0;
		matrix[1][1] = 1.0;
		matrix[2][2] = 1.0;
		matrix[3][3] = 1.0;
	}

	// Create a trasnformation matrix from fixed values.
	public transformation(double[][] myMatrix) {
		matrix = new double[4][4];

		for (int xx = 0; xx < 3; xx++) {
			for (int yy = 0; yy < 3; yy++) {
				matrix[yy][xx] = myMatrix[xx][yy];
			}
		}
	}

	public transformation compose(transformation other) {
		transformation result = null;

		return (result);
	}

	public point transform(point original) {
		point result = null;

		return (result);
	}
}
