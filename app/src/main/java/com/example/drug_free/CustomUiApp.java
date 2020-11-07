package com.example.drug_free;

import android.app.Application;

import io.smooch.core.Settings;
import io.smooch.core.Smooch;

public class CustomUiApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Smooch.init(this, new Settings("5fa69de9f0f418000cd90483"), null);

    }



}
