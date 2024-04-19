
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true; 

        Song compared = (Song) obj;

        if (!this.getArtist().equals(compared.getArtist())) return false;
        if (!this.getName().equals(compared.getName())) return false;
        if (!(this.getDurationInSeconds() == compared.getDurationInSeconds())) return false;

        return true;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }


}
