import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isonrepeat = true;
        while (isonrepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off repeat, if so answer yes:");
            String userInput = input.next();
            if (userInput.equals("yes")) {
                isonrepeat = false;
                System.out.println("Playing next song");
            }


        }
    }
}