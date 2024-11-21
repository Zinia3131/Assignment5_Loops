import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's price for one dollar in Japanese yen: ");
        double yenPerDollar = scanner.nextDouble();


        while (true) {
            System.out.print("Enter an amount in US dollars to convert (or 0 to quit): ");
            double dollars = scanner.nextDouble();

            if (dollars == 0) {
                break;
            }

            double yen = dollars * yenPerDollar;
            System.out.println(dollars + " USD is equivalent to " + yen + " JPY.");
        }

        scanner.close();
    }
}

