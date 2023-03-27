package exercises;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();

        System.out.println("How much gas (in gallons) have you used?");
        Double gas = input.nextDouble();

        Double mpg = miles / gas;
        System.out.println("Your miles-per gallon is: " + mpg + "mpg");

        input.close();


    }
}
