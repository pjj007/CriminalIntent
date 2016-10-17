package com.bignerdranch.android.Trip_Logger;

import android.support.v4.app.Fragment;

/**
 * Created by Paul J Jensen on 30/08/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
