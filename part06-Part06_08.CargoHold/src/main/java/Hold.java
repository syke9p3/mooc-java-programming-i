import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int totalWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalWeight > this.maxWeight) {
            return;
        }

        totalWeight += suitcase.totalWeight();
        this.suitcases.add(suitcase);
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {

        if (suitcases.size() == 0) return "no suitcases (0 kg)";
        return "" + suitcases.size() + " suitcases" + (suitcases.size() == 1 ? "" : "s") + " (" + totalWeight + " kg)";
    }

    
    
}
