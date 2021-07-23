import java.util.Scanner;
public class If {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10:");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();
        if (inputtedNum < 5) {
            System.out.println("HelloWorld");
        } else {
            System.out.println("WorldHello");
        }
    }






}
