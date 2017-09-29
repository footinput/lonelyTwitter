
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Max on 2017-09-14.
 */
public class HappyMood extends Mood {

    /**
     * Instantiates a new Happy mood.
     */
    public HappyMood() {
        super();
    }

    /**
     * Instantiates a new Happy mood.
     *
     * @param date the date
     */
    public HappyMood(Date date) {
        super(date);
    }

    /**
     * Get happy mood string.
     *
     * @return the string
     */
    public String GetHappyMood(){
        return "Happy";
    }




}
