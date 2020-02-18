package week7;

public class MainSensor {
    public static void main(String[] args) {
        Constant constant = new Constant(10);
        Constant constant2 = new Constant(12);
        System.out.println("A constant measure " + constant.measure());

        Thermometer thermometer = new Thermometer();
        thermometer.off();
        thermometer.measure();

        Average average = new Average();
        average.addSensor(constant);
        average.addSensor(constant2);
        average.addSensor(thermometer);
        System.out.println();
        if(average.isOn()==true){
            System.out.println("toti senzorii sunt on");
        }else System.out.println("Nu toti senzorii sunt on");
        average.on();
        System.out.println();
        average.off();
        System.out.println();
        System.out.println(average.measure());

    }
}
