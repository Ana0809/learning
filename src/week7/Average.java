package week7;

import java.util.ArrayList;
import java.util.List;

public class Average implements Sensor {
    List<Sensor> array = new ArrayList<>();

    @Override
    public String toString() {
        return "average";
    }

    @Override
    public boolean isOn() {
        int countTrue = 0;
        for (int i = 0; i < array.size(); i++) {                                  //The average sensor is on when all of it’s sensors are on
            Boolean s = array.get(i).isOn();
            if (s) countTrue++;
        }
        if (countTrue == array.size()) {
            return true;
        } else return false;
    }

    @Override
    public void on() {
        System.out.println("When the average sensor switched on all of its sensors are switched on if not already on");
            for (int i = 0; i < array.size(); i++) {
                array.get(i).on();
            }
    }

    @Override
    public void off() {
        System.out.println("Average sensor off");
        for (int i = 0; i < array.size(); i++) {
            array.get(i).off();
        }
    }

    @Override
    public int measure() {
        int mean = 0;
        int aux = 0;
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).isOn());
            if (array.get(i).isOn()) {
                aux += array.get(i).measure();
                mean = aux / array.size();
            } else {
                try {
                    throw new ArithmeticException();
                } catch (ArithmeticException e) {
                    System.out.println("At least one sensor is off");
                }
            }
        }
        return mean;
    }

    public void addSensor(Sensor s) {
        array.add(s);

    }
}
