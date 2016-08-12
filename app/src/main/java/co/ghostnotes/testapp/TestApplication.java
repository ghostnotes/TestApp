package co.ghostnotes.testapp;

import android.app.Application;
import android.os.Build;

import com.goodpatch.feedbacktool.sdk.Balto;

public class TestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Balto.init(this);
    }

}
