import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubstringsByLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        ArrayList<String> substrings = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                substrings.add(word.substring(i, j));
            }
        }

        Collections.sort(substrings, (a, b) -> Integer.compare(a.length(), b.length()));

        for (String substring : substrings) {
            System.out.println(substring);
        }

        scanner.close();
    }
}

