package com.shantanu.example.playwithfrag;

import android.content.Intent;
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
    FragmentTransaction fragmentTransaction;
    String button_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager=getSupportFragmentManager();


        b_add=(Button)findViewById(R.id.button1);
        b_replace=(Button)findViewById(R.id.button2);
        b_remove=(Button)findViewById(R.id.button2);
        b_prefence_frag=(Button)findViewById(R.id.button2);
        b_dialogfrag=(Button)findViewById(R.id.button2);
        b_listdetailfrag=(Button)findViewById(R.id.button2);

        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FirstFrag f=new FirstFrag();
                fragmentTransaction.add(f,"first");
                //fragmentTransaction.replace(mContainerId, fragment, fragment.toString());
                //fragmentTransaction.addToBackStack(fragment.toString());
                fragmentTransaction.commit();
            }
        });

        b_replace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               replace_frag();

            }
        });

    }
    public  void replace_frag(){
        FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
        ft2.replace(R.id.fl1, new FirstFrag());
        //fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    public void adding(View view){

    }
    public void replacing(View view){

    }
    public void removing(View view){

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
