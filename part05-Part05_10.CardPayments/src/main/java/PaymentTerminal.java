
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {

        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the
        // change
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment

        double price = 2.50;
        if (payment < price)
            return payment;

        this.affordableMeals++;
        this.money = this.money + price; // profit

        return payment - price; // change
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the
        // change
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment

        double price = 4.30;
        if (payment < price)
            return payment;

        this.money = this.money + price; // profit
        this.heartyMeals++;
        return payment - price;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        double price = 2.50;

        // if the payment card has enough money, the balance of the card is decreased by
        // the price, and the method returns true
        if (card.balance() >= price) {
            this.affordableMeals++;
            return card.takeMoney(price);
        }

        return false;

    }

    
    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        double price = 4.30;

        // if the payment card has enough money, the balance of the card is decreased by
        // the price, and the method returns true
        if (card.balance() >= price) {
            this.heartyMeals++;
            return card.takeMoney(price);
        }
        
        return false;

    }

    public void addMoneyToCard(PaymentCard card, double sum) {

        if (sum < 0) return;

        card.addMoney(sum);
        this.money +=  sum;
        
        
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
