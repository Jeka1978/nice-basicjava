package tdd;

/**
 * Created by Jeka on 26/06/2016.
 */
public class TaxCalculator {
    public double withMaam(double price) {
        return price + price * MaamResolver2.getInstance().getMaam();
    }
}
