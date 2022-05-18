package com.example.newsmp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class favoriteN extends AppCompatActivity {
    private long backPressedTime;
    private Toast backToast;
    boolean isPressed = false;
    ImageButton menu1, menu2, menu3, menu4, menu5, menu6;
    Button next, ignore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_n);


        menu1 = findViewById(R.id.imgbtn_soc);
        menu2 = findViewById(R.id.imgbtn_ent);
        menu3 = findViewById(R.id.imgbtn_pol);
        menu4 = findViewById(R.id.imgbtn_hea);
        menu5 = findViewById(R.id.imgbtn_auto);
        menu6 = findViewById(R.id.imgbtn_tech);
        next = findViewById(R.id.btn_cn);
        ignore = findViewById(R.id.btn_skip);

        menu1.setOnClickListener(view -> {
            menu1.setBackgroundResource(R.drawable.round_btn2);
            menu2.setBackgroundResource(R.drawable.round_btn3);
            menu3.setBackgroundResource(R.drawable.round_btn3);
            menu4.setBackgroundResource(R.drawable.round_btn3);
            menu5.setBackgroundResource(R.drawable.round_btn3);
            menu6.setBackgroundResource(R.drawable.round_btn3);


        });

        menu2.setOnClickListener(view -> {
            menu2.setBackgroundResource(R.drawable.round_btn2);
            menu1.setBackgroundResource(R.drawable.round_btn3);
            menu3.setBackgroundResource(R.drawable.round_btn3);
            menu4.setBackgroundResource(R.drawable.round_btn3);
            menu5.setBackgroundResource(R.drawable.round_btn3);
            menu6.setBackgroundResource(R.drawable.round_btn3);
        });

        menu3.setOnClickListener(view -> {
            menu3.setBackgroundResource(R.drawable.round_btn2);
            menu2.setBackgroundResource(R.drawable.round_btn3);
            menu1.setBackgroundResource(R.drawable.round_btn3);
            menu4.setBackgroundResource(R.drawable.round_btn3);
            menu5.setBackgroundResource(R.drawable.round_btn3);
            menu6.setBackgroundResource(R.drawable.round_btn3);
        });

        menu4.setOnClickListener(view -> {
            menu4.setBackgroundResource(R.drawable.round_btn2);
            menu2.setBackgroundResource(R.drawable.round_btn3);
            menu3.setBackgroundResource(R.drawable.round_btn3);
            menu1.setBackgroundResource(R.drawable.round_btn3);
            menu5.setBackgroundResource(R.drawable.round_btn3);
            menu6.setBackgroundResource(R.drawable.round_btn3);
        });

        menu5.setOnClickListener(view -> {
            menu5.setBackgroundResource(R.drawable.round_btn2);
            menu2.setBackgroundResource(R.drawable.round_btn3);
            menu3.setBackgroundResource(R.drawable.round_btn3);
            menu4.setBackgroundResource(R.drawable.round_btn3);
            menu1.setBackgroundResource(R.drawable.round_btn3);
            menu6.setBackgroundResource(R.drawable.round_btn3);
        });

        menu6.setOnClickListener(view -> {
            menu6.setBackgroundResource(R.drawable.round_btn2);
            menu2.setBackgroundResource(R.drawable.round_btn3);
            menu3.setBackgroundResource(R.drawable.round_btn3);
            menu4.setBackgroundResource(R.drawable.round_btn3);
            menu5.setBackgroundResource(R.drawable.round_btn3);
            menu1.setBackgroundResource(R.drawable.round_btn3);
        });


        next.setOnClickListener(view -> {
            Intent i = new Intent(favoriteN.this, MainActivity.class);
            startActivity(i);
            finish();
        });

        ignore.setOnClickListener(view -> {
            Intent j = new Intent(favoriteN.this, MainActivity.class);
            startActivity(j);
            finish();
        });
    }

}