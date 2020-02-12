package week7;

public class MainSensor {
    public static void main(String[] args) {
        Constant constant=new Constant(10);
        System.out.println("A constant measure "+ constant.measure());

        Thermometer thermometer=new Thermometer();
        thermometer.off();
        System.out.println("Random int between -30 and 30: " + thermometer.measure());

        Average average=new Average();
        average.addSensor(constant);
        average.addSensor(thermometer);
    }
}
