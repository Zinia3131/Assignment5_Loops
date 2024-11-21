import java.util.Scanner;

public class SquareAsterisks {
    public static void main(String[] args) {
        // Read the side length from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side length: ");
        int n = scanner.nextInt();

        // Loop to print the filled and hollow square side by side
        for (int i = 0; i < n; i++) {
            // Print filled square part
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.print(" "); // Space between squares

            // Print hollow square part
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }
        scanner.close();
    }
}

