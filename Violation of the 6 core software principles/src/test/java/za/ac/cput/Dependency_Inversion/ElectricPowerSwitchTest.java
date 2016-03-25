package za.ac.cput.Dependency_Inversion;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/24.
 */
public class ElectricPowerSwitchTest {
    LightBulb bulb;
    ElectricPowerSwitch powerSwitch;

    @Before
    public void setUp() throws Exception {
        bulb = new LightBulb();
        powerSwitch = new ElectricPowerSwitch(bulb);

    }

    @Test
    public void testPress() throws Exception {
        powerSwitch.press();
    }
}
