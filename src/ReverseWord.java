import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the word from the user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Print the word in reverse
        String reversedWord = new StringBuilder(word).reverse().toString();
        System.out.println("Reversed word: " + reversedWord);

        scanner.close();
    }
}

