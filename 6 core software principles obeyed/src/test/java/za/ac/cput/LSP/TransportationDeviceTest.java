package za.ac.cput.LSP;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/25.
 */
public class TransportationDeviceTest {
    Car myCar;
    Bicycle myBike;

    @Before
    public void setUp() throws Exception {
        myCar = new Car();
        myBike = new Bicycle();

    }

    @Test
    public void testMovement() throws Exception {
        myCar.startEngine();
        myBike.startMoving();
    }
}
