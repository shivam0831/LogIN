package com.shivam.login;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Alert extends Fragment {


    public Alert() {
        // Required empty public constructor
    }
    public static Alert newInstance() {
        Alert fragment = new Alert();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_alert, container, false);
        return  v;
    }

}
