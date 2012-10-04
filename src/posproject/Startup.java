/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author sennis
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CashRegister
        //Customer
        //Product(has a discountstrategy)
        //Receipt(has a customer, has a vendor, has a collection of line items)
        //lineitem(has a product)
        
        //Startup>>>CashRegister...provide customerID, PartNo, Qty
        //CashRegister>>>Receipt..create empty Receipt, look up CustID, create customer object, store in receipt
        //build an array of customer objects, array of products
        //
        String customerID;
        int productID;
        int quantity;
        
        CashRegister cr = new CashRegister();
        //cr.startNewSale(customerID);
        //cr.addProduct(productID, quantity)
    }
}
