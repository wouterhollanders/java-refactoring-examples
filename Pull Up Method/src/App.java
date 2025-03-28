
public class App {

	public static void main(String[] args) {
		Employee emp = new Employee("Employee", 3000.0, "New York Office");
        emp.salaryBonus(100);
        emp.doSomething();
        System.out.println(emp);
	}

}
