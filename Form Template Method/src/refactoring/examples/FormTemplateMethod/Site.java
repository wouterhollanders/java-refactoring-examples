package refactoring.examples.FormTemplateMethod;

public abstract class Site {
    protected double units;
    protected double rate;
    public static final double TAX_RATE = 0.2;

    public Site(double units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    public abstract double getBillableAmount();
}