package ec.espe.edu.soundmixer.model;

import java.io.Serializable;

/**
 *
 * @author David Cuichan
 */
public class AudioTrack implements Serializable{
    private String titleName;
    private String author;
    private float durationTime;

    public AudioTrack() {
        this.titleName = "";
        this.author = "";
        this.durationTime = 0.0F;
    }
    
    public AudioTrack(String titleName, String author, float durationTime) {
        this.titleName = titleName;
        this.author = author;
        this.durationTime = durationTime;
    }

    @Override
    public String toString() {
        return "AudioTrack{" + "titleName=" + getTitleName() + ", author=" + getAuthor() + ", durationTime=" + getDurationTime() + " min" +'}';
    }

    /**
     * @return the titleName
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * @param titleName the titleName to set
     */
    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the durationTime
     */
    public float getDurationTime() {
        return durationTime;
    }

    /**
     * @param durationTime the durationTime to set
     */
    public void setDurationTime(float durationTime) {
        this.durationTime = durationTime;
    }
    
    
}