
public class MainProgram {

    public static void main(String[] args) {
        // test your class here

        Money one = new Money(1, 50);
        Money two = new Money(1, 50);

        System.out.println(two.lessThan(one));
    }
}
