
public class HealthStation {

    private int count;

    public int weigh(Person person) {

        this.count = this.count + 1;

        // return the weight of the person passed as the parameter
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }

    public int weighings() {
        return count;
    }

}
 