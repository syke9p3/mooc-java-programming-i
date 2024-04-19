import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        for (int i=0; i < tasks.size(); i++) {
            String task = tasks.get(i);
            System.out.println("" + (i+1) + ": " + task);
        }
    }

    public void remove(int index) {
        if (tasks.size() < 0 || index-1 <= tasks.size())
        tasks.remove(index-1);
    }

}
