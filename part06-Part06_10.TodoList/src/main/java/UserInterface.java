import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList tasks;

    public UserInterface(TodoList tasks, Scanner scanner) {
        this.scanner = scanner;
        this.tasks = tasks;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("list")) {
                list();
            } else if (command.equals("remove")) {
                remove();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    private void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        tasks.add(task);
    }

    private void list() {
        tasks.print();
    }

    private void remove() {
        System.out.print("Which one is removed? ");
        int index = Integer.valueOf(scanner.nextLine());
        tasks.remove(index);

    }

}
