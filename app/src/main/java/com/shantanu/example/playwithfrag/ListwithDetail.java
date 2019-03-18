package com.shantanu.example.playwithfrag;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ListwithDetail extends AppCompatActivity implements MyListFragment.OnMasterListener{
    private static final String MASTER_TAG = "master";
    private static final String DETAIL_TAG = "detail";
    MyListFragment myListFragment;
    DetailViewFrag detailViewFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listwith_detail);

        FragmentManager fragmentManager=getSupportFragmentManager();
        myListFragment= (MyListFragment) fragmentManager.findFragmentById(R.id.fragment);
       detailViewFrag= (DetailViewFrag) fragmentManager.findFragmentById(R.id.fragment2);


    }



    @Override
    public void dataFromMaster(String txt) {
        Toast.makeText(this,txt,Toast.LENGTH_SHORT).show();

        detailViewFrag.youGotMessage(txt);

    }
}
