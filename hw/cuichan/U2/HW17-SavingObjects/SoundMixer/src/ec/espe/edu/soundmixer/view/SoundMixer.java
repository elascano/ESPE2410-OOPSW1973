package ec.espe.edu.soundmixer.view;

import ec.espe.edu.soundmixer.model.AudioTrack;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author David Cuichan
 */
public class SoundMixer {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        AudioTrack audioTrack = new AudioTrack();
        audioTrack.setTitleName("Houdini");
        audioTrack.setAuthor("Eminem");
        audioTrack.setDurationTime(4.50F);
        
        FileOutputStream fileOutputStream = new FileOutputStream("Sound.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(audioTrack);
        objectOutputStream.close();
        
        FileInputStream fileInputStream = new FileInputStream("Sound.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        AudioTrack trackInFile = (AudioTrack) objectInputStream.readObject();
        objectInputStream.close();
        
        System.out.println(trackInFile);
        
    }
}
