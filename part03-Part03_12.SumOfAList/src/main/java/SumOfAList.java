
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // perform the calculation of the sum of the numbers in the list here

        int sum = 0;

        for (int num : list) {
            sum = sum + num;
        }

        System.out.println("Sum: " + sum);
    }
}
