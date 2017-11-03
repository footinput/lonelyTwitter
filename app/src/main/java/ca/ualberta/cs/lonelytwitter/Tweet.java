package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by watts1 on 9/12/17.
 */

public abstract class Tweet {

    private String message;
    private Date date;
    // moodList created
    private List<Mood> moodList;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
        moodList = new ArrayList<Mood>();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        moodList = new ArrayList<Mood>();
    }

    // method to add moods to the mood list
    public void addMood(Mood i){
        moodList.add(i);
    }

    public abstract Boolean isImportant();





    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
