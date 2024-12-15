package com.example.viewpager2betwen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewpagerAdapter extends FragmentPagerAdapter{

    public ViewpagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        if(position==0){
            fragment=new TAb1Fragment();
        } else if (position==1) {
          fragment=new Tab2Fragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String titel= null;
        if(position==0){
           titel= "TAB_1";
        } else if (position==1) {
            titel="TAB_2";
        }
        return titel;
    }
}
