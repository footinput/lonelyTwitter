package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
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
=======
import java.util.Date;

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
>>>>>>> origin/f17lab7

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
<<<<<<< HEAD
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
=======
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    @Override
    public String toString(){
        return message;
>>>>>>> origin/f17lab7
    }

    public abstract Boolean isImportant();


<<<<<<< HEAD



    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public String getMessage(){
        return this.message;
=======
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
>>>>>>> origin/f17lab7
    }

    public Date getDate() {
        return date;
    }
<<<<<<< HEAD

    public void setDate(Date date) {
        this.date = date;
    }
=======
>>>>>>> origin/f17lab7
}
