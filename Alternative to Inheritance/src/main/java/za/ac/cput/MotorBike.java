package za.ac.cput;

/**
 * Created by LILO on 2016/03/24.
 */
public class MotorBike {
    private Vehicle motorBike;
    public MotorBike() {
    }

    public MotorBike(Vehicle motorBike) {
        this.motorBike = motorBike;
    }

    public int getNumberOfSeats() {
        return 1;
    }

    public int getNumberOfWheels() {
        return 2;
    }

    public String getVehicleType() {
        return "Motor Bike";
    }

    public void move() {
        System.out.print("Motor Bikes are a fast medium of transport.");
    }

    public void drive() {
        System.out.print("You are driving a motor bike.");
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                "motorBike=" + motorBike +
                '}';
    }
}
