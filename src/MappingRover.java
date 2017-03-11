
public class MappingRover extends Vehicle {

	public MappingRover(String naam) {
		super(naam);
	}

	public void start(int x, int y) {
		grid.vulMatrix(x, y);
	}
}
