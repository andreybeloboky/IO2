import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Object Charsets;
    public static void main(String[] args) {
        File file = new File("text.txt");
        // big file
        try (BufferedWriter write = new BufferedWriter(new FileWriter(file))) {
            for (long i = 0; i <= 1000000000; i++) {
                write.write("Hello my name is");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedInputStream read = new BufferedInputStream(new FileInputStream(file), 200)) {
            HashMap<Character, Integer> numbers = LettersCalculator.optimizedCountVowels(read);
            for (Map.Entry<Character, Integer> value : numbers.entrySet()) {
                System.out.println(value.getKey() + " " + value.getValue());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        // small file
        File file1 = new File("textSmall.txt");
        try (FileWriter write = new FileWriter(file1);
             BufferedWriter write1 = new BufferedWriter(write)) {
            write1.write("My name's Andrew. Test of textSmall doc" + "\nIt's a new line");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader readText2 = new BufferedReader(new FileReader(file1))) {
            HashMap<Character, Integer> numbers = LettersCalculator.countVowels(readText2);
            for (Map.Entry<Character, Integer> value : numbers.entrySet()) {
                System.out.println(value.getKey() + " " + value.getValue());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}