package com.example.mindm.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mindm.R;
import com.example.mindm.activities.lvls.EighthLvlActivity;
import com.example.mindm.activities.lvls.FifthLvlActivity;
import com.example.mindm.activities.lvls.FirstLvlActivity;
import com.example.mindm.activities.lvls.FourthLvlActivity;
import com.example.mindm.activities.lvls.NinthLvlActivity;
import com.example.mindm.activities.lvls.SecondLvlActivity;
import com.example.mindm.activities.lvls.SeventhLvlActivity;
import com.example.mindm.activities.lvls.SixthLvlActivity;
import com.example.mindm.activities.lvls.TenthLvlActivity;
import com.example.mindm.activities.lvls.ThirdLvlActivity;

public class LevelsActivity extends AppCompatActivity {
    Button lvl1, lvl2, lvl3, lvl4, lvl5, lvl6, lvl7, lvl8, lvl9, lvl10;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        set();

    }
    public void set() {
        lvl1 = findViewById(R.id.lvl1);
        lvl2 = findViewById(R.id.lvl2);
        lvl3 = findViewById(R.id.lvl3);
        lvl4 = findViewById(R.id.lvl4);
        lvl5 = findViewById(R.id.lvl5);
        lvl6 = findViewById(R.id.lvl6);
        lvl7 = findViewById(R.id.lvl7);
        lvl8 = findViewById(R.id.lvl8);
        lvl9 = findViewById(R.id.lvl9);
        lvl10 = findViewById(R.id.lvl10);
        back = findViewById(R.id.backMain);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                switch(view.getId()) {
                    case R.id.backMain:
                        Intent intent = new Intent(LevelsActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.lvl1:
                        Intent intent1 = new Intent(LevelsActivity.this, FirstLvlActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.lvl2:
                        Intent intent2 = new Intent(LevelsActivity.this, SecondLvlActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.lvl3:
                        Intent intent3 = new Intent(LevelsActivity.this, ThirdLvlActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.lvl4:
                        Intent intent4 = new Intent(LevelsActivity.this, FourthLvlActivity.class);
                        startActivity(intent4);
                        break;
                    case R.id.lvl5:
                        Intent intent5 = new Intent(LevelsActivity.this, FifthLvlActivity.class);
                        startActivity(intent5);
                        break;
                    case R.id.lvl6:
                        Intent intent6 = new Intent(LevelsActivity.this, SixthLvlActivity.class);
                        startActivity(intent6);
                        break;
                    case R.id.lvl7:
                        Intent intent7 = new Intent(LevelsActivity.this, SeventhLvlActivity.class);
                        startActivity(intent7);
                        break;
                    case R.id.lvl8:
                        Intent intent8 = new Intent(LevelsActivity.this, EighthLvlActivity.class);
                        startActivity(intent8);
                        break;
                    case R.id.lvl9:
                        Intent intent9 = new Intent(LevelsActivity.this, NinthLvlActivity.class);
                        startActivity(intent9);
                        break;
                    case R.id.lvl10:
                        Intent intent10 = new Intent(LevelsActivity.this, TenthLvlActivity.class);
                        startActivity(intent10);
                        break;
                }
            }
        };
        back.setOnClickListener(listener);
        lvl1.setOnClickListener(listener);
        lvl2.setOnClickListener(listener);
        lvl3.setOnClickListener(listener);
        lvl4.setOnClickListener(listener);
        lvl5.setOnClickListener(listener);
        lvl6.setOnClickListener(listener);
        lvl7.setOnClickListener(listener);
        lvl8.setOnClickListener(listener);
        lvl9.setOnClickListener(listener);
        lvl10.setOnClickListener(listener);
    }
}