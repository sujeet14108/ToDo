package com.example.sujeet.todo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sujeet on 9/11/16.
 */

public  class DataFragmentPagerAdapter extends FragmentPagerAdapter {

   List<Student> users;

    public DataFragmentPagerAdapter(FragmentManager fm, List<Student> usersList) {
        super(fm);
        this.users=usersList;
    }

    @Override
    public Fragment getItem(int index) {

        return PageFragment.newInstance(users.get(index));
    }

    @Override
    public int getCount() {

        return users.size();
    }
}
