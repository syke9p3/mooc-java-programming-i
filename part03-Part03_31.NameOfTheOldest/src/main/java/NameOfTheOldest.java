
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldest_name = "";
        int oldest = 0;

        while (true) {
            String data = scanner.nextLine();

            if (data.equals("")) {
                break;
            }

            String[] props = data.split(",");

            String name = props[0]; 
            int age = Integer.valueOf(props[1]); 

            if (age > oldest) {
                oldest = age;
                oldest_name = name;
            }
        }
        
        System.out.println("Name of the oldest: " + oldest_name);

    }
}
