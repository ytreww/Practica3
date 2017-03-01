package com.example.soportecea.practica3;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Configuration config;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    EditText tPortrait;
    EditText tLandscape;
    String temp="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        config= getResources().getConfiguration();
        fragmentManager=getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();

        if(config.orientation==Configuration.ORIENTATION_LANDSCAPE){
            FragmentLandscape ls_frag=new FragmentLandscape();
            fragmentTransaction.replace(android.R.id.content, ls_frag);
            this.setTitle("Landscape");
        }else{
            FragmentPortrait pt_frag=new FragmentPortrait();
            fragmentTransaction.replace(android.R.id.content, pt_frag);
            this.setTitle("Portrait");
        }
        fragmentTransaction.commit();
    }
}
