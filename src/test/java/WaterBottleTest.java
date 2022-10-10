import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;
    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void startingVolumeShouldBe100(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkFunction(){
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80,waterBottle.getVolume());
    }

    @Test
    public void emptyFunction(){
        waterBottle.empty();
        assertEquals(0,waterBottle.getVolume());
    }

    @Test
    public void fillFunction(){
        waterBottle.fill();
        assertEquals(100,waterBottle.getVolume());
    }
}
