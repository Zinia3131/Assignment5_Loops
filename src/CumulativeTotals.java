import java.util.Scanner;

public class CumulativeTotals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of integers (enter a non-integer to stop):");

        int total = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            total += number;
            System.out.print(total + " ");
        }

        scanner.close();
    }
}

