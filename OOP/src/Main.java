import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MusicAlbum musicAlbum = new MusicAlbum("qe", "sadio", new ArrayList<Double>());
        RockAlbum rockAlbum = new RockAlbum("dfdf", "asd", new ArrayList<Double>(), "Soft");

        musicAlbum.dodajRating(6.4);
        musicAlbum.dodajRating(68.4);
        System.out.println(musicAlbum);

        System.out.println();

        rockAlbum.dodajRating(8.4);
        rockAlbum.dodajRating(9.4);
        System.out.println(rockAlbum);
    }
}