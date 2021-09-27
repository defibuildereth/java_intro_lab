import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void before () {
        calculator = new Calculator();
    }

    @Test
    public void canAdd () {
        assertEquals(21, calculator.add(14, 7));
    }

    @Test
    public void canSubtract () {
        assertEquals(7, calculator.subtract(14, 7));
    }

    @Test
    public void canMultiply () {
        assertEquals(21, calculator.multiply(3, 7));
    }

    @Test
    public void canDivide () {
        assertEquals(2.0, calculator.divide(14.0, 7.0), 0.01);
    }
}
