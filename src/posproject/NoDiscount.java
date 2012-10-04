/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author sennis
 */
public class NoDiscount implements DiscountStrategy{
private final double NO_DISCOUNT = 0;
    @Override
    public double getDiscountInDollars(double price) {
        //validate
        return price * NO_DISCOUNT;
    }
    
}
