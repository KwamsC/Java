
public class CameraRover extends Vehicle {

	public CameraRover(String naam) {
		super(naam);
		subcribe();
		move();
	}

	public void subcribe() {
		cs.addSubscriber(this);
	}

}
