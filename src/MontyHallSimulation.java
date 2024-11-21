import java.util.Random;

public class MontyHallSimulation {
    public static void main(String[] args) {
        Random rand = new Random();
        int switchWins = 0;
        int stayWins = 0;

        for (int i = 0; i < 1000; i++) {

            int carPosition = rand.nextInt(3) + 1;


            int playerChoice = rand.nextInt(3) + 1;


            int hostChoice = getHostChoice(playerChoice, carPosition, rand);


            if (playerChoice == carPosition) {
                stayWins++;
            } else {
                switchWins++;
            }
        }

        System.out.println("Wins by switching: " + switchWins);
        System.out.println("Wins by staying: " + stayWins);
    }

    public static int getHostChoice(int playerChoice, int carPosition, Random rand) {
        int hostChoice;
        do {
            hostChoice = rand.nextInt(3) + 1;
        } while (hostChoice == playerChoice || hostChoice == carPosition);
        return hostChoice;
    }
}

