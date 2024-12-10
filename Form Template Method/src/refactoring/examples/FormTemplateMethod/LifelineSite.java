package refactoring.examples.FormTemplateMethod;

public class LifelineSite extends Site {

    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        double base = units * rate;
        double tax = base * TAX_RATE;
        return base + tax;
    }
}