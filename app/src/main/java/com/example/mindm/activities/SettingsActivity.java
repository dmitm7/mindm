package com.example.mindm.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

import com.example.mindm.R;
import com.example.mindm.Settings;

public class SettingsActivity extends AppCompatActivity {
    private Switch randomizerSkin;
    private ImageView back;
    private Settings settings = new Settings();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        set();
        SharedPreferences prefs = getSharedPreferences("test", Context.MODE_PRIVATE);
        boolean switchState = prefs.getBoolean("switchState", true);

        randomizerSkin.setChecked(switchState);
    }

    public void set() {
        randomizerSkin = findViewById(R.id.randomSkin);
        back = findViewById(R.id.backMain3);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                switch(view.getId()) {
                    case R.id.backMain3:
                        Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        back.setOnClickListener(listener);
        CompoundButton.OnCheckedChangeListener switchListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                switch(compoundButton.getId()) {
                    case R.id.randomSkin:
                        SharedPreferences.Editor ed = getSharedPreferences("test", Context.MODE_PRIVATE).edit();
                        ed.putBoolean("switchState", compoundButton.isChecked());
                        ed.commit();
                        if (compoundButton.isChecked()) {
                            settings.setRandomSkin(false);
                            System.out.println("dk");
                        } else {
                            settings.setRandomSkin(true);
                            System.out.println("ie");
                        }
                }
            }
        };
        randomizerSkin.setOnCheckedChangeListener(switchListener);

    }

}