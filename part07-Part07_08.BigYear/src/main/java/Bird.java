public class Bird {

    private String name;
    private String latin;
    private int observations;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observations = 0;
    }

    public void addObservation() {
        this.observations++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public int getObservations() {
        return observations;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return name + " (" + latin + "): " + observations +  " observation" + (this.observations == 1 ? "" : "s");
    }

    
    
}
