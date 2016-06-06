package com.hnpolice.xiaoke.tablayoutwithviewpagedemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * create by luoxiaoke on 2016/6/6 10:05.
 * use for
 */
public class MyFragmentpageAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments;
    List<String> titles;

    public MyFragmentpageAdapter(FragmentManager fm, List<Fragment> fragments, List<String> titles) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position % titles.size());
    }
}
