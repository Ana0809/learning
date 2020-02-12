package week7;

import java.util.ArrayList;
import java.util.List;

public class Average implements Sensor {
    List<Sensor> array = new ArrayList<>();

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return 0;
    }

    public void addSensor(Sensor s) {
        array.add(s);
    }
}
