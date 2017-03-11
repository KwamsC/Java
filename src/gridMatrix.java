
public class gridMatrix {
	CentrailStation cs = CentrailStation.getInstance();
	int formaat = 64;
	private int[][] matrix;

	public void setPoint() {

	}

	public void vulMatrix(int x, int y) {
		matrix = new int[x][y];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				int ran = (int) (Math.random() * 10);
				matrix[i][j] = ran;
			}
		}

		cs.getMatrix(matrix);

	}

}
