/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author sennis
 */
public class Receipt {
    
    private static int receiptNumber = 0;
    private String prodId;
    private int qty;
    private Customer customer;
    private LineItem[] lineItems;
    private Product[] products;
    
    public Receipt(Customer customer) {
        this.customer = customer;
        receiptNumber++;
    }
    
//    public double getTotalPrice() {
//        double totalPrice;
//        for(LineItem item : lineItems) {
            //totalPrice += item.getDiscount();
        //}
    //}
    
    public void addLineItem(Product prodId, int qty) {
        
    }
}
