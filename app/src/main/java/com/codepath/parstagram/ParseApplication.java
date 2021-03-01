package com.codepath.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6TE3mV31UO6MjoeWTfmqk9yT83TI9xi2LTfeGDhI")
                .clientKey("IQSxeS7IZrd9r4uuU1koC8FBvV1R7SG1TQmZVlEn")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
