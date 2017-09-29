
package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class Tweet {

    private String message;
    private Date date;
    // moodList created
    private List<Mood> moodList;

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
        moodList = new ArrayList<Mood>();
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     * @param date    the date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        moodList = new ArrayList<Mood>();
    }

    /**
     * Add mood.
     *
     * @param i the
     */
// method to add moods to the mood list
    public void addMood(Mood i){
        moodList.add(i);
    }

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();


    /**
     * Sets message.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Get message string.
     *
     * @return the string
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
