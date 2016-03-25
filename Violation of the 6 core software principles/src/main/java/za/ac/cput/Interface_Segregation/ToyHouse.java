package za.ac.cput.Interface_Segregation;

/**
 * Created by LILO on 2016/03/24.
 */
public class ToyHouse implements Toy {
    double price;
    String color;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.print("Not all toys created can move!\n");
    }

    public void fly() {
        System.out.print("Not all toys created can fly!");
    }
}
