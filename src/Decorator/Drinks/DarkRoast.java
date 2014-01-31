package Decorator.Drinks;

/**
 * Created by Taguiar on 1/30/14.
 */
public class DarkRoast extends Beverage {
    public DarkRoast()
    {
        description = "Dark Roast";
    }

    public double cost()
    {
        return .99;
    }
}
