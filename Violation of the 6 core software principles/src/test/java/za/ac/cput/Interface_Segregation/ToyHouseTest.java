package za.ac.cput.Interface_Segregation;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/24.
 */
public class ToyHouseTest {
    ToyHouse toyHouse;

    @Before
    public void setUp() throws Exception {
        toyHouse = new ToyHouse();

    }

    @Test
    public void testToys() throws Exception {
        toyHouse.setColor("green");
        toyHouse.move();
        toyHouse.fly();
        Assert.assertEquals(toyHouse.color,"green");
    }
}
