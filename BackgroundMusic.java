import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class BackgroundMusic {

    private Clip clip;

    // Constructor to load and play music
    public BackgroundMusic(String musicFilePath) {
        try {
            // Load the audio file
            File musicFile = new File(musicFilePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to start the background music
    public void startMusic() {
        if (clip != null) {
            clip.loop(Clip.LOOP_CONTINUOUSLY);  // Play the music in a loop
        }
    }

    // Method to stop the background music
    public void stopMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
}
