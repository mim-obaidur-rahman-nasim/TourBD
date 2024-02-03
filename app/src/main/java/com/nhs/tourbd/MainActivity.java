package com.nhs.tourbd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Fragment_home fragment_home = new Fragment_home();
    Fragment_menu fragment_menu = new Fragment_menu();
    Fragment_event fragment_event = new Fragment_event();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNav);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameContanier,new Fragment_home()).commit();
        BadgeDrawable badgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.bottom_nav_event);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                switch (item.getItemId()){
                    case R.id.bottom_nav_menu:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameContanier,new Fragment_menu()).commit();
                        return true;

                    case R.id.bottom_nav_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameContanier,new Fragment_home()).commit();
                        return true;
                    case R.id.bottom_nav_event:

                        getSupportFragmentManager().beginTransaction().replace(R.id.frameContanier,new Fragment_event()).commit();
                        return true;
                }


                return false;
            }
        });



    }
}