package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?");
        int length = input.nextInt();

        Scanner nextInput = new Scanner(System.in);

        System.out.println("what is the width of the rectangle?");
        int width = nextInput.nextInt();

        int area = length * width;

        System.out.println("The area of the rectangle is " + area + "ft");

        input.close();



    }
}
