import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;

public class Letters {
    /**
     * @param readText - this value contains the text (charter), which saves on the computer;
     * @return - array of integer, which contains numbers letters using in the text;
     * @throws IOException - exception, which thrown when bufferedReader is mistaken
     */
    public static int[] findLetters(BufferedReader readText) throws IOException {
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int y = 0;
        int u = 0;
        String line;
        while ((line = readText.readLine()) != null) {
            char[] line1 = line.toCharArray();
            for (char value : line1) {
                if (value == 'a') {
                    a++;
                }
                if (value == 'e') {
                    e++;
                }
                if (value == 'i') {
                    i++;
                }
                if (value == 'o') {
                    o++;
                }
                if (value == 'y') {
                    y++;
                }
                if (value == 'u') {
                    u++;
                }
            }
        }
        return new int[]{a, e, i, o, y, u};
    }

    /**
     * @param read - this value contains the text(in bytes), which saves on the computer;
     * @return - array of longer, which contains numbers letters using in the text;
     * @throws IOException - exception, which thrown when BufferedInputStream is mistaken
     */
    public static long[] findLettersInputStream(BufferedInputStream read) throws IOException {
        long a = 0;
        long e = 0;
        long i = 0;
        long o = 0;
        long y = 0;
        long u = 0;
        long z;
        while ((z = read.read()) != -1) {
            if ((char) z == 'a') {
                a++;
            }
            if ((char) z == 'e') {
                e++;
            }
            if ((char) z == 'i') {
                i++;
            }
            if ((char) z == 'o') {
                o++;
            }
            if ((char) z == 'y') {
                y++;
            }
            if ((char) z == 'u') {
                u++;
            }
        }
        return new long[]{a, e, i, o, y, u};
    }

    public static String[] returnString() {
        String[] letters = {"a", "e", "i", "o", "y", "u"};
        String[] fullName = new String[letters.length];
        for (int i = 0; i < letters.length; i++) {
            fullName[i] = "Numbers of " + letters[i] + " is ";
        }
        return fullName;
    }
}
