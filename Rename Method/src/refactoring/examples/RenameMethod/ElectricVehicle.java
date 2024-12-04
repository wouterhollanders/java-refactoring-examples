package refactoring.examples.RenameMethod;

public class ElectricVehicle extends Vehicle {
	private int batteryLevel;

	public ElectricVehicle(String make, String model, int year, int batteryLevel) {
		super(make, model, year);
		this.batteryLevel = batteryLevel;
	}

	@Override
	public void startEngine() {
		if (batteryLevel > 20) {
			System.out.println(
					"Starting the electric engine of " + getMake() + " " + getModel() + " with sufficient battery.");
		} else {
			System.out.println("Battery too low to start the engine.");
		}

	}
}
