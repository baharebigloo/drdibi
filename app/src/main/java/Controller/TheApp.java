package Controller;

import android.app.Application;

import static Controller.ObjectBox.init;


public class TheApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }


}
