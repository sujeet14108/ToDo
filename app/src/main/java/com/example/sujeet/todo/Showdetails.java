package com.example.sujeet.todo;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class Showdetails extends AppCompatActivity {




    private ViewPager mViewPager;
    private DataFragmentPagerAdapter mMyFragmentPagerAdapter;
DBHelper dbHelper;
    ArrayList<Student> contactsList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        int pos=intent.getIntExtra("pos",1);
        // int year = intent.getStringExtra("pos");
        String name = intent.getStringExtra("name");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdetails);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        System.out.println(name+"   "+pos);
        dbHelper = DBHelper.getInstance(getApplicationContext());
        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        contactsList = new ArrayList<Student>();




        mMyFragmentPagerAdapter = new DataFragmentPagerAdapter(
                getSupportFragmentManager(), dbHelper.getAllUser());
        mViewPager.setAdapter(mMyFragmentPagerAdapter);
        mViewPager.setCurrentItem(pos);
    }





}
