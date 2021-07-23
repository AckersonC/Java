import java.util.Scanner;

public class MultipleQuestion {
    public static void main(String[] args) {
        String question = "What is the answer to 20 - 14 + 5";
        String option1 = "12";
        String option2 = "11";
        String option3 = "13";
        String option4 = "10";
        String correctanswer = option2;
        System.out.println(question);
        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);
        System.out.println(option4);
        System.out.println("Answer: ");
        Scanner scanner = new Scanner(System.in);
        String inputtedNum = scanner.next();
        if (correctanswer.equals(inputtedNum)) {


            System.out.println("Congratulations!");
        } else {
            System.out.println("Too bad, the answer is 11");

        }
    }


}