package refactoring.examples.ExtractMethod;

class Invoice {
    private String customer;
    private Order[] orders;
    private java.time.LocalDate dueDate;

    public Invoice(String customer, Order[] orders) {
        this.customer = customer;
        this.orders = orders;
    }

    public String getCustomer() {
        return customer;
    }

    public Order[] getOrders() {
        return orders;
    }

    public java.time.LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(java.time.LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}