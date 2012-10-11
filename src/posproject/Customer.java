package posproject;

public class Customer {
    private String customerName;
    private String customerID;

    public Customer(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    
    
    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        //validation required
        this.customerName = customerName;
    }

    public final String getCustomerID() {
        return customerID;
    }

    public final void setCustomerID(String customerID) {
        //validation required
        this.customerID = customerID;
    }
    
    
    
}
