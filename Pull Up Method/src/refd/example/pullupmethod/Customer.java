package refd.example.pullupmethod;

import java.util.Date;

abstract class Customer {
    private Date lastBillDate;

    public Customer(Date lastBillDate) {
        this.lastBillDate = lastBillDate;
    }

    public Date getLastBillDate() {
        return lastBillDate;
    }
}

class RegularCustomer extends Customer {
    public RegularCustomer(Date lastBillDate) {
        super(lastBillDate);
    }

    public void createBill(Date date) {
        double chargeAmount = charge(getLastBillDate(), date);
        addBill(date, chargeAmount);
    }

    public double charge(Date start, Date end) {
        // Some logic for regular customer billing
        return 100.0;
    }

    public void addBill(Date date, double amount) {
        System.out.println("Regular Customer Bill: Date = " + date + ", Amount = " + amount);
    }
}

class PreferredCustomer extends Customer {
    public PreferredCustomer(Date lastBillDate) {
        super(lastBillDate);
    }

    public void createBill(Date date) {
        double chargeAmount = charge(getLastBillDate(), date);
        addBill(date, chargeAmount);
    }

    public double charge(Date start, Date end) {
        // Some logic for preferred customer billing
        return 80.0;
    }

    public void addBill(Date date, double amount) {
        System.out.println("Preferred Customer Bill: Date = " + date + ", Amount = " + amount);
    }
}