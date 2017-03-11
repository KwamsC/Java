
public abstract class Vehicle {
	String naam;
	CentrailStation cs = CentrailStation.getInstance();
	private int[][] matrix;
	gridMatrix grid = new gridMatrix();

	Vehicle(String naam) {
		this.naam = naam;
	}

	public void getMatrix(int[][] matrix) {
		this.matrix = matrix;
		printMatrix();

	}

	public void printMatrix() {
		System.out.println(naam);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
			}
		}
	}

	public void move() {
	}

}
