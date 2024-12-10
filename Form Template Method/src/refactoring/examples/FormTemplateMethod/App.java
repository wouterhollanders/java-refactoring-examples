package refactoring.examples.FormTemplateMethod;

public class App {

	public static void main(String[] args) {
        Site residentialSite = new ResidentialSite(100, 5);
        Site lifelineSite = new LifelineSite(100, 5);

        System.out.println("Residential Site Billable Amount: " + residentialSite.getBillableAmount());
        System.out.println("Lifeline Site Billable Amount: " + lifelineSite.getBillableAmount());
    }
}