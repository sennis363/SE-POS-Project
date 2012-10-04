/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author sennis
 */
public class HolidayDiscount implements DiscountStrategy{
private final double HOLIDAY_DISCOUNT = .4;
    @Override
    public double getDiscountInDollars(double price) {
        return price * HOLIDAY_DISCOUNT;
    }
    
}
