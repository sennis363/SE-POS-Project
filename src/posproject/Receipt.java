package posproject;

public class Receipt {
    
    private static int receiptNumber = 0;
    private String prodId;
    private int qty;
    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    private double grandTotal = 0;
    private double totalDiscount = 0;
    
    
    public Receipt(Customer customer) {
        this.customer = customer;
        receiptNumber++;
    }
    
    public final double getTotalDiscountAmt() {
        for(LineItem item : lineItems) {
            totalDiscount += item.getDiscountedPrice();
        }
        return totalDiscount;
    }
    
    public final double getTotalBeforeDiscount() {
        for(LineItem item : lineItems) {
            grandTotal += item.getOrigPriceSubtotal();
        }
        return grandTotal;
    }
    
    public final double getTotalAfterDiscount() {
        return grandTotal - totalDiscount;
    }
    
    public final void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }
    

    private final void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    public final static int getReceiptNumber() {
        return receiptNumber;
    }

    public final static void setReceiptNumber(int receiptNumber) {
        //validation required
        Receipt.receiptNumber = receiptNumber;
    }

    public final String getProdId() {
        return prodId;
    }

    public final void setProdId(String prodId) {
        //validation required
        this.prodId = prodId;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        //validation required
        this.qty = qty;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        //validation required
        this.customer = customer;
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        //validation required
        this.lineItems = lineItems;
    }
    
}
