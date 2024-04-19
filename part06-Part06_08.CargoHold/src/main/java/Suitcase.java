import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }

    public void addItem(Item item) {

        if (item.getWeight() + totalWeight > maxWeight) return;
        this.items.add(item);
        totalWeight += item.getWeight();
    }

    public int totalWeight() {
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) return null;

        Item heaviest = items.get(0);
        
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    @Override
    public String toString() {

        if (items.size() == 0) return "no items (0 kg)";
        return "" + items.size() + " item" + (items.size() == 1 ? "" : "s") + " (" + totalWeight + " kg)";
    }

    

}
