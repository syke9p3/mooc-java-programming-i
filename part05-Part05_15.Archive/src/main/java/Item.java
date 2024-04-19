public class Item {
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Item))
            return false;

        Item compareItem = (Item) obj;

        if (this.getIdentifier().equals(compareItem.getIdentifier())) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return identifier + ": " + name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

}
