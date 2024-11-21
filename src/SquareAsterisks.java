import java.util.Scanner;

public class SquareAsterisks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side length: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.print(" ");

            // Print hollow square part
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}

