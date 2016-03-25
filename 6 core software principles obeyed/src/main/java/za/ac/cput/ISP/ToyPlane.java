package za.ac.cput.ISP;

/**
 * Created by LILO on 2016/03/24.
 */
public class ToyPlane implements Toy,Movable,Flyable {
    private double price;
    private String color;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("ToyPlane: Start moving plane.\n");
    }

    public void fly() {
        System.out.println("ToyPlane: Start flying plane.\n");
    }

    @Override
    public String toString() {
        return "ToyPlane{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}'+"\n";
    }
}
