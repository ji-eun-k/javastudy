import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoingHomeInput {

	public static void main(String[] args) {

		// String id = JOptionPane.showInputDialog("Enter a path");
		// String light = JOptionPane.showInputDialog("Enter a ID");

		String id = args[0];
		String light = args[1];

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

		DimmingLights moodLamp = new DimmingLights(id + " /moodLamp");
		moodLamp.setBright(Double.parseDouble(light));
		moodLamp.on();

	}

}
