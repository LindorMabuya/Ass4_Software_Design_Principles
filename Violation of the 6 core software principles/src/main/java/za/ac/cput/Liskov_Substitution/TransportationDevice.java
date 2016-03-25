package za.ac.cput.Liskov_Substitution;

import com.sun.xml.internal.ws.api.pipe.Engine;

/**
 * Created by LILO on 2016/03/24.
 */
public class TransportationDevice {
    private String name;
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    private double speed;
    double getSpeed() {
        return speed;
    }
    void setSpeed(double speed) {
        this.speed = speed;
    }

    private Engine engine;
    Engine getEngine() {
        return engine;
    }
     void setEngine(Engine engine) {
        this.engine = engine;
    }

    void startEngine(){
    }
}
