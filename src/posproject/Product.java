package posproject;

public class Product {
    private String productID;
    private String productName;
    private double productPrice;
    private int quantity; 
    private DiscountStrategy discountStrategy;

    public Product(String productID, String productName, double productPrice, DiscountStrategy discountStrategy) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.discountStrategy = discountStrategy;
    }

    

    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
        //validation required
        this.productID = productID;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        //validation required
        this.productName = productName;
    }

    public final double getProductPrice() {
        return productPrice;
    }

    public final void setProductPrice(double productPrice) {
        //validation required
        this.productPrice = productPrice;
    }

    public final DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public final void setDiscountStrategy(DiscountStrategy discountStrategy) {
        //validation required
        this.discountStrategy = discountStrategy;
    }

    public final int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        //validation required
        this.quantity = quantity;
    }
    
    public final double getDiscount(int qty) {
        return (discountStrategy.getDiscountInDollars(productPrice, qty));
    }
    
}
