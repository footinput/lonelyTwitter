package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

=======
>>>>>>> origin/f17lab7
public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

<<<<<<< HEAD
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

=======
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
>>>>>>> origin/f17lab7
}
