package za.ac.cput.LSP;

/**
 * Created by LILO on 2016/03/25.
 */
public class Bicycle extends DeviceWithoutEngines {
    @Override
    public void startMoving() {
        super.startMoving();
        System.out.print("Bicycle: Bicycle is moving");

    }
}
