import java.util.Scanner;



public class UnitConverter {
    public static void centimetertoinch() {
        System.out.println("Please enter value of centimeter:");
        Scanner scanner = new Scanner(System.in);
        double inputtedNum = scanner.nextDouble();
        System.out.println("Answer: " + inputtedNum / 2.54);
    }

    public static void KGtoPound() {
        System.out.println("Please enter value of Kilogram:");
        Scanner scanner = new Scanner(System.in);
        double inputtedNum = scanner.nextDouble();
        System.out.println("Answer:" + inputtedNum * 2.205);
    }

    public static void celciustoferenheit() {
        System.out.println("Please enter value of Celcius: ");
        Scanner scanner = new Scanner(System.in);
        double inputtedNUM = scanner.nextDouble();
        System.out.println("Answer:" + inputtedNUM * 9 / 5 + 32);

    }


    public static void main(String[] args) {
        while (true) {
            System.out.println("Option 1 : Kilogram - Pound");
            System.out.println("Option 2 : Celcius - Ferenheit");
            System.out.println("Option 3 : Centimeter - inch");

            String option = "Option:";
            System.out.println(option);
            Scanner scanner = new Scanner(System.in);
            String inputtedString = scanner.next();
            if (inputtedString.equals("1")) {
                KGtoPound();
            }
            if (inputtedString.equals("2")) {
                celciustoferenheit();
            }
            if (inputtedString.equals("3")) {
                centimetertoinch();
            }

        }
    }
}


