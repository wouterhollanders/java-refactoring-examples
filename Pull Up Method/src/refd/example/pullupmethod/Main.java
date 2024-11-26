package refd.example.pullupmethod;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularCustomer regularCustomer = new RegularCustomer(new Date());
        PreferredCustomer preferredCustomer = new PreferredCustomer(new Date());

        Date billDate = new Date();
        regularCustomer.createBill(billDate);
        preferredCustomer.createBill(billDate);
	}

}
