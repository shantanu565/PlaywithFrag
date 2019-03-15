package com.shantanu.example.playwithfrag;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button button21,button22;
    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button21=(Button)findViewById(R.id.b21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFrag d = new MyDialogFrag();
                new MyDialogFrag().show(getSupportFragmentManager(), "Dialog Fragment");

            }
        });
        button22=(Button)findViewById(R.id.b22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySecDialog mysecdialog = new MySecDialog();
                mysecdialog.show(fm, "Alert Dialog Fragment");

            }
        });


    }
}
