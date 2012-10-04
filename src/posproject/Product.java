/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author sennis
 */
public class Product {
    private String productID;
    private String productName;
    private double productPrice;
    private DiscountStrategy discountStrategy;

    public Product(String productID, String productName, double productPrice, DiscountStrategy discountStrategy) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.discountStrategy = discountStrategy;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
}
