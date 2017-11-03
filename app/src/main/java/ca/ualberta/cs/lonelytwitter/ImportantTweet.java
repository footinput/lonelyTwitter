package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

public class ImportantTweet extends Tweet implements Tweetable {
=======
public class ImportantTweet extends Tweet{
>>>>>>> origin/f17lab7

    public ImportantTweet(String message){
        super(message);
    }

<<<<<<< HEAD
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }


=======
>>>>>>> origin/f17lab7
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
<<<<<<< HEAD
=======


>>>>>>> origin/f17lab7
}
