package exercises;
import java.util.Scanner;




public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Howdy! Wut's yer name? ");

        String name = input.nextLine();
        System.out.println("Howdy doody " + name + "!");
        input.close();
    }
}
