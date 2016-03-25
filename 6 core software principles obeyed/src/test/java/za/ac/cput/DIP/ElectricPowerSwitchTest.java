package za.ac.cput.DIP;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/24.
 */
public class ElectricPowerSwitchTest {
    Switchable switchableBulb;
    Switchable switchableFan;
    Switch bulbPowerSwitch;
    Switch fanPowerSwitch;

    @Before
    public void setUp() throws Exception {
        switchableBulb   = new LightBulb();
        switchableFan = new Fan();
        bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
    }

    @Test
    public void testPress() throws Exception {
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}
