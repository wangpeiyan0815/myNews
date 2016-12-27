package com.bwie.myapplication.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bwie.myapplication.fragment.LikeFragment;
import com.bwie.myapplication.fragment.LoginFragment;
import com.bwie.myapplication.fragment.MainFragment;
import com.bwie.myapplication.fragment.VideoFragment;

/**
 * Created by dell on 2016/12/27.
 */

public class Main_FragmentPagerAdapter extends FragmentPagerAdapter {
    private Context context;

    public Main_FragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            MainFragment mainFragment = new MainFragment();
            return mainFragment;
        }else if(position == 1){
            VideoFragment videoFragment = new VideoFragment();
            return videoFragment;
        }else if(position == 2){
            LikeFragment likeFragment = new LikeFragment();
            return likeFragment;
        }else if(position == 3){
            LoginFragment loginFragment = new LoginFragment();
            return loginFragment;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
