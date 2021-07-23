
import java.util.Scanner;

public class TriangleClac {

    public static void main(String[] args) {

        System.out.println("Let's calculate the area of a triangle");

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the base of the triangle (in centimeters):");
        double base = input.nextDouble();

        while (base <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in centimeters):");
            base = input.nextDouble();
        }

        System.out.println("Please input the height of the triangle (in centimeters):");
        double height = input.nextDouble();
        while (height <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in centimeters):");
            height = input.nextDouble();
        }

        double area = (base * height) / 2;
        System.out.println("The area is " + area + " centimeters");

    }
}