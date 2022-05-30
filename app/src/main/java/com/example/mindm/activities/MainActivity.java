package com.example.mindm.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mindm.Player;
import com.example.mindm.R;


public class MainActivity extends AppCompatActivity{
    Button btnPlay, btnShop, btnSettings, btnExit;
    Player player = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getSupportActionBar()!=null)
            this.getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        set();

    }
    public void set() {
        btnPlay = findViewById(R.id.btnPlay);
        btnShop = findViewById(R.id.btnShop);
        btnSettings = findViewById(R.id.btnSettings);
        btnExit = findViewById(R.id.btnExit);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                switch(view.getId()) {
                    case R.id.btnPlay:
                        Intent intent = new Intent(MainActivity.this, LevelsActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.btnShop:
                        Intent intent1 = new Intent(MainActivity.this, ShopActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.btnSettings:
                        Intent intent2 = new Intent(MainActivity.this, SettingsActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.btnExit:
                        finish();
                        System.exit(0);
                        break;
                }
            }
        };
        btnPlay.setOnClickListener(listener);
        btnShop.setOnClickListener(listener);
        btnSettings.setOnClickListener(listener);
        btnExit.setOnClickListener(listener);

    }
}