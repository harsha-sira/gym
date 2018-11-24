package com.testing.myapp.alwaysgym;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.testing.myapp.alwaysgym.Utils.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Context mContext = MainActivity.this;
    private static final int ACTIVITY_NUM = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: main activity");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupBottomNavigationView();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.header_nav_menu,menu);
        return true;
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
