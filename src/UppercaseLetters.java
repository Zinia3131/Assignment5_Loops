import java.util.Scanner;

public class UppercaseLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder uppercaseLetters = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseLetters.append(ch);
            }
        }

        System.out.println("Uppercase letters: " + uppercaseLetters);
        scanner.close();
    }
}

