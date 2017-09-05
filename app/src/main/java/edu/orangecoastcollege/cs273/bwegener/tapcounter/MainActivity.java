package edu.orangecoastcollege.cs273.bwegener.tapcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * The MainActivity connects the controller to the view and
 * allows for the counter to be changed.
 *
 * @author Brian Wegener
 * @version 1.0
 *
 * Created on 9/5/2017
 */
public class MainActivity extends AppCompatActivity {

    // In Controller, define member variables needed from
    // the View and the Model

    // View
    private TextView mCountTextView;

    // Model
    private Counter mCounter = new Counter();

    /**
     * This is what happens when the application is first created
     * It sets the count and creates the textView and Button.
     * @param savedInstanceState this is what happens everytime the app is reloaded.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link the text view in our Controller with the text view in the layout XML file
        // Use the "R" class to do this
        mCountTextView = (TextView) findViewById(R.id.countTextView);
    }

    /**
     * This handles what happens when the button is pressed.
     * @param view The view can be changed incrementing the count by using the button.
     */
    // Let's make a method to handle what happens when the user clicks on the tapButton
    public void handleTap(View view)
    {
        // increment the count by 1
        mCounter.incrementCount();
        // Set the text view to the new count
        mCountTextView.setText(String.valueOf(mCounter.getCount()));
    }
}
