package Decorator.Ints;

/**
 * Created by Taguiar on 1/31/14.
 */
public class Times2 implements IntegerInterface {
    IntegerInterface wrapped;

    public Times2(IntegerInterface wrap)
    {
        this.wrapped = wrap;
    }

    @Override
    public int calculate() {
        return 2*wrapped.calculate();
    }
}
