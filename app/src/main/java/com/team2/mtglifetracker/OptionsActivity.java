package com.team2.mtglifetracker;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import com.team2.mtglifetracker.lib.Globals;

public class OptionsActivity extends AppCompatActivity {
    private static final String TAG = OptionsActivity.class.getName();
    private Button button;
    int layoutType = 0;
    int playerCount = 0;
    int startingLife = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //get starting life from GameActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            layoutType = extras.getInt("layoutType");
            playerCount = extras.getInt("playerCount");
            startingLife = extras.getInt("startingLife");
        }
        Globals.clearScreen(this);

        setContentView(R.layout.activity_options);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //make the home button
        final ImageButton homeBtn = findViewById(R.id.homeBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });

        final ImageButton diceBtn = findViewById(R.id.diceBtn);
        diceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDice();
            }
        });

        //make the reset button
        ImageButton resetBtn = findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                openGame();
            }
        });

        }

    private void openGame() {
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("layoutType", layoutType);
        intent.putExtra("startingLife", startingLife);
        intent.putExtra("playerCount", playerCount);
        startActivity(intent);


    }

    private void openHome() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    private void openDice() {
        Intent intent = new Intent(this, DiceRoll.class);
        startActivity(intent);
    }
}

