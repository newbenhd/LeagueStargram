package com.example.newben.leaguestargram.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.newben.leaguestargram.Fragment.FollowFragment;
import com.example.newben.leaguestargram.Fragment.StatFragment;

/**
 * Created by MorrisonBenjaminL on 6/17/2017.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter{
    private static final int NUM_PAGES = 2;
    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FollowFragment.newInstance(0,"Following");
            case 1:
                return StatFragment.newInstance(1,"Stat");
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Following";
            case 1:
                return "Stat";
            default:
                return null;
        }
    }
}
