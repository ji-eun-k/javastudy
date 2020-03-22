import lib.org.opentutorials.iot.Elevator;
import lib.org.opentutorials.iot.Lighting;
import lib.org.opentutorials.iot.Security;

public class OkJavaGoingHome {

	public static void main(String[] args) {

		String id = "JAVA APT 1103";
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);

		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();

		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();

		Lighting floorLamp = new Lighting(id + " / floor Lamp");
		floorLamp.on();

	}

}
