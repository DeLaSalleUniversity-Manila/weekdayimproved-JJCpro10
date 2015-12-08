package com.example.janssen.weekdayimproved;
import android.widget.TextView;

/**
 * Created by Janssen on 12/8/2015.
 */
public interface MyActivityInterface {

    // Displays the date picker and day
    public void pickDateDisplayDay();

    // Sets the TextView to message
    public void setText(String message);

    // Adds fade animation to the text
    public void fadeAnimation(TextView tv);

}