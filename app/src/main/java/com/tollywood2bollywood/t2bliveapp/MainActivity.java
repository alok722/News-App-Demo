package com.tollywood2bollywood.t2bliveapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private BottomNavigationView mBottomNavigation;
    FrameLayout mFrame;
    private HomeFragment homeFragment;
    private AboutFragment aboutFragment;
    private ContactFragment contactFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inflating toolbar in MainActivity
        mToolbar = (Toolbar) findViewById(R.id.main_page_appbar);
        setSupportActionBar(mToolbar);


        mBottomNavigation = (BottomNavigationView)findViewById(R.id.bottom_navigator);
        mFrame = (FrameLayout)findViewById(R.id.main_frame);

        //Creating constructor
        homeFragment = new HomeFragment();
        aboutFragment = new AboutFragment();
        contactFragment  = new ContactFragment();

        //Setting default fragment on opening
        setFragment(homeFragment);



        mBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.bottom_menu_home) {
                    setFragment(homeFragment);

                } else if (id == R.id.bottom_menu_about) {
                    setFragment(aboutFragment);

                }  else if (id == R.id.bottom_menu_contact) {
                    setFragment(contactFragment);

                }
                return true;
            }
        });

    }

    private void setFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment);
        fragmentTransaction.commit();
    }

}
