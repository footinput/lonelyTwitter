package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Max on 2017-09-14.
 */

public class SadMood extends Mood {
    public SadMood() {
        super();
    }

    public SadMood(Date date) {
        super(date);
    }

    public String GetSadMood(){
        return "Sad";
    }
}
