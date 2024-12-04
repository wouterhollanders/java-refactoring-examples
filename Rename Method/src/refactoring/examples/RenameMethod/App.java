package refactoring.examples.RenameMethod;

public class App {

	public static void main(String[] args) {
		OrderCalculator order = new OrderCalculator(5, 10.0, 0.1);

		// Reference to the order calculator.
		// When renaming this from the order calculator class I would expect a method
		// missing danger.
		// But maybe this is too strict? Regarding the Fowler paper it has more impact
		// when it is a used by Superclass/Subclass
		double total = order.calculateTotal();
		System.out.println("The total amount is: " + total);

		// Test with method in super class to be renamed.
		ElectricVehicle ev = new ElectricVehicle("Tesla", "Model S", 2022, 80);
		ev.startEngine();
		PetrolVehicle pv = new PetrolVehicle("Audi", "A5", 2019, 15);
		pv.startEngine();
	}

}
