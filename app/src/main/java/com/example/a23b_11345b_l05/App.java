package com.example.a23b_11345b_l05;

import android.app.Application;

import com.example.a23b_11345b_l05.Utilities.MySPv3;
import com.example.a23b_11345b_l05.Utilities.SignalGenerator;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MySPv3.init(this);
        SignalGenerator.init(this);
    }
}
