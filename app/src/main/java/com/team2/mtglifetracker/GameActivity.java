package com.team2.mtglifetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.team2.mtglifetracker.lib.Globals;

public class GameActivity extends AppCompatActivity {
    int layoutType = 0;
    int playerCount = 0;
    int startingLife = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Globals.clearScreen(this);

        // get data from previous activities
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            layoutType = extras.getInt("layoutType");
            playerCount = extras.getInt("playerCount");
            startingLife = extras.getInt("startingLife");
        }

        // determine content view
        switch (playerCount) {
            case 4:
                if (layoutType == 2) {
                    setContentView(R.layout.activity_four_player2);
                } else if (layoutType == 1) {
                    setContentView(R.layout.activity_four_player1);
                }
                break;
            case 2:
                if (layoutType == 2) {
                    setContentView(R.layout.activity_two_player2);
                } else if (layoutType == 1) {
                    setContentView(R.layout.activity_two_player1);
                }
                break;
            default:
                setContentView(R.layout.activity_three_player);
        }

        // Stores buttons, player scores, and sets onClick listeners according to player count
        switch (playerCount) {
            case 4:
                Button p4UpBtn = findViewById(R.id.p4UpBtn);
                Button p4DownBtn = findViewById(R.id.p4DownBtn);

                final TextView p4CurrScore = findViewById(R.id.p4Score);
                p4CurrScore.setText(String.valueOf(startingLife));


                p4UpBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Globals.incrementer(p4CurrScore, 1,true);
                    }
                });

                p4DownBtn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Globals.incrementer(p4CurrScore, 1,false);

                    }
                });
            case 3:
                Button p3UpBtn = findViewById(R.id.p3UpBtn);
                Button p3DownBtn = findViewById(R.id.p3DownBtn);

                final TextView p3CurrScore = findViewById(R.id.p3Score);
                p3CurrScore.setText(String.valueOf(startingLife));

                p3UpBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Globals.incrementer(p3CurrScore, 1, true);
                    }
                });

                p3DownBtn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Globals.incrementer(p3CurrScore, 1, false);
                    }
                });
            case 2:
                Button p1UpBtn = findViewById(R.id.p1UpBtn);
                Button p1DownBtn = findViewById(R.id.p1DownBtn);
                Button p2UpBtn = findViewById(R.id.p2UpBtn);
                Button p2DownBtn = findViewById(R.id.p2DownBtn);

                final TextView p1CurrScore = findViewById(R.id.p1Score);
                final TextView p2CurrScore = findViewById(R.id.p2Score);
                p1CurrScore.setText(String.valueOf(startingLife));
                p2CurrScore.setText(String.valueOf(startingLife));

                p1UpBtn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // do something when up button clicked
                        Globals.incrementer(p1CurrScore, 1, true);
                    }
                });

                p1DownBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Globals.incrementer(p1CurrScore, 1, false);
                    }
                });

                // player 2
                p2UpBtn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Globals.incrementer(p2CurrScore, 1, true);
                    }
                });

                p2DownBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Globals.incrementer(p2CurrScore, 1, false);
                    }
                });

                // get reset button
                ImageButton optBtn = findViewById(R.id.playerOptBtn);

                // set up click listeners for the OptionsActivity button:
                optBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openOptions();
                    }

                });
                break;
        }

    }

    private void openOptions() {
        Intent intent = new Intent(this, OptionsActivity.class);
        intent.putExtra("startingLife", startingLife);
        intent.putExtra("layoutType", layoutType);
        intent.putExtra("playerCount", playerCount);
        startActivity(intent);
    }
}
