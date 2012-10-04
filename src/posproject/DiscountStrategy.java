/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author sennis
 */
public interface DiscountStrategy {

    abstract double getDiscountInDollars(double price);
}
