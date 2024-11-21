import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a set of numbers (type 'done' to finish):");

        boolean first = true;
        double minimum = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();

                if (first) {
                    minimum = value;
                    first = false;
                } else if (value < minimum) {
                    minimum = value;
                }
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number or 'done' to finish.");
            }
        }

        if (!first) {
            System.out.println("The minimum value is: " + minimum);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}

