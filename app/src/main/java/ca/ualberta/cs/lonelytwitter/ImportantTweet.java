
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


public class ImportantTweet extends Tweet implements Tweetable {

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     * @param date    the date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }


    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
