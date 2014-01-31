package Decorator.Drinks;

/**
 * Created by Taguiar on 1/30/14.
 */
public class Decaf extends Beverage {
    public Decaf()
    {
        description = "Decaf";
    }

    public double cost()
    {
        return 1.05;
    }
}
