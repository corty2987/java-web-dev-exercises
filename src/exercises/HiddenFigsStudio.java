package exercises;
import java.util.HashMap;
import java.util.Map;

public class HiddenFigsStudio {

    public static void main(String[] args) {
        HashMap<Character, Integer> letters = new HashMap<>();
        String hidden = "If the product of two terms is zero then common " +
                "sense says at least one of the two terms has to be zero to" +
                " start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. Once you’ve done " +
                "that, it’s pretty straightforward from there.";

        char[] charactersInString = hidden.toLowerCase().toCharArray();

        for (char letter : charactersInString) { //loop through the string
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1); //add new character
            } else {
                letters.put(letter, 1); //add new count to each character
            }
        }
        for (Map.Entry<Character, Integer> characters : letters.entrySet()) {
            System.out.println(characters.getKey() + ": " + characters.getValue());

        }
    }
}
