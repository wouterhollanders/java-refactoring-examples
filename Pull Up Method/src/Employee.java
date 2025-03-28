public class Employee extends LegacyEmployee {
	private String workplace;
	private String privateString;

	public Employee(String name, double monthlySalary, String workplace) {
		super(name, monthlySalary);
		this.workplace = workplace;
	}

	// #1
	public void salaryBonus(int bonus) {
		this.setMonthlySalary((this.getMonthlySalary() + bonus) * 1.01);
	}

	// #2
	@Override
	public String toString() {
		return this.getName() + ", earns " + this.getMonthlySalary() + ", works at " + this.getWorkplace();
	}

	// #3
	public String getWorkplace() {
		return workplace;
	}

	// #4
	public void salaryBonusDistrict(int bonus) {

		if (this.workplace == this.workplace) {
			this.setMonthlySalary((this.getMonthlySalary() + bonus) * 1.01);
		}

	}
	
	// #5
	@Override
	public void doSomething() {
    	System.out.println("Sub Class: Do Something");
    }
}