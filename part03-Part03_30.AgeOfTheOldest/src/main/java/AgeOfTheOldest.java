
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true) {
            String data = scanner.nextLine();

            if (data.equals("")) {
                break;
            }

            String[] props = data.split(",");

            int age = Integer.valueOf(props[1]); 

            if (age > oldest) {
                oldest = age;
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);

    }
}
