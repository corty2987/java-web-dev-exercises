package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String aliceChapter = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println(aliceChapter.toLowerCase());

        System.out.println("Search for a term within the paragraph:");

        String searchTerm = input.nextLine();

        System.out.println(aliceChapter.contains(searchTerm.toLowerCase()));
        {

            if (aliceChapter.toLowerCase().contains(searchTerm.toLowerCase())) {

                System.out.println("Yes, the paragraph does contain that word!");

            } else {

                System.out.println("Sorry, that word is not in this paragraph.");

            }

        }
        {
            Integer index = aliceChapter.indexOf(searchTerm);
            Integer length = searchTerm.length();

            System.out.println("The word first appears at index " + index + ". The word is " + length + " letters long.");
            String newSentence = aliceChapter.replace(searchTerm, "(REMOVED)");
            System.out.println(newSentence);
        }


        input.close();
    }

}
