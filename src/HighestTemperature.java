import java.util.Scanner;

public class HighestTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store month names
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        // Array to store temperatures for each month
        double[] temperatures = new double[12];

        // Read temperatures for each month
        System.out.println("Enter the temperatures for each month:");
        for (int i = 0; i < 12; i++) {
            System.out.print(months[i] + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Find the month with the highest temperature
        double highestTemperature = temperatures[0];
        int highestMonthIndex = 0;

        for (int i = 1; i < 12; i++) {
            if (temperatures[i] > highestTemperature) {
                highestTemperature = temperatures[i];
                highestMonthIndex = i;
            }
        }

        // Print the result
        System.out.println("The month with the highest temperature is "
                + months[highestMonthIndex]
                + " with a temperature of "
                + highestTemperature + "°C.");

        scanner.close();
    }
}

