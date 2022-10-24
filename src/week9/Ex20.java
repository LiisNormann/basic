package week9;
import week9.measurements.ConstantSensor;
import week9.measurements.Sensor;
import week9.measurements.Thermometer;

public class Ex20 {
    public static void main(String[] args) {
        Sensor kumpula = new Thermometer();
        kumpula.on();
        System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");
        kumpula.off();
        System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");
    }
}