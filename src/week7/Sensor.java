package week7;

public interface Sensor {
    // returns true if the sensor is on
    boolean isOn();

    // switches the sensor on
    void on();

    // switches the sensor off
    void off();

    // returns the sensor reading if the sensor is on // if the sensor is off, it throws an exception
    int measure();
}

