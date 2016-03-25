package za.ac.cput.LSP;

/**
 * Created by LILO on 2016/03/25.
 */
public class Car extends DeviceWithEngines {
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.print("Car: Car engine started\n");

    }
}
