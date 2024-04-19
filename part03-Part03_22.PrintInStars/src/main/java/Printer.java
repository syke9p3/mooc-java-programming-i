
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here

        for (int i = 0; i < array.length; i++) {

            // print the number of stars equal to the number inside the current array index
            // each j represents a star, so j = 1 means the first star
            for (int j = 1; j <= array[i]; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

}
