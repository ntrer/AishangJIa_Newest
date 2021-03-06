package com.shushang.aishangjia.fragment.CoustomerFragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.shushang.aishangjia.base.BaseViewPagerAdapter2;

public class CoustomerFragmentAdapter extends BaseViewPagerAdapter2 {

    public CoustomerFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public void addFragment(Fragment fragment, String title) {
        mFragments.add(fragment);
        mFragmentTitles.add(title);
    }
}
