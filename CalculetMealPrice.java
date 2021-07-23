import java.util.Scanner;
public class CalculetMealPrice {

    public static double calculatetotalMealPrice (double listedMealPrice, double tiprate, double taxrate){
        double tip = tiprate * listedMealPrice;
        double tax = taxrate * listedMealPrice;
        double result = listedMealPrice + tip+ tax;
        return result;
    }

    public static void main(String[] args) {

        double grouptotlmealprice = calculatetotalMealPrice(100,.2,.8);
        System.out.println(grouptotlmealprice);
        double individualtotalmealprice = grouptotlmealprice /5;
        System.out.println(individualtotalmealprice);
    }
}
