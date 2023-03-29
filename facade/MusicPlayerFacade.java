package facade;

public class MusicPlayerFacade {
    private AudioPlayer audioPlayer;
    private AudioDecoder audioDecoder;
    private AudioFileReader audioFileReader;

    public MusicPlayerFacade() {
        audioPlayer = new AudioPlayer();
        audioDecoder = new AudioDecoder();
        audioFileReader = new AudioFileReader();
    }

    public void playMusic(String fileName) {
        audioFileReader.readAudioFile(fileName);
        audioDecoder.decodeAudioFile(fileName);
        audioPlayer.playAudioFile(fileName);
    }
}