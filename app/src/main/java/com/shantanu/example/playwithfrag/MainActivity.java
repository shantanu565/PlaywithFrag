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
    Button button1,button2,button3,button4,button5,button6;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    String button_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager=getSupportFragmentManager();

        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(MainActivity.this,Preferencefrag.class);
                startActivity(i4);
            }
        });
        button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i5);
            }
        });
        button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(MainActivity.this,ListwithDetail.class);
                startActivity(i6);
            }
        });

        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_text=button2.getText().toString();
                if (button_text.equals("replace")){
                    FragmentTransaction fragmentTransaction =
                            fragmentManager.beginTransaction();
                    SecFrag s=new SecFrag();
                    fragmentTransaction.replace(R.id.fl1,s);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    button2.setText("remove");
                }else if (button2.equals("remove")){
                    FragmentTransaction fragmentTransaction =
                            fragmentManager.beginTransaction();
                    SecFrag s=new SecFrag();
                    fragmentTransaction.remove(s);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    button2.setText("Add");
                }

            }
        });

        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction=fragmentManager.beginTransaction();
                FirstFrag f=new FirstFrag();
                fragmentTransaction.replace(R.id.fl1,f);
                fragmentTransaction.commit();

            }
        });
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
