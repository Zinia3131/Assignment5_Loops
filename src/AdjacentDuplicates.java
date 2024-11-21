import java.util.Scanner;

public class AdjacentDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of integers (enter a non-integer to stop):");

        Integer previous = null;
        boolean firstDuplicate = true;

        while (scanner.hasNextInt()) {
            int current = scanner.nextInt();
            if (previous != null && current == previous) {
                if (firstDuplicate) {
                    System.out.print(current);
                    firstDuplicate = false;
                } else {
                    System.out.print(" " + current);
                }
            } else {
                firstDuplicate = true;
            }
            previous = current;
        }

        scanner.close();
    }
}
