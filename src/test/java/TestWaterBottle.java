import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle();
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canDrink() {
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }
}
