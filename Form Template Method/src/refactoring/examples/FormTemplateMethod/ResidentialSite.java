package refactoring.examples.FormTemplateMethod;

public class ResidentialSite extends Site {

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        double base = units * rate * 0.5;
        double tax = base * TAX_RATE;
        return base + tax;
    }
}