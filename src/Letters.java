import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Letters {
    /**
     * @param readText - this value contains the text (charter), which saves on the computer;
     * @return - array of integer, which contains numbers letters using in the text;
     * @throws IOException - exception, which thrown when bufferedReader is mistaken
     */
    public static HashMap<Character, Integer> findLetters(BufferedReader readText) throws IOException {
        HashMap<Character, Integer> letters = new HashMap<>();
        int a = 0, e = 0, i = 0, o = 0, y = 0, u = 0;
        letters.put('a', a);
        letters.put('e', e);
        letters.put('i', i);
        letters.put('o', o);
        letters.put('y', y);
        letters.put('u', u);
        String line;
        while ((line = readText.readLine()) != null) {
            char[] line1 = line.toCharArray();
            for (char value : line1) {
                if (value == 'a') {
                    letters.replace('a', a++);
                }
                if (value == 'e') {
                    letters.replace('e', e++);
                }
                if (value == 'i') {
                    letters.replace('i', i++);

                }
                if (value == 'o') {
                    letters.replace('o', o++);

                }
                if (value == 'y') {
                    letters.replace('y', y++);
                }
                if (value == 'u') {
                    letters.replace('u', u++);
                }
            }
        }
        return letters;
    }

    /**
     * @param read - this value contains the text(in bytes), which saves on the computer;
     * @return - array of longer, which contains numbers letters using in the text;
     * @throws IOException - exception, which thrown when BufferedInputStream is mistaken
     */
    public static HashMap<Character, Integer> findLettersInputStream(BufferedInputStream read) throws IOException {
        HashMap<Character, Integer> letters = new HashMap<>();
        int a = 0, e = 0, i = 0, o = 0, y = 0, u = 0, number;
        letters.put('a', a);
        letters.put('e', e);
        letters.put('i', i);
        letters.put('o', o);
        letters.put('y', y);
        letters.put('u', u);
        while ((number = read.read()) != -1) {
            if ((char) number == 'a') {
                letters.replace('a', a++);
            }
            if ((char) number == 'e') {
                letters.replace('e', e++);
            }
            if ((char) number == 'i') {
                letters.replace('i', i++);
            }
            if ((char) number == 'o') {
                letters.replace('o', o++);
            }
            if ((char) number == 'y') {
                letters.replace('y', y++);
            }
            if ((char) number == 'u') {
                letters.replace('u', u++);
            }
        }
        return letters;
    }
}
