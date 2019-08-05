package com.team2.mtglifetracker.lib;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class Globals {
    Context mContext;

    public Globals(Context context) {
        this.mContext = context;
    }

    public void changeScore(TextView currentScore, Boolean add) {
        // increment/decrement score by 1, determined by boolean value
        int score = Integer.parseInt(currentScore.getText().toString());
        if (add) {
            currentScore.setText(String.valueOf(score + 1));
        } else {
            currentScore.setText(String.valueOf(score - 1));
        }
    }

    public Intent selectIntent(View v, Class nextActivity, int layoutType, int playerCount, int startingLife) {
        // instantiates new intent to send user (and data) to the next activity
        Intent intent = new Intent(v.getContext(), nextActivity );

        intent.putExtra("layoutType", layoutType);
        intent.putExtra("playerCount", playerCount);
        intent.putExtra("startingLife", startingLife);

        return intent;
    }

    public Intent selectIntent(View v, Class nextActivity, int playerCount, int startingLife) {
        // instantiates new intent to send user (and data) to the next activity
        Intent intent = new Intent(v.getContext(), nextActivity );

        intent.putExtra("playerCount", playerCount);
        intent.putExtra("startingLife", startingLife);

        return intent;
    }




}
