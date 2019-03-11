package com.shantanu.example.playwithfrag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListwithDetail extends AppCompatActivity  implements ListDetail_interface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listwith_detail);


    }
    @Override
    public void onItemSelected(long id) {
        // Replace the detail fragment with the corresponding item selected in the list
    }
}
