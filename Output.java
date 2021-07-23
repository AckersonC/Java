import java.util.Scanner;
public class Output {
    public static void main(String[] args) {
        double weight = 46.5;
        System.out.println ("Sam's weight is "+ weight);
        System.out.println("What do you want to update it to:");
        Scanner input = new Scanner (System.in);
        weight = input.nextDouble();
        System.out.println("Sam's weight has been updated to " + weight);
    }
}
