/**
 * Created by jc320680 on 29/08/17.
 */
import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        String firstName;
        String secName;
        String thirdName;
    Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter first name");
        firstName = userInput.nextLine();
        System.out.println("Please enter second name");
        secName = userInput.nextLine();
        System.out.println("Please enter thrid name");
        thirdName = userInput.nextLine();
        System.out.println("The combinations are:");
        System.out.println(firstName + " " + secName);
        System.out.println(firstName + " " + thirdName);
        System.out.println(secName + " " + firstName);
        System.out.println(secName + " " + thirdName);
        System.out.println(thirdName + " " + firstName);
        System.out.println(thirdName + " " + secName);




    }
}
