package mx.grupogarcia.courserapp_4.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Luis Garcia  on 17/09/2016.
 */

public class PageAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment>fragments;
    public PageAdapter(FragmentManager fm, ArrayList<Fragment>fragments) {
        super(fm);
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
