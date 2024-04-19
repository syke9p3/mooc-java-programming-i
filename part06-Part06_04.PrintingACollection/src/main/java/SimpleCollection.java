
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {

        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        } 

        int count = elements.size();

        String print = "The collection " + name + " has " + count + (count == 1 ? " element" : " elements") + ":";

        for (String letter : elements) {
            print += "\n" + letter ;
        }

        return print;
        
    }

    
    
}
