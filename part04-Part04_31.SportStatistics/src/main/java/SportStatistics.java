
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String queriedTeam = scan.nextLine();

        int gameCount = 0, wins = 0, losses = 0;

        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {

                String row = fileReader.nextLine();

                if (row.isEmpty()) {
                    continue;
                }

                String[] details = row.split(",");
                String homeTeam = details[0];
                String visitTeam = details[1];
                int homePoints = Integer.valueOf(details[2]);
                int visitPoints = Integer.valueOf(details[3]);
                boolean isWinner = false;

                // increase game count if queried team matches home or visit

                if (queriedTeam.equals(homeTeam)) {
                    gameCount++;
                    isWinner = homePoints - visitPoints > 0 ? true : false;

                } else if (queriedTeam.equals(visitTeam)) {
                    gameCount++;
                    isWinner = visitPoints - homePoints > 0 ? true : false;
                } else {
                    continue;
                }

                if (isWinner) {
                    wins++;
                } else {
                    losses++;
                }

            }

            System.out.println("Games: " + gameCount);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Reading " + file + " failed.");
        }

    }

}
