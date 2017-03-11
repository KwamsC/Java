import java.util.ArrayList;

public class CentrailStation {
	private static CentrailStation instance = new CentrailStation();
	private int[][] matrix = new int[5][5];
	ArrayList<CameraRover> roverList = new ArrayList<CameraRover>();

	private CentrailStation() {
	}

	public static CentrailStation getInstance() {
		return instance;
	}

	public void addSubscriber(CameraRover rover) {
		roverList.add(rover);
	}

	public void getMatrix(int[][] matrix) {
		this.matrix = matrix;
		notifyRoversGridPosition();
	}

	public void notifyRoversGridPosition() {
		for (CameraRover rover : roverList) {
			rover.getMatrix(matrix);
		}
	}

	public void checkNextPosition() {
		// logic
	}

}
