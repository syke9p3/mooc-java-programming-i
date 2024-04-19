
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        int to, from;

        System.out.print("Where to?");
        to = Integer.valueOf(scanner.nextLine());

        System.out.print("Where from?");
        from = Integer.valueOf(scanner.nextLine());

        if (to >= from) {
            for (int i = from; i <= to; i++) {
                System.out.println(i);
            }
        }

    }
}
