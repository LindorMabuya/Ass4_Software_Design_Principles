package za.ac.cput.Liskov_Substitution;

/**
 * Created by LILO on 2016/03/24.
 */
public class Bicycle extends  TransportationDevice{
    public Bicycle() {
    }

    @Override
    void startEngine() {
        super.startEngine();
        System.out.print("Bicycle: Bicycles do not have engines");
    }
}
