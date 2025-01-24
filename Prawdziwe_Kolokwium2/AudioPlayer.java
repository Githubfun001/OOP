public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String trackName) {
        System.out.println("Playing " + trackName + " on Audio Player");
    }

    @Override
    public void pause() {
        System.out.println("Pausing the Audio Player");
    }

    @Override
    public String getCurrentTrack() {
        return "Getting you the Current Track...";
    }
}
