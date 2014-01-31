package Decorator.Drinks;

/**
 * Created by Taguiar on 1/30/14.
 */
public class Espresso extends Beverage {
    public Espresso()
    {
        description = "Espresso";
    }

    @Override
    public double cost()
    {
        return 1.99;
    }
}
