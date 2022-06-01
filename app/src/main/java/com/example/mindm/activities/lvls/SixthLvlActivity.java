package com.example.mindm.activities.lvls;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mindm.Player;
import com.example.mindm.Settings;
import com.example.mindm.activities.LevelsActivity;
import com.example.mindm.R;

import java.util.Arrays;

public class SixthLvlActivity extends AppCompatActivity implements GestureDetector.OnGestureListener{
    private ImageView back, player, finish;
    private float x1, x2, y1, y2;
    private static int MIN_DISTANCE = 150;
    private GestureDetector gestureDetector;
    private Player p = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_lvl);
        set();
        this.gestureDetector = new GestureDetector(SixthLvlActivity.this, this);
    }

    public void set() {
        back = findViewById(R.id.backLvl6);
        player = findViewById(R.id.player6);
        finish = findViewById(R.id.finish6);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SixthLvlActivity.this, LevelsActivity.class);
                startActivity(intent);
            }
        });
        if (new Settings().isRandomSkin()) {
            player.setImageResource(new Player().randomColor());
        } else {
            player.setImageResource(R.drawable.red);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                y1 = event.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                y2 = event.getY();
                float valueX = x2 - x1;
                float valueY = y2 - y1;

                if (Math.abs(valueX) > MIN_DISTANCE) {
                    if (x2 > x1) {
                        Toast.makeText(this, "Right", Toast.LENGTH_SHORT).show();
                        player.animate().x(player.getX() + 205).y(player.getY()).setDuration(100).start();
                    } else {
                        Toast.makeText(this, "Left", Toast.LENGTH_SHORT).show();
                        player.animate().x(player.getX() - 205).y(player.getY()).setDuration(100).start();
                    }
                } else if (Math.abs(valueY) > MIN_DISTANCE) {
                    if (y2 > y1) {
                        Toast.makeText(this, "Bottom", Toast.LENGTH_SHORT).show();
                        player.animate().x(player.getX()).y(player.getY() + 205).setDuration(100).start();
                    } else {
                        Toast.makeText(this, "Top", Toast.LENGTH_SHORT).show();
                        player.animate().x(player.getX()).y(player.getY() - 205).setDuration(100).start();

                    }
                }
                int test[] = new int[2];
                int xy[] = {781, 1167};
                player.getLocationOnScreen(test);
                System.out.println(Arrays.toString(test));
                if (Arrays.equals(test, xy)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(SixthLvlActivity.this);
                    builder.setTitle("test");
                    builder.setMessage("test");
                    builder.setCancelable(true);
                    builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // Кнопка ОК
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(SixthLvlActivity.this, SeventhLvlActivity.class);
                            startActivity(intent);
                        }
                    });
                    AlertDialog dialog = builder.create();
                    System.out.println("s");
                    int coins = p.getCoins();
                    p.setCoins(coins + 50);
                }
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }
}