import java.util.ArrayList;

public class Stack {
    private ArrayList<String> values = new ArrayList<>();

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public void add(String s) {
        values.add(s);
    }

    public ArrayList<String> values() {
        return values;
    }

    public String take() {
        String top = values.get(values.size()-1);

        values.remove(values.size()-1);
        return top;
    }
    

}
