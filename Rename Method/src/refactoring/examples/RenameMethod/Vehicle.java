package refactoring.examples.RenameMethod;

public class Vehicle {
	private String make;
	private String model;
	private int year;

	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	// Getter methods for encapsulation
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

	// #1: Method to be refactored (Rename Method)
	public void startEngine() {
		System.out.println("Starting the engine of " + year + " " + make + " " + model);
	}
}