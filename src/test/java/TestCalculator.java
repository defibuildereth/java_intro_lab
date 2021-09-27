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
}
