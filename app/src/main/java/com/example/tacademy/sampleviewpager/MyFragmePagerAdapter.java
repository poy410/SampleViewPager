package com.example.tacademy.sampleviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2016-04-22.
 */
public class MyFragmePagerAdapter extends FragmentPagerAdapter{
    List<String>items=new ArrayList<String>();
    public void add(String item){
        items.add(item);
        notifyDataSetChanged();
    }
    public MyFragmePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return Page1Fragment.newInstance(items.get(position));
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
