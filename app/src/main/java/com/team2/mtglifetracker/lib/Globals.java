package com.team2.mtglifetracker.lib;

import android.content.Context;
import android.widget.TextView;

public class Globals {
    Context mContext;

    public Globals(Context context) {
        this.mContext = context;
    }

    public void changeScore(TextView currentScore, Boolean add) {
        int score = Integer.parseInt(currentScore.getText().toString());
        if (add) {
            currentScore.setText(String.valueOf(score + 1));
        } else {
            currentScore.setText(String.valueOf(score - 1));
        }
    }




}
