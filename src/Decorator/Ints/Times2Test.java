package Decorator.Ints;

import Decorator.Ints.IntegerInterface;
import Decorator.Ints.MyInt;
import Decorator.Ints.Times2;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Taguiar on 1/31/14.
 */
public class Times2Test {
    @Test
    public void testCalculate()
    {
        IntegerInterface total = new MyInt(10);
        total = new Times2(total);

        assertEquals(20,total.calculate());
    }
}
