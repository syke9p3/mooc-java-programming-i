
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {

        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Book))
            return false;

        Book comparedBook = (Book) obj;

        if (this.getName().equals(comparedBook.getName()) &&
                this.getPublicationYear() == comparedBook.getPublicationYear()) {
            return true;
        }

        return false;

    }

}
