package com.shantanu.example.playwithfrag;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class MyPreferenceFrag extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.mypreferences);
    }
}
