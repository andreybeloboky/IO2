import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LettersCalculator {
    /**
     * @param letters - map which saving vowel letters;
     */
   private static void makeVowels(HashMap<Character, Integer> letters) {
        letters.put('a', 0);
        letters.put('e', 0);
        letters.put('i', 0);
        letters.put('o', 0);
        letters.put('y', 0);
        letters.put('u', 0);
    }

    /**
     * @param readText - this value contains the text (charter), which saves on the computer;
     * @return - array of integer, which contains numbers letters using in the text;
     * @throws IOException - exception, which thrown when bufferedReader is mistaken
     */
    public static HashMap<Character, Integer> countVowels(BufferedReader readText) throws IOException {
        HashMap<Character, Integer> letters = new HashMap<>();
        makeVowels(letters);
        String line;
        while ((line = readText.readLine()) != null) {
            char[] chars = line.toCharArray();
            for (char value : chars) {
                incrementIfExists(letters, value);
            }
        }
        return letters;
    }

    /**
     * @param read - this value contains the text(in bytes), which saves on the computer;
     * @return - array of longer, which contains numbers letters using in the text;
     * @throws IOException - exception, which thrown when BufferedInputStream is mistaken
     */
    public static HashMap<Character, Integer> optimizedCountVowels(BufferedInputStream read) throws IOException {
        HashMap<Character, Integer> letters = new HashMap<>();
        makeVowels(letters);
        int number;
        while ((number = read.read()) != -1) {
            incrementIfExists(letters, number);
        }
        return letters;
    }

    /**
     * @param letters - map which saving vowel letters;
     * @param number  is byte from file;
     */
    public static void incrementIfExists(HashMap<Character, Integer> letters, int number) {
        if (letters.containsKey((char) number)) {
            letters.replace((char) number, letters.get((char) number) + 1);
        }
    }
}
