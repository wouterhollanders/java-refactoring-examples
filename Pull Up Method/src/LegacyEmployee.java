public class LegacyEmployee {
    private String name;
    private double monthlySalary;

    public LegacyEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }
    
    public void salaryBonus(int bonus) {
        this.setMonthlySalary((this.getMonthlySalary() + bonus) * 1.02);
    }

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}