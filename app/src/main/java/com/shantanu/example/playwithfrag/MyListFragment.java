package com.shantanu.example.playwithfrag;

import android.arch.lifecycle.LifecycleOwner;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyListFragment extends ListFragment {
    String[] users = new String[] { "Suresh","Rohini","Trishika","Praveen","Sateesh","Madhav" };
    String[] location = new String[]{"Hyderabad","Guntur","Hyderabad","Bangalore","Vizag","Nagpur"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.listoddetail, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, users);
        setListAdapter(adapter);
        return view;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        DetailViewFrag detailViewFrag=(DetailViewFrag)getFragmentManager().findFragmentById(R.id.fragment2);
        detailViewFrag.change("Name: "+ users[position],"Location : "+ location[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}
