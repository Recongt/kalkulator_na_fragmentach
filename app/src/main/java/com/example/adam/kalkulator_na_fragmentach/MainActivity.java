package com.example.adam.kalkulator_na_fragmentach;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.Vector;


public class MainActivity extends FragmentActivity implements View.OnClickListener{


    private PagerAdapter mPagerAdapter;

    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        this.initialisePaging();
        mp = MediaPlayer.create(MainActivity.this, R.raw.click);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        this.initialisePaging();
        return true;
    }

    private void initialisePaging() {
        List<Fragment> fragments = new Vector<Fragment>();
        //Dodaje fragmenty do listy, którą użyjemy w naszym adapterze. W tym przypadku dodałem 2 takie same (są jako osobne aktywności) by pokazać jak to działa w praktyce
        fragments.add(Fragment.instantiate(this, Prosty.class.getName()));
        fragments.add(Fragment.instantiate(this, Naukowy.class.getName()));

        this.mPagerAdapter = new myPageAdapter(super.getSupportFragmentManager(), fragments);
        ViewPager pager = (ViewPager)
        super.findViewById(R.id.pager);
        pager.setAdapter(this.mPagerAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        mp.start();
    }

    class myPageAdapter extends FragmentPagerAdapter {

        /*
         * fragments = Lista  fragmentow programu
         */
        private final List<Fragment> fragments;

        public myPageAdapter(FragmentManager fm, List<Fragment> fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {

            return this.fragments.get(position);
        }

        @Override
        public int getCount() {
            return this.fragments.size();
        }
    }



}