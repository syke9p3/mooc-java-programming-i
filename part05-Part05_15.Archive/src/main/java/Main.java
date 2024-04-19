
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> archive = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.equals("")) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            // Create new item
            Item newItem = new Item(identifier, name);

            // check if item exists
            if (itemExists(newItem, archive)) {
                continue;
            }

            archive.add(newItem);
        }

        System.out.println("==Items==");
        for (Item item : archive) {
            System.out.println(item);
        }

    }

    public static boolean itemExists(Item newItem, ArrayList<Item> archive) {
        for (Item item : archive) {
            if (newItem.equals(item)) {
                return true;
            } 
            
            continue;
        }

        return false;
    }
}
