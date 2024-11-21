import java.util.Scanner;

public class CurrencyConversionUsdToJpy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's price for one dollar in Japanese yen: ");
        double yenPerDollar = scanner.nextDouble();

        System.out.println("Enter U.S. dollar values to convert to yen (enter 0 to stop):");
        while (true) {
            System.out.print("Enter an amount in US dollars: ");
            double dollars = scanner.nextDouble();

            if (dollars == 0) {
                break;
            }
            double yen = dollars * yenPerDollar;
            System.out.println(dollars + " USD is equivalent to " + yen + " JPY.");
        }

        System.out.println("Enter yen amounts to convert to U.S. dollars (enter 0 to stop):");
        while (true) {
            System.out.print("Enter an amount in yen: ");
            double yen = scanner.nextDouble();

            if (yen == 0) {
                break;
            }

            double dollars = yen / yenPerDollar;
            System.out.println(yen + " JPY is equivalent to " + dollars + " USD.");
        }
        scanner.close();
    }
}

