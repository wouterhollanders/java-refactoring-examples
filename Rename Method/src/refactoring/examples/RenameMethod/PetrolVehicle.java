package refactoring.examples.RenameMethod;

public class PetrolVehicle extends Vehicle {
	private int gasLevel;

	public PetrolVehicle(String make, String model, int year, int gasLevel) {
		super(make, model, year);
		this.gasLevel = gasLevel;
	}

	@Override
	public void startEngine() {
		if (gasLevel > 20) {
			System.out.println(
					"Starting the engine of " + getMake() + " " + getModel() + " with sufficient gasoline.");
		} else {
			System.out.println("Gasoline too low to start the engine.");
		}

	}
}
