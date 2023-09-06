public class Main {
    public static void main(String[] args) {

        MusicStyles popMusicBand = new PopMusic();

        MusicStyles rockMusicBand = new RockMusic();

        MusicStyles classicMusicBand = new ClassicMusic();

        popMusicBand.playMusic();
        rockMusicBand.playMusic();
        classicMusicBand.playMusic();
    }
}
