package com.example.booking_bus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class bottom_nav extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        bottomNavigationView= findViewById(R.id.bottom_nav);
        frameLayout= findViewById(R.id.frame_layout);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId=item.getItemId();

                if (itemId==R.id.nav_home){
                  loadFragment(new HomeFragment(),false);

                }else if(itemId==R.id.nav_map){
                    loadFragment(new MapFragment(),false);

                }else if(itemId==R.id.nav_booking){
                    loadFragment(new BookingFragment(),false);

                }else{ //nav_setting

                    loadFragment(new SettingFragment(),false);
                }

                return true;
            }
        });

        loadFragment(new HomeFragment(),true);
    }
    private void loadFragment(Fragment fragment, boolean isAppInitialized){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

        if(isAppInitialized){
            fragmentTransaction.add(R.id.frame_layout,fragment);
        }else {
            fragmentTransaction.replace(R.id.frame_layout, fragment);
        }


        fragmentTransaction.commit();
    }
}