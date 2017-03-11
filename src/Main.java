
public class Main {

	public static void main(String[] args) {
		MappingRover mapping = new MappingRover("mapping");

		CameraRover pvda = new CameraRover("Pvda");
		CameraRover d66 = new CameraRover("d66");
		CameraRover cda = new CameraRover("cda");

		mapping.start(2, 2);

	}

}
