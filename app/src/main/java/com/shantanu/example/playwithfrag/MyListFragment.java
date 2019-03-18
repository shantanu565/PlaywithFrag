package com.shantanu.example.playwithfrag;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MyListFragment extends Fragment {
    private OnMasterListener listener;
    Button button1,button2,button3,button4;


    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if (context instanceof OnMasterListener){
            listener=(OnMasterListener) context;
        }else {
            throw new ClassCastException(context.toString()+"must implement mylsitfrag.onItemSelectedListener");
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.listoddetail, container, false);
        button1=(Button)view.findViewById(R.id.btn_one);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="successfull";
                Toast.makeText(getActivity(),msg,Toast.LENGTH_SHORT).show();
                listener.dataFromMaster(msg);

            }
        });
        button2=(Button)view.findViewById(R.id.btn_two);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="Football";
                Toast.makeText(getActivity(),msg,Toast.LENGTH_SHORT).show();
                listener.dataFromMaster(msg);

            }
        });
        button3=(Button)view.findViewById(R.id.btn_three);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="Tennis";
                Toast.makeText(getActivity(),msg,Toast.LENGTH_SHORT).show();
                listener.dataFromMaster(msg);

            }
        });
        button4=(Button)view.findViewById(R.id.btn_four);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="Golf";
                Toast.makeText(getActivity(),msg,Toast.LENGTH_SHORT).show();
                listener.dataFromMaster(msg);

            }
        });

        return view;
    }
  public interface OnMasterListener{
        void dataFromMaster(String txt);
    }

    @Override
    public void onDetach() {
        listener=null;
        super.onDetach();

    }
}
