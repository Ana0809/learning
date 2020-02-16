package week7;

public class Constant implements Sensor{
    int measuree;

    Constant(int measure){
        this.measuree=measure;
    }

    @Override
    public String toString(){
        return "constant";
    }
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
        System.out.println("Constant sensor on");
    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return measuree;
    }
}
