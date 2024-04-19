import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner input = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = input.nextLine();

            if(title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(input.nextLine());
            
            System.out.println("Publication Year:");
            int year = Integer.valueOf(input.nextLine());

            Book book = new Book(title, pages, year);

            books.add(book);
            
        }

        System.out.print("What information will be printed? ");
        String print = input.nextLine();

        for (Book book : books) {
            if (print.equals("everything")) {
                System.out.println(book);
            } else if (print.equals("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}
