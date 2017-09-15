package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Max on 2017-09-14.
 */

public class HappyMood extends Mood {

    public HappyMood() {
        super();
    }

    public HappyMood(Date date) {
        super(date);
    }

    public String GetHappyMood(){
        return "Happy";
    }




}
