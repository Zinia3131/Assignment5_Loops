import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of integers (enter a non-integer to stop):");

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < smallest) smallest = number;
            if (number > largest) largest = number;
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        scanner.close();
    }
}

