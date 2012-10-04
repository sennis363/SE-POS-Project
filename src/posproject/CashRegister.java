/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author sennis
 */
public class CashRegister {
    private int customerID;
    private String customerName;
    private Receipt receipt;
    
    public void startNewSale(String customerID) {
        
    }
    
    Product[] products = {
        new Product("E169", "Energy Lance", 15.45, new HolidayDiscount()),
        new Product("R363", "Running Shoes", 22.30, new RecurringCustomerDiscount()),
        new Product("T300", "The Triforce", 50.70, new HolidayDiscount())
    };
    
    public void addItemToSale(String prodId, int qty) {
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
}
    
