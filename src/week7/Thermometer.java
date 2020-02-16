package week7;

import java.util.Random;

public class Thermometer implements Sensor {
    boolean b = true;
    @Override
    public String toString(){
        return "thermometer";
    }
    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void on() {
        System.out.println("Thermometer sensor on");
    }

    @Override
    public void off() {
        System.out.println("Thermometer is off");
        b = isOn();
    }

    @Override
    public int measure() {
        int result = 0;
        if (b) {
            Random r = new Random();
            int low = -30;
            int high = 30;
            result = r.nextInt(high - low) + low;
            System.out.println("A random int between -30 and 30: " + result);
        } else {
            try {
                throw new NoSuchMethodException();
            } catch (NoSuchMethodException e) {
                System.out.println("you can not measure, thermometer is off");
            }
        }
        return result;
    }
}
