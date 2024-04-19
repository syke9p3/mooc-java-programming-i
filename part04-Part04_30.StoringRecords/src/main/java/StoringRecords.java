
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records

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

                Person person = new Person(name, age);
                
                persons.add(person);
        
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


        return persons;

    }
}
