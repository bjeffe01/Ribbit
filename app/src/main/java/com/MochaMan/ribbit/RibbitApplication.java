package com.MochaMan.ribbit;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by BrianJefferies on 10/27/14.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "z5tt87z5vLUBd5wt3Zj8CAHXslQJgV2Wv7WPptiD", "KzXreSUCcP8P3KxmQ2jfkAUgqCWjqPz9ekUz28UK");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();

    }
}
