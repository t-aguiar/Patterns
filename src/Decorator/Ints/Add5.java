package Decorator.Ints;

/**
 * Created by Taguiar on 1/31/14.
 */
public class Add5 implements IntegerInterface{
    IntegerInterface wrapped;

    public Add5(IntegerInterface wrap)
    {
        this.wrapped = wrap;
    }

    @Override
    public int calculate() {
        return 5+wrapped.calculate();
    }
}
