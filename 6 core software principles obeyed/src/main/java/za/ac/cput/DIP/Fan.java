package za.ac.cput.DIP;

/**
 * Created by LILO on 2016/03/24.
 */
public class Fan implements  Switchable{
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }

    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}
