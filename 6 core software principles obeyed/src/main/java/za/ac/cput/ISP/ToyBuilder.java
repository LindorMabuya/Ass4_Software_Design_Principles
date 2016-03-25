package za.ac.cput.ISP;

/**
 * Created by LILO on 2016/03/24.
 */
public class ToyBuilder {
    public static ToyHouse buildToyHouse(){
        ToyHouse toyHouse = new ToyHouse();
        toyHouse.setPrice(15.00);
        toyHouse.setColor("green");
        return  toyHouse;
    }
    public static ToyCar buildToyCar(){
        ToyCar toyCar = new ToyCar();
        toyCar.setPrice(25.00);
        toyCar.setColor("blue");
        toyCar.move();
        return toyCar;
    }
    public static ToyPlane buildToyPlane(){
        ToyPlane toyPlane = new ToyPlane();
        toyPlane.setPrice(200.00);
        toyPlane.setColor("red");
        toyPlane.move();
        toyPlane.fly();
        return  toyPlane;
    }
}
