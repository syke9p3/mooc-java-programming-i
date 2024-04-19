public class Container {

    private int value;
    final int MAX = 100;

    public Container() {
        this.value = 0;
    }

    public int contains() {
        return this.value;
    }

    public void add(int amount) {

        if (amount <= 0) return;

        this.value = this.value + amount;

        if (this.value > MAX) {
            this.value = MAX;
        }
    }

    public void remove(int amount) {

        if (amount <= 0) return;

        this.value = this.value - amount; 
        
        if (this.value < 0) {
            this.value = 0;
        } 

    }

    public String toString() {
        return "" + this.value + "/" + MAX;
    }


}