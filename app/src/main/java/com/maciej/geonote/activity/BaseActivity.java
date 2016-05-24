package com.maciej.geonote.activity;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Maciej on 19.05.2016.
 */
public class BaseActivity extends AppCompatActivity {



    protected void displayFragment(Fragment fragment, int viewId, String tag){
        getSupportFragmentManager().beginTransaction().add(viewId, fragment, tag).commit();
    }
}
