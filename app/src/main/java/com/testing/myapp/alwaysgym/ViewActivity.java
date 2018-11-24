package com.testing.myapp.alwaysgym;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.testing.myapp.alwaysgym.Utils.BottomNavigationViewHelper;

/**
 * Created by harsha on 11/24/18.
 */

public class ViewActivity extends AppCompatActivity {

    private static final String TAG = "ViewActivity";
    private Context mContext = ViewActivity.this;
    private static final int ACTIVITY_NUM = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        Log.d(TAG, "onCreate: started");

        setupBottomNavigationView();
    }

    private void setupBottomNavigationView(){

        Log.d(TAG, "setupBottomNavigationView: ");
        BottomNavigationViewEx viewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(viewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, viewEx);
        Menu menu = viewEx.getMenu();
        menu.getItem(ACTIVITY_NUM).setChecked(true);
    }
}
