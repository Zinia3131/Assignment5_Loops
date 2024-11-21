import java.util.Scanner;

public class DataSetProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataSet dataSet = new DataSet();

        // Prompt the user to enter the values
        System.out.println("Enter a set of floating-point values (type 'done' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                dataSet.add(value);
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number or 'done' to finish.");
            }
        }

        // Print the results
        System.out.println("Average: " + dataSet.getAverage());
        System.out.println("Smallest: " + dataSet.getSmallest());
        System.out.println("Largest: " + dataSet.getLargest());
        System.out.println("Range: " + dataSet.getRange());

        scanner.close();
    }
}

