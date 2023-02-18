package com.example.tablayoutfrag.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.tablayoutfrag.Adpter.viewPagerAdpter;
import com.example.tablayoutfrag.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    viewPager = findViewById(R.id.viewpager);
    tabLayout = findViewById(R.id.tab);


        viewPagerAdpter va = new viewPagerAdpter(getSupportFragmentManager());
        viewPager.setAdapter(va);

        tabLayout.setupWithViewPager(viewPager);

    }
}