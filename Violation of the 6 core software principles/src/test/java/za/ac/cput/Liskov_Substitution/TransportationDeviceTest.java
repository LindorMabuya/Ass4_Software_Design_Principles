package za.ac.cput.Liskov_Substitution;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/24.
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
    public void testEngine() throws Exception {
        myCar.startEngine();
        myBike.startEngine();
    }
}
