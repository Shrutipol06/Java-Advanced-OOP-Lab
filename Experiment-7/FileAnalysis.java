import java.io.File;
import java.util.Scanner;

public class FileAnalysis {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            Scanner sc = new Scanner(file);

            int vowels = 0, words = 0, countA = 0;

            while (sc.hasNextLine()) {
                String line = sc.nextLine().toLowerCase();

                // Count words
                String[] wordArray = line.split("\\s+");
                words += wordArray.length;

                // Count vowels and 'a'
                for (char ch : line.toCharArray()) {
                    if ("aeiou".indexOf(ch) != -1) {
                        vowels++;
                    }
                    if (ch == 'a') {
                        countA++;
                    }
                }
            }

            sc.close();

            System.out.println("Total Vowels: " + vowels);
            System.out.println("Total Words: " + words);
            System.out.println("Count of 'a': " + countA);

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}