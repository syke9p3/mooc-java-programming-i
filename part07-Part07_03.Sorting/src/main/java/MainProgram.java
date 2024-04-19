
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

    }

    public static int smallest(int[] array){
        // write your code here

        int smallest = array[0];

        for (int num: array) {
            if (num < smallest) smallest = num;  
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        // write your code here
        int indexOfSmallest = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i;  
            } 
                
        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int indexOfSmallest = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[indexOfSmallest]) {
                indexOfSmallest = i;  
            } 
                
        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void sort(int[] array) {
        for (int i=0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    } 

   

}
