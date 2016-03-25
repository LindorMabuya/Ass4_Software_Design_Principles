package za.ac.cput.Liskov_Substitution;

/**
 * Created by LILO on 2016/03/24.
 */
public class Car extends TransportationDevice {
    public Car() {
    }

    @Override
    void startEngine() {
        super.startEngine();
        System.out.print("Car: Car engine started\n");

    }
}
