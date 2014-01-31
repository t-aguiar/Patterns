package Decorator.Ints;

import Decorator.Ints.Add5;
import Decorator.Ints.IntegerInterface;
import Decorator.Ints.MyInt;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Taguiar on 1/31/14.
 */
public class Add5Test {
    @Test
    public void testCalculate()
    {
        IntegerInterface total = new MyInt(10);
        total = new Add5(total);

        assertEquals(15, total.calculate());
    }
}
