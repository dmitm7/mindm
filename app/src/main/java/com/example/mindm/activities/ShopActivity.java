package com.example.mindm.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mindm.R;

public class ShopActivity extends AppCompatActivity {
    TextView coins;
    Button btnBuySkin1, btnBuySkin2, btnBuySkin3, btnBuySkin4;
    ImageView back, skin1, skin2, skin3, skin4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        set();
    }

    public void set() {
        back = findViewById(R.id.backMain2);
        btnBuySkin1 = findViewById(R.id.btnBuySkin1);
        btnBuySkin2 = findViewById(R.id.btnBuySkin2);
        btnBuySkin3 = findViewById(R.id.btnBuySkin3);
        btnBuySkin4 = findViewById(R.id.btnBuySkin4);
        coins = findViewById(R.id.coins);
        skin1 = findViewById(R.id.imgSkin1);
        skin2 = findViewById(R.id.imgSkin2);
        skin3 = findViewById(R.id.imgSkin3);
        skin4 = findViewById(R.id.imgSkin4);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                switch(view.getId()) {
                    case R.id.backMain2:
                        Intent intent = new Intent(ShopActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.btnBuySkin1:
                    case R.id.btnBuySkin2:
                    case R.id.btnBuySkin3:
                    case R.id.btnBuySkin4:
                        Toast.makeText(ShopActivity.this, "Недостаточно средств", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };
        back.setOnClickListener(listener);
        btnBuySkin1.setOnClickListener(listener);
        btnBuySkin2.setOnClickListener(listener);
        btnBuySkin3.setOnClickListener(listener);
        btnBuySkin4.setOnClickListener(listener);

    }
}