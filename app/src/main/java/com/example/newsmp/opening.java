package com.example.newsmp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class opening extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    Animation bottom_anim, top_anim;
    ImageView imageView;
    TextView title,slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        //Animation
        bottom_anim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
        top_anim = AnimationUtils.loadAnimation(this,R.anim.top_anim);

        //hooks
        imageView = findViewById(R.id.imageView);
        title = findViewById(R.id.title);
        slogan = findViewById(R.id.slogan);

        imageView.setAnimation(top_anim);
        title.setAnimation(bottom_anim);
        slogan.setAnimation(bottom_anim);

        //POSTED DELAY
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(opening.this, com.example.newsmp.SplashC.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}