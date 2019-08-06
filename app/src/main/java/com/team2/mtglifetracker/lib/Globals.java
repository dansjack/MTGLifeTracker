package com.team2.mtglifetracker.lib;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Objects;

public class Globals {
    private Context mContext;

    public Globals(Context context) {
        this.mContext = context;
    }

    public void incrementer(TextView toIncrement, int inc, Boolean increment) {
        // increment/decrement an int by an int, inc/dec determined by boolean
        int value = Integer.parseInt(toIncrement.getText().toString());
        if (increment) {
            toIncrement.setText(String.valueOf(value + inc));
        } else {
            toIncrement.setText(String.valueOf(value - inc));
        }
    }

    public Intent selectIntent(View v, Class nextActivity, int layoutType, int playerCount, int startingLife) {
        // instantiates new intent to send user (and data) to the next activity (3 extras)
        Intent intent = new Intent(v.getContext(), nextActivity );

        intent.putExtra("layoutType", layoutType);
        intent.putExtra("playerCount", playerCount);
        intent.putExtra("startingLife", startingLife);

        return intent;
    }

    public Intent selectIntent(View v, Class nextActivity, int playerCount, int startingLife) {
        // instantiates new intent to send user (and data) to the next activity (2 extras)
        Intent intent = new Intent(v.getContext(), nextActivity );

        intent.putExtra("playerCount", playerCount);
        intent.putExtra("startingLife", startingLife);

        return intent;
    }

    public Intent selectIntent(View v, Class nextActivity, int startingLife) {
        // instantiates new intent to send user (and data) to the next activity (1 extra)
        Intent intent = new Intent(v.getContext(), nextActivity );

        intent.putExtra("startingLife", startingLife);

        return intent;
    }

    public void clearScreen(AppCompatActivity context) {
        // makes three changes to the default Activity layout

        // this removes the title bar from the activity
        context.requestWindowFeature(Window.FEATURE_NO_TITLE);

        // hide's the title bar
        Objects.requireNonNull(context.getSupportActionBar()).hide();

        // enable full screen
        context.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }



}
