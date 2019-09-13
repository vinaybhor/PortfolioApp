package com.app.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.app.views.AboutFragment;
import com.app.views.ContactFragment;
import com.app.views.SkillsFragment;
import com.app.views.WorkFragment;

public class DevPagerAdapter extends FragmentPagerAdapter {
    public DevPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0 : return new AboutFragment();
            case 1 : return new WorkFragment();
            case 2 : return new SkillsFragment();
            case 3 : return new ContactFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 : return "ABOUT";
            case 1 : return "WORK";
            case 2 : return "SKILLS";
            case 3 : return "CONTACT";
        }
        return null;
    }
}
