public class MusicStyles {
    public void playMusic() {
        System.out.println("Грає музика в стилі: ");
    }
    public static void main(String[] args) {

        MusicStyles[] musicBands = new MusicStyles[]{
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic()
        };

        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}
