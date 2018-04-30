import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


//Create a water bottle class with a volume property.

public class WaterBottleTest {

    private WaterBottle testWaterBottle;


    @Before
    public void before() {
        testWaterBottle = new WaterBottle(100);
    }
//The volume should start at 100.

    @Test
    public void hasVolume() {
        assertEquals(100, testWaterBottle.getVolume());
    }
    //Add a drink function that takes 10 from the volume each time it is called.
    @Test
    public void drinkReducedVolumeBy10(){
        testWaterBottle.drink();
        assertEquals(90, testWaterBottle.getVolume());
    }
    //Create an empty function that brings the volume down to 0.
    @Test
    public void empty(){
        testWaterBottle.empty();
        assertEquals(0, testWaterBottle.getVolume());
    }
    // Create a fill function that fills the volume back to 100.
    @Test
    public void fill(){
        testWaterBottle.fill();
        assertEquals(100, testWaterBottle.getVolume());
    }


}
