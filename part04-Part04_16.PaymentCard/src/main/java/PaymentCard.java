public class PaymentCard {
    private double balance;
    
    public PaymentCard(double balance){
        this.balance = balance;
    } 

    public void eatAffordably() {
        if (!(this.balance - 2.60 < 0)) {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        if (!(this.balance - 4.60 < 0)) {
            this.balance = this.balance - 4.60;
        }
    }

    public void addMoney(double amount) {

        if (amount < 0) {
            return;
        }

        if (this.balance + amount > 150) {
            this.balance = 150;
        } else {
            this.balance = this.balance + amount;
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
