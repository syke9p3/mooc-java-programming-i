
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longest_name = "";
        int longest_name_length = 0;
        int count = 0;
        int sum = 0;

        while (true) {
            String data = scanner.nextLine();

            if (data.equals("")) {
                break;
            }

            String[] props = data.split(",");

            String name = props[0]; 
            int year = Integer.valueOf(props[1]); 

            if (name.length() > longest_name_length) {
                longest_name_length = name.length();
                longest_name = name;
            }

            sum = sum + year;
            count++;
        }
        
        System.out.println("Longest name: " + longest_name);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
