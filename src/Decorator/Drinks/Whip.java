package Decorator.Drinks;

/**
 * Created by Taguiar on 1/30/14.
 */
public class Whip extends CondimentDecorator {
    //Holds what is being wrapped
    Beverage beverage;

    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
