package com.example.youthpesa;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.youthpesa.JobOrganization.Government;
import com.example.youthpesa.JobOrganization.NonGovernment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int myNumberOfTabs;
    public PagerAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm, numOfTabs);
        this.myNumberOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: return new Government();
            case 1: return new NonGovernment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return myNumberOfTabs;
    }
}
