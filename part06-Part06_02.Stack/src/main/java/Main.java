
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        // Stack s = new Stack();
        // System.out.println(s.isEmpty());
        // System.out.println(s.values());
        // s.add("Value");
        // System.out.println(s.isEmpty());
        // System.out.println(s.values());


        Queue q = new Queue();
        System.out.println(q.values());
        q.add("1");
        q.add("2");
        q.add("3");
        q.add("4");
        q.add("5");

        q.values();
        q.dequeue();
        q.values();

    }
}
