import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Bird> database;

    public UserInterface(Scanner scanner, ArrayList<Bird> database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() {
        while (true) {

            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Add")) {

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Name in Latin: ");
                String latin = scanner.nextLine();

                Bird bird = new Bird(name, latin);
                database.add(bird);

            } else if (command.equals("Observation")) {

                System.out.print("Name? ");
                String name = scanner.nextLine();

                Bird bird = findBird(database, name); 

                if (bird != null) {
                    bird.addObservation();
                } else {
                    System.out.println("Not a bird!");
                }
                

            } else if (command.equals("All")) {

                for (Bird bird : database) {
                    System.out.println(bird);
                }

            } else if (command.equals("One")) {

                System.out.print("Name? ");
                String name = scanner.nextLine();

                Bird bird = findBird(database, name); 

                if (bird != null) {
                    System.out.println(bird);
                } else {
                    System.out.println("Not a bird!");
                }

            } else if (command.equals("Quit")) {
                break;
            }

        }
    }

    public static Bird findBird(ArrayList<Bird> birds, String name) {
        for (Bird bird : birds) {
            if (name.equals(bird.getName())) return bird;
        }
        return null;
    }

    

}
