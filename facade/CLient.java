package facade;

public class CLient {
    public static void main(String[] args) {
        MusicPlayerFacade musicPlayerFacade = new MusicPlayerFacade();
        musicPlayerFacade.playMusic("song.mp3");
    }
}
