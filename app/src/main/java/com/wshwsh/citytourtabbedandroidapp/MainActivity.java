package com.wshwsh.citytourtabbedandroidapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        // Add Fragments to adapter one by one
        adapter.addFragment(new MonumentsFragment(), getResources().getString(R.string.Momuments));
        adapter.addFragment(new LibrariesFragment(), getResources().getString(R.string.Libararies));
        adapter.addFragment(new ITCompaniesFragment(), getResources().getString(R.string.IT_Companies));
        adapter.addFragment(new RestaurantsFragment(), getResources().getString(R.string.Restaurants));
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
