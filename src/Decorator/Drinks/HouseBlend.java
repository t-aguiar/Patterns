package Decorator.Drinks;

/**
 * Created by Taguiar on 1/30/14.
 */
public class HouseBlend extends Beverage {
    public HouseBlend()
    {
        description = "House Blend";
    }

    @Override
    public double cost()
    {
        return .89;
    }
}
