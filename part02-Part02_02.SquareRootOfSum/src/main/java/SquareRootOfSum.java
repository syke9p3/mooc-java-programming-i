
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first num:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter second num:");
        int second = Integer.valueOf(scanner.nextLine());

        double squareRoot = Math.sqrt(first + second);
        System.out.println(squareRoot);


    }
}
