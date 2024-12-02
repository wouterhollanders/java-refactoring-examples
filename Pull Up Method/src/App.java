
public class App {

	public static void main(String[] args) {
		Employee emp = new Employee("Alice", 3000.0, "New York Office");
        emp.salaryBonus(500);
        System.out.println(emp);
	}

}
