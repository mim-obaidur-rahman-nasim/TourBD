package com.nhs.tourbd;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },3020);


        ImageView logo,bg;
        TextView nhsohan;
        LottieAnimationView lottieAnimationView;



        setContentView(R.layout.activity_splash_screen);

        logo = findViewById(R.id.logo);
        bg = findViewById(R.id.bg);
        nhsohan = findViewById(R.id.nhsohan);



        lottieAnimationView = findViewById(R.id.lottie);


        bg.animate().translationY(-5000).setDuration(1200).setStartDelay(3000);
        logo.animate().translationY(-3000).setDuration(3300).setStartDelay(3000);
        lottieAnimationView.animate().translationY(2400).setDuration(1200).setStartDelay(3000);
        nhsohan.animate().translationX(2400).setDuration(1200).setStartDelay(3000);
        //version.animate().translationX(-2400).setDuration(1200).setStartDelay(3000);


    }
}