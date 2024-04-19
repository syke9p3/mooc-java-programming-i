
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

        // Create Paul's card. The opening balance of the card is 20 euros
        PaymentCard paul = new PaymentCard(20);

        // Create Matt's card. The opening balance of the card is 30 euros
        PaymentCard matt = new PaymentCard(30);

        // Paul eats heartily
        paul.eatHeartily();

        // Matt eats affordably
        matt.eatAffordably();

        // The cards' values ​​are printed (each on its own line, with the cardholder
        // name at the beginning of it)
        System.out.println("Paul: " + paul);
        System.out.println("Matt: " + matt);

        // Paul tops up 20 euros
        paul.addMoney(20);

        // Matt eats heartily
        matt.eatHeartily();

        // The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
        System.out.println("Paul: " + paul);
        System.out.println("Matt: " + matt);

        // Paul eats affordably
        paul.eatAffordably();
        
        // Paul eats affordably
        paul.eatAffordably();
        
        // Matt tops up 50 euros
        matt.addMoney(50);
        
        // The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
        System.out.println("Paul: " + paul);
        System.out.println("Matt: " + matt);

    }
}
