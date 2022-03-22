package com.codepath.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("axPRVsXeuDYJmXHjEYJS3mQO4t1nqMVHz0fMvRR3")
                .clientKey("buStS844kcyGzDH1EJ3DWRerFS2LXqORQJHJujG5")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
