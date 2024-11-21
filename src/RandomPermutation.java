import java.util.Random;
import java.util.Scanner;

public class RandomPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Read the word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Repeat word.length() times
        for (int k = 0; k < word.length(); k++) {
            // Pick a random position i in the word (but not the last position)
            int i = random.nextInt(word.length() - 1);

            // Pick a random position j > i in the word
            int j = random.nextInt(word.length() - i - 1) + i + 1;

            // Swap the letters at positions i and j
            word = swapCharacters(word, i, j);
        }

        // Print the permuted word
        System.out.println("Permuted word: " + word);

        scanner.close();
    }

    // Method to swap characters in the string
    public static String swapCharacters(String word, int i, int j) {
        // Construct substrings: first, middle, last
        String first = word.substring(0, i);
        String middle = word.substring(i + 1, j);
        String last = word.substring(j + 1);

        // Swap the letters at positions i and j and return the new string
        return first + word.charAt(j) + middle + word.charAt(i) + last;
    }
}

