
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String pass = scanner.nextLine();

        if (user.equals("alex") && pass.equals("sunshine")
                || user.equals("emma") && pass.equals("haskell")

        ) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or passowrd!");
        }

    }
}
