package Decorator.Drinks;

/**
 * Created by Taguiar on 1/30/14.
 */
public abstract class Beverage {
    String description = "Unknown";

    public String getDescription()
    {
        return description;
    }

    public abstract double cost();
}
