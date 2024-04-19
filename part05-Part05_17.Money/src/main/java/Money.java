
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = this.euros() + addition.euros();
        int newCents = this.cents() + addition.cents();
        Money newMoney = new Money(newEuros, newCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
       
        if (this.euros() < compared.euros()) {
            return true;
        } else if (this.euros() > compared.euros()) {
            return false;
        } else {
            if (this.cents() >= compared.cents()) return false;
        }

        return true;
        
    }

    

    public Money minus(Money decreaser) {

        int totalCents = this.euros() * 100 + this.cents();
        int decreaserCents = decreaser.euros() * 100 + decreaser.cents();

        if (totalCents - decreaserCents < 0) {
            return new Money(0, 0);
        }

        totalCents = totalCents - decreaserCents;

        int newEuros = totalCents / 100;
        int newCents = totalCents % 100;

        return new Money(newEuros, newCents);
    }

}
