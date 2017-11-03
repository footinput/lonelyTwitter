package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    private TextView tweet;
    String passTweet = new String();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        Intent intent = getIntent();
        tweet = (TextView) findViewById(R.id.textView2);
        passTweet = intent.getStringExtra("Tweet");
        tweet.setText(passTweet);



    }
}
