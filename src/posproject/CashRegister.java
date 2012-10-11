package posproject;

public class CashRegister {
    private Customer customer;
    private Receipt receipt;
//    private 
    
    Customer[] customers = {new Customer("Bob", "12345"), new Customer("Ted", "55555"),
    new Customer("Joe", "99999")
    };
    
    Product[] products = {
        new Product("E169", "Eviolite", 15.45, new HolidayDiscount()),
        new Product("I363", "Ice Missle", 22.30, new RecurringCustomerDiscount()),
        new Product("T300", "The Triforce", 50.70, new ThirdDiscount())
    };
    
    public final void startNewSale(String custId) {
        Customer cust = null;
        for(Customer c : customers) {
            if(custId.equals(c.getCustomerID())) {
                customer = c;
                break;
            }
        }
        receipt = new Receipt(cust);
    }
    
    
    public final void addItemToSale(String prodId, int qty) {
    Product product = null;
        for(Product p : products) {
            if(prodId.equals(p.getProductID())) {
                product = p;
                break;
            }
        }
        
        if(product != null) {
            receipt.addLineItem(product, qty);
        }
        
    }
    
    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
    
    public final void outputReceiptData() {
        System.out.println("Customer ID: " + customer.getCustomerID());
        System.out.println("Customer Name: " + customer.getCustomerName());
        displayLineItems();
    }
    
    public final void displayLineItems() {
        System.out.println("");
        System.out.println("Item\t\tPrice\tDiscount\tQuantity");
        System.out.println("");
      for(LineItem l : receipt.getLineItems()) {
          System.out.print(l.getProduct().getProductName() + '\t');
          System.out.print(l.getOrigPriceSubtotal());
          System.out.print(String.format("%10.2f", l.getDiscountedPrice()) + '\t' + '\t');
          System.out.println(l.getQty());
        }
        System.out.println("");
        System.out.println("Total Before Discount");
        System.out.println(receipt.getTotalBeforeDiscount());
        System.out.println("Total Discount");
        System.out.println(receipt.getTotalDiscountAmt());
        System.out.println("Final Price");
        System.out.println(String.format("%01.2f", receipt.getTotalAfterDiscount()));
        System.out.println("");
        System.out.println("END OF SALE - THANK YOU FOR SHOPPING AT R-MART");
    }
}
    
