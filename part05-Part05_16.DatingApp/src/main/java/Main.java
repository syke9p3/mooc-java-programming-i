import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(28, 2, 2015);
        System.out.println(date);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String x = scanner.nextLine();

            date.advance(3);
            System.out.println(date);
            
        }

    }
}
