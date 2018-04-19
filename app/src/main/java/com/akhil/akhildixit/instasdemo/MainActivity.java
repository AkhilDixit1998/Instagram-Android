package com.akhil.akhildixit.instasdemo;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.akhil.akhildixit.instasdemo.Fragments.HomeFrag;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button home,account,settings,portfolio,order;
    ArrayList<Fragment> fragmentArrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        initialisations();
        setFragments();
        setFontAwesome();
    }
    public void initialisations()
    {
        home=findViewById(R.id.home);
    }
    public void setFontAwesome()
    {
        Typeface fontAwesomeFont = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        home.setTypeface(fontAwesomeFont);

    }
    public void setFragments()
    { FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        HomeFrag homeFrag=new HomeFrag();
        transaction.add(R.id.h_layout,homeFrag).disallowAddToBackStack();
        transaction.commit();
        home.setTextColor(Color.parseColor("#262626"));

    }
}
