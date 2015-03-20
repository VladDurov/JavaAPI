package patterns.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","stand alone.mp3");
        audioPlayer.play("mp4","movie.mp4");
        audioPlayer.play("vlc","linux.vlc");
        audioPlayer.play("avi", "film.avi");
    }
}
