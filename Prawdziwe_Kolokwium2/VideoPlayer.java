public class VideoPlayer implements MediaPlayer {
    @Override
    public void play(String trackName) {
        System.out.println("Playing " + trackName + " on Video Player");
    }

    @Override
    public void pause() {
        System.out.println("Pausing Video Player");
    }

    @Override
    public String getCurrentTrack() {
        return "Getting you the Current Track...";
    }
}
