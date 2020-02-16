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
        return true;
    }

    @Override
    public void on() {
        System.out.println("Average sensor on");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).isOn() + " " + array.get(i).toString());  //before
            Boolean s = array.get(i).isOn();
            if (!s) {
                s = true;
                System.out.println(s + " " + array.get(i).toString() + " sensor on");

            }
        }

    }

    @Override
    public void off() {
        System.out.println("Average sensor off");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).isOn() + " " + array.get(i).toString());  //before
            Boolean s = array.get(i).isOn();
            if (s) {
                s = false;
                System.out.println(s + " " + array.get(i).toString()+" sensor off");

            }
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
//        for(int i=0;i<array.size();i++){
//            System.out.println(array.get(i).toString());
//        }
    }
}
