package com.example.mindm;

import android.view.GestureDetector;

import java.util.ArrayList;
import java.util.Random;

public class Player {
    private ArrayList<Integer> colors = new ArrayList<>();
    private GestureDetector gestureDetector;
    private int coins = 0;

    public Player() {
        colors.add(R.drawable.black);
        colors.add(R.drawable.blue);
        colors.add(R.drawable.brown);
        colors.add(R.drawable.light_blue);
        colors.add(R.drawable.orange);
        colors.add(R.drawable.pink);
        colors.add(R.drawable.purple);
        colors.add(R.drawable.red);
        colors.add(R.drawable.yellow);
    }

    public Integer randomColor() {
        return colors.get(new Random().nextInt(colors.size()));
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}

