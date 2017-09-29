
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Max on 2017-09-14.
 */
public class SadMood extends Mood {
    /**
     * Instantiates a new Sad mood.
     */
    public SadMood() {
        super();
    }

    /**
     * Instantiates a new Sad mood.
     *
     * @param date the date
     */
    public SadMood(Date date) {
        super(date);
    }

    /**
     * Get sad mood string.
     *
     * @return the string
     */
    public String GetSadMood(){
        return "Sad";
    }
}
