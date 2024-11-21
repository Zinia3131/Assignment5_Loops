import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of integers (enter a non-integer to stop):");

        int evenCount = 0, oddCount = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even inputs: " + evenCount);
        System.out.println("Number of odd inputs: " + oddCount);
        scanner.close();
    }
}
