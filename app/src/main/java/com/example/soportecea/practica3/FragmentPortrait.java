package com.example.soportecea.practica3;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPortrait extends Fragment {

    TextView
    public FragmentPortrait() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portrait, container, false);
    }


    public void onClick(View view){
        if(view.getId() == R.id.button_0){

        }
    }

}
