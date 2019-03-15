package com.shantanu.example.playwithfrag;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Preferencefrag extends AppCompatActivity {
    FragmentManager mfragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencefrag);

//        mfragmentManager = getFragmentManager();
//        FragmentTransaction mFragmentTransaction = mfragmentManager
//                .beginTransaction();
//        MyPreferenceFrag p=new MyPreferenceFrag();
//        mFragmentTransaction.replace(R.id.flpre, p);
//        mFragmentTransaction.commit();
        getFragmentManager().beginTransaction().replace(R.id.flpre,new MyPreferenceFrag()).commit();
    }

}
