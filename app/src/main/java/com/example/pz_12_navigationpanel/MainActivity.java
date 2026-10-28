package com.example.pz_12_navigationpanel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ImageView imgMap;
    ImageView imgDial;
    ImageView imgMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgMap = findViewById(R.id.img_map);
        imgDial = findViewById(R.id.img_dial);
        imgMail = findViewById(R.id.img_mail);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.navigation_home) {
                imgMap.setVisibility(View.VISIBLE);
                imgDial.setVisibility(View.GONE);
                imgMail.setVisibility(View.GONE);
            } else if (id == R.id.navigation_dashboard) {
                imgMap.setVisibility(View.GONE);
                imgDial.setVisibility(View.VISIBLE);
                imgMail.setVisibility(View.GONE);
            } else if (id == R.id.navigation_notifications) {
                imgMap.setVisibility(View.GONE);
                imgDial.setVisibility(View.GONE);
                imgMail.setVisibility(View.VISIBLE);
            }
            return true;
        });

    }
}