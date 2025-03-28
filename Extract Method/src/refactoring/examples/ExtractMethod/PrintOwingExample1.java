package refactoring.examples.ExtractMethod;

public class PrintOwingExample1 {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("John Doe", new Order[] { new Order(100), new Order(200) });
		printOwing(invoice);
	}

	static void printOwing(Invoice invoice) {
		int outstanding = 0;

		// Print banner
		System.out.println("***********************");
		System.out.println("**** Customer Owes ****");
		System.out.println("***********************");

		// Calculate outstanding
		for (Order order : invoice.getOrders()) {
			outstanding += order.getAmount();
		}

		// Record due date
		invoice.setDueDate(java.time.LocalDate.now().plusDays(30));

		// Print details
		System.out.println("Name: " + invoice.getCustomer());
		System.out.println("Amount: " + outstanding);
		System.out.println("Due: " + invoice.getDueDate());
	}
	
	static int TestReturn() {
		int a = 10;
		
		return a;
	}
	
	static void testExtractMethod() {
		
	}
}
