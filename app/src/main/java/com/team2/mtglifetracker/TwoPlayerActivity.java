package com.team2.mtglifetracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class TwoPlayerActivity extends AppCompatActivity {
    // ADD GUIDELINES FOR MIDDLE BUTTON IN LAYOUT
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // this removes the title bar from the activity
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        // hide's the title bar
        getSupportActionBar().hide();

        // enable full screen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        // Select two-player layout type
        setContentView(R.layout.activity_two_player2);

        // get up/down buttons for each player
        Button p1UpBtn = findViewById(R.id.p1UpBtn);
        Button p1DownBtn = findViewById(R.id.p1DownBtn);

        Button p2UpBtn = findViewById(R.id.p2UpBtn);
        Button p2DownBtn = findViewById(R.id.p2DownBtn);

        // get reset button
        ImageButton optBtn = findViewById(R.id.playerOptBtn);


        // get current scores for each player
        final TextView p1CurrScore = findViewById(R.id.p1Score);
        final TextView p2CurrScore = findViewById(R.id.p2Score);

        // set up click listeners for the up/down buttons:
        //   player 1
        p1UpBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // do something when up button clicked
                int score = Integer.parseInt(p1CurrScore.getText().toString());
                p1CurrScore.setText(String.valueOf(score + 1));
            }
        });

        p1DownBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(p1CurrScore.getText().toString());
                p1CurrScore.setText(String.valueOf(score - 1));
            }
        });

        //   player 2
        p2UpBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(p2CurrScore.getText().toString());
                p2CurrScore.setText(String.valueOf(score + 1));
            }
        });

        p2DownBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(p2CurrScore.getText().toString());
                p2CurrScore.setText(String.valueOf(score - 1));
            }
        });

        // set up click listeners for the options:
        //   reset
        optBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TwoPlayerActivity.this, "Options Button clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
