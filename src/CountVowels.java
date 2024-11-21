import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = 0;
        for (char ch : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        scanner.close();
    }
}

