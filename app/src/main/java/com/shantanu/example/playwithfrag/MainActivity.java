package com.shantanu.example.playwithfrag;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b_add,b_replace,b_remove,b_prefence_frag,b_dialogfrag,b_listdetailfrag;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager=getSupportFragmentManager();


        b_add=(Button)findViewById(R.id.btn_add);
        b_replace=(Button)findViewById(R.id.btn_replace);
        b_remove=(Button)findViewById(R.id.btn_removing);
        b_prefence_frag=(Button)findViewById(R.id.btn_preference);
        b_dialogfrag=(Button)findViewById(R.id.btn_dialog);
        b_listdetailfrag=(Button)findViewById(R.id.btn_listdetail);



    }

    public void adding(View view){
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.add(R.id.fl1, new FirstFrag());;
        ft.commit();

    }
    public void replacing(View view){

        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.fl1, new SecFrag());
        ft.commit();

    }
    public void removing(View view){
        Fragment fragment = fragmentManager.findFragmentById(R.id.fl1);
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.remove(fragment);
        ft.commit();

    }

    public void open_preference(View view){
        Intent i4=new Intent(MainActivity.this,Preferencefrag.class);
        startActivity(i4);

    }
    public void open_dialog(View view){
        Intent i5=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i5);

    }
    public void open_listdetail(View view){
        Intent i6=new Intent(MainActivity.this,ListwithDetail.class);
        startActivity(i6);

    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause",Toast.LENGTH_LONG).show();

    }



    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy", Toast.LENGTH_LONG).show();


    }


}
