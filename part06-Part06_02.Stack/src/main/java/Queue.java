import java.util.ArrayList;

public class Queue {
    private ArrayList<String> values = new ArrayList<>();

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public void add(String s) {
        values.add(s);
    }

    public ArrayList<String> values() {
        System.out.println(values);
        return values;
    }

    public String dequeue() {
        String first = values.get(0);

        values.remove(0);
        return first;
    }
    

}
