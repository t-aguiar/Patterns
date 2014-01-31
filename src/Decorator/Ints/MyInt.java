package Decorator.Ints;

/**
 * Created by Taguiar on 1/31/14.
 */
public class MyInt implements IntegerInterface {
    public int number;

    public MyInt(int num)
    {
        this.number = num;
    }

    @Override
    public int calculate() {
        return number;
    }
}
