package week1;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type in a radius: ");
        double Radius = reader.nextDouble();

        System.out.println("Circumference of the circle: " + 2 * Math.PI * Radius );
    }
}
