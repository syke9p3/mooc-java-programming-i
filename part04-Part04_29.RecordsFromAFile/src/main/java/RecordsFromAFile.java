
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");

        String file = scanner.nextLine();


        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
        
                // if the line is blank we do nothing
                if (line.isEmpty()) {
                    continue;
                }
        
                // do something with the data
                String[] attributes = line.split(",");
                String name = attributes[0]; 
                int age = Integer.valueOf(attributes[1]);
                

                System.out.println(name + ", age: " + age + (age == 1 ? " year" : " years"));
        
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
