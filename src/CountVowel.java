import java.util.Scanner;

public class CountVowel{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if ("aeiouy".indexOf(ch) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }
}

