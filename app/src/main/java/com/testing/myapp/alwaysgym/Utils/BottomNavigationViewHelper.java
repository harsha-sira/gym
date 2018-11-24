package com.testing.myapp.alwaysgym.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.testing.myapp.alwaysgym.MainActivity;
import com.testing.myapp.alwaysgym.R;
import com.testing.myapp.alwaysgym.SettingsActivity;
import com.testing.myapp.alwaysgym.ViewActivity;

/**
 * Created by harsha on 11/24/18.
 */

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx viewEx)
    {
        viewEx.enableAnimation(false);
        viewEx.enableItemShiftingMode(false);
        viewEx.enableShiftingMode(false);
        viewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context,BottomNavigationViewEx viewEx ){

        viewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, MainActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        Intent intent2 = new Intent(context, ViewActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_setting:
                        Intent intent3 = new Intent(context, SettingsActivity.class);
                        context.startActivity(intent3);
                        break;
                }
                return false;
            }
        });
    }
}
