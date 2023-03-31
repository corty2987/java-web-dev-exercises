package exercises;
import java.util.ArrayList;
import java.util.Scanner;



public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> evenNums = new ArrayList<>();
        ArrayList<String> oGList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        evenNums.add(1);
        evenNums.add(2);
        evenNums.add(3);
        evenNums.add(4);
        evenNums.add(5);
        evenNums.add(6);
        evenNums.add(7);
        evenNums.add(8);
        evenNums.add(9);
        evenNums.add(10);
        System.out.println(totalNums(evenNums));

        oGList.add("sport"); //5 letters
        oGList.add("stlsc"); //5 letters
        oGList.add("cards"); //5 letters
        oGList.add("blues"); //5 letters
        oGList.add("not");
        oGList.add("jk");
        oGList.add("broncos");
        oGList.add("nuggets");

        isFiveLetters(oGList); //calling the method and printing 5 letter words.
        //



    }

    public static int totalNums(ArrayList<Integer> arr) {
        int total = 0;

        for (int totalNums : arr) {
            if (totalNums % 2 == 0) {
                total += totalNums;
            }
        }
        return total;
    }


    public static void isFiveLetters(ArrayList<String> arr) {

        for (String word : arr) {
            if (word.length() == 5) {
                System.out.println(word);
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a word length: ");
                int numChars = input.nextInt();

            }
        }

    }
}

