import java.io.*;

public class Main {
    private static Object Charsets;

    public static void main(String[] args) {
        File file = new File("text.txt");
        // big file
        try (BufferedWriter write = new BufferedWriter(new FileWriter(file))) {
            for (long i = 0; i <= 1000000000; i++) {
                write.write("ahahahahahahahahahahahah");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedInputStream read = new BufferedInputStream(new FileInputStream(file), 200)) {
            long[] numbers = Letters.findLettersInputStream(read);
            String[] name = Letters.returnString();
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(name[i] + numbers[i]);
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
            int[] number = Letters.findLetters(readText2);
            String[] name = Letters.returnString();
            for (int i = 0; i < number.length; i++) {
                System.out.println(name[i] + number[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}