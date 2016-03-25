package za.ac.cput.Dependency_Inversion;

/**
 * Created by LILO on 2016/03/24.
 */
public class ElectricPowerSwitch {
    private LightBulb lightBulb;
    private boolean on;

    public ElectricPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }
    public boolean isOn(){
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if(checkOn){
            lightBulb.turnOff();
            this.on = false;
        }
        else {
            lightBulb.turnOn();
            this.on = true;
        }
    }
}
