package com.example.newsmp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SplashC extends AppCompatActivity {
    private long backPressedTime;
    private Toast backToast;
    boolean isPressed = false;
    Button menu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_c);

        menu1 = findViewById(R.id.btn_SC);
        menu1.setOnClickListener(view -> {
            Intent i = new Intent(SplashC.this, com.example.newsmp.favoriteN.class);
            startActivity(i);
        });
    }
}