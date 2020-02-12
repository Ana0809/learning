package week7;

import java.util.Random;

public class Thermometer implements Sensor{
    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        Random r = new Random();
        int low = -30;
        int high = 30;
        int result = r.nextInt(high - low) + low;
        return result;
    }
}
