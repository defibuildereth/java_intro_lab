import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before () {
        printer = new Printer(50, 80);
    }

    @Test
    public void hasPaper () {
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void canPrintTrue () {
        assertEquals(true, printer.canPrint(49));
    }

    @Test
    public void canPrintFalse () {
        assertEquals(false, printer.canPrint(51));
    }

    @Test
    public void sheetsRequired () {
        assertEquals(49, printer.sheetsRequired(7, 7));
    }

    @Test
    public void hasToner () {
        assertEquals(80, printer.getToner());
    }

    @Test
    public void reduceToner () {
        printer.reduceToner(10);
        assertEquals(70, printer.getToner());
    }
}
