/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author sennis
 */
public class RecurringCustomerDiscount implements DiscountStrategy{
private final double RECURRING_DISCOUNT = .2;
    @Override
    public double getDiscountInDollars(double price) {
        return price * RECURRING_DISCOUNT;
    }
    
}
