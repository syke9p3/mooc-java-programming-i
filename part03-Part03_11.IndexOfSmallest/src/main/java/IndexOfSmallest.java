
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {

            int number = Integer.valueOf(scanner.nextLine());

            if (number == 9999) {
                break;
            }

            list.add(number);
        }

        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        // 1. find smallest
        int smallest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }

        System.out.println("Smallest number: " + smallest);

        // 2. find the indices

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }

        // my other solution would be to store the indices of the smallest number in a list
        // then reset the list if another smaller number was found

        
    }
}
