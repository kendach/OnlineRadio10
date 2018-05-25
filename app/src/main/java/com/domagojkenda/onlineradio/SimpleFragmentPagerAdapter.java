package com.domagojkenda.onlineradio;

import android.app.Fragment;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new Fragment1();
        } else if (position == 1){
            return new Fragment2();
        } else {
            return new Fragment3();
        }
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 3;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return "Vijesti";
            case 1:
                return "Player";
            case 2:
                return "Arhiva";
            default:
                return null;
        }
    }

}