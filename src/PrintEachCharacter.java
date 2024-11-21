import java.util.Scanner;

public class PrintEachCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the word from the user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Print each character of the word on a separate line
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        scanner.close();
    }
}
