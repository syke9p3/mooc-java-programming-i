
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0, second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            System.out.println("");

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (amount <= 0) continue;

            if (command.equals("add")) {

                if (first + amount > 100) {
                    first = 100;
                    continue;
                } 

                first = first + amount;

            } else if (command.equals("move")) {

                int amountToMove = 0;

                if (first - amount < 0) {
                    amountToMove = first;
                    first = 0;
                } else {
                    amountToMove = amount;
                    first = first - amount;
                }

                if (second + amountToMove > 100) {
                    second = 100;
                    continue;
                }

                second = second + amountToMove;
                continue;
                
            } else if (command.equals("remove")) {
                
                if (second - amount < 0) {
                    second = 0;
                    continue;
                } 

                second = second - amount;
            }

        }
    }

}
