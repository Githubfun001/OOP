import java.util.ArrayList;
import java.util.Objects;

public class MusicAlbum {
    private String title;
    private String artist;
    private ArrayList<Double> ratings;

    public MusicAlbum(String title, String artist, ArrayList<Double> ratings) {
        this.title = title;
        this.artist = artist;
        this.ratings = ratings;
    }

    public void dodajRating(double rating) {
        ratings.add(rating);
    }

    public void usunRating(double rating) {
        ratings.remove(rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title != null && !title.isEmpty())
            this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        if(artist != null && !artist.isEmpty())
            this.artist = artist;
    }

    public ArrayList<Double> getRatings() {
        return ratings;
    }

    public void setRatings(ArrayList<Double> ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Title: "+ title + '\n' +
                "Artist: " + artist + '\n' +
                "Ratings: " + ratings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicAlbum that = (MusicAlbum) o;
        return Objects.equals(title, that.title) && Objects.equals(artist, that.artist) && Objects.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, ratings);
    }
}
