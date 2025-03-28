package refactoring.examples.FormTemplateMethod;

public class ResidentialSite extends Site {

    public ResidentialSite(double units, double rate) {
        super(units, rate);
    }

    
    public double getBillableAmount() {
        double base = units * rate;
        double tax = base * TAX_RATE;
        return base + tax;
    }
}
