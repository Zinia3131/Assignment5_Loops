import java.util.Scanner;

public class EverySecondLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder secondLetters = new StringBuilder();
        for (int i = 1; i < input.length(); i += 2) {
            secondLetters.append(input.charAt(i));
        }

        System.out.println("Every second letter: " + secondLetters);
        scanner.close();
    }
}

