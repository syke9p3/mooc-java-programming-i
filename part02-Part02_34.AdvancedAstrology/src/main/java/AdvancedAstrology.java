
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise

        int i = 1;

        while (i <= number) {
            System.out.print("*");
            i++;
        }

        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise

        int i = 1;

        while (i <= number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise

        int i = 1;

        while (i <= size) {
            printSpaces(size - i);
            printStars(i);
            i++;
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise

        int i = 0;

        while (i < height) {
            printSpaces(height - i - 1);
            printStars((i*2)+1);
            i++;
        }

        int j = 0;
        while (j < 2) {
            printSpaces(height - 2);
            printStars(3);
            j++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printStars(3);
        printSpaces(3);
        printStars(3);
        System.out.println("---");

        printTriangle(5);
        System.out.println("Christmas tree:");
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
