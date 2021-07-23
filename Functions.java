import java.util.Scanner;
public class Functions {
    public static void announceDeveloperteatime(){
        System.out.println("Waiting for developer tea-time...");
        System.out.println("Type in a random word and hit enter to start Developer Tea-time!");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's Developer Tea-time!");

    }


    public static void main(String[] args) {
        System.out.println("Welcome to your new job!");
        announceDeveloperteatime();
        System.out.println("Write code.");
        System.out.println("Review code.");
        announceDeveloperteatime();
        System.out.println("Get promoted!");

    }


}
