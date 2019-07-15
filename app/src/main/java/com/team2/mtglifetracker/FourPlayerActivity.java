package com.team2.mtglifetracker;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class FourPlayerActivity extends AppCompatActivity {

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

        setContentView(R.layout.activity_four_player1);

        // get up/down buttons for each player
        Button p1UpBtn = findViewById(R.id.p1UpBtn);
        Button p1DownBtn = findViewById(R.id.p1DownBtn);

        Button p2UpBtn = findViewById(R.id.p2UpBtn);
        Button p2DownBtn = findViewById(R.id.p2DownBtn);

        Button p3UpBtn = findViewById(R.id.p3UpBtn);
        Button p3DownBtn = findViewById(R.id.p3DownBtn);

        Button p4UpBtn = findViewById(R.id.p4UpBtn);
        Button p4DownBtn = findViewById(R.id.p4DownBtn);

        // get reset button
        ImageButton optBtn = findViewById(R.id.playerOptBtn);

        // get current scores for each player
        final TextView p1CurrScore = findViewById(R.id.p1Score);
        final TextView p2CurrScore = findViewById(R.id.p2Score);
        final TextView p3CurrScore = findViewById(R.id.p3Score);
        final TextView p4CurrScore = findViewById(R.id.p4Score);

        // change color demo:
        // (see https://stackoverflow.com/questions/17823451/set-android-shape-color-programmatically
        // for details)

        // get container backgrounds for each player
        Drawable p1ContainerBg = findViewById(R.id.p1Container).getBackground().mutate();
        Drawable p2ContainerBg = findViewById(R.id.p2Container).getBackground().mutate();
        Drawable p3ContainerBg = findViewById(R.id.p3Container).getBackground().mutate();
        Drawable p4ContainerBg = findViewById(R.id.p4Container).getBackground().mutate();

        if (p4ContainerBg instanceof ShapeDrawable) {
            ((ShapeDrawable)p4ContainerBg).getPaint()
                    .setColor(ContextCompat.getColor(this, R.color.yellow));
        } else if (p4ContainerBg instanceof GradientDrawable) {
            ((GradientDrawable)p4ContainerBg)
                    .setColor(ContextCompat.getColor(this, R.color.yellow));
        } else if (p4ContainerBg instanceof ColorDrawable) {
            ((ColorDrawable)p4ContainerBg)
                    .setColor(ContextCompat.getColor(this, R.color.yellow));
        }

        // set up click listeners for the up/down buttons:
        // player 1
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

        // player 2
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

        // player 3
        p3UpBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(p3CurrScore.getText().toString());
                p3CurrScore.setText(String.valueOf(score + 1));
            }
        });

        p3DownBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(p3CurrScore.getText().toString());
                p3CurrScore.setText(String.valueOf(score - 1));
            }
        });

        // player 4
        p4UpBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(p4CurrScore.getText().toString());
                p4CurrScore.setText(String.valueOf(score + 1));
            }
        });

        p4DownBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(p4CurrScore.getText().toString());
                p4CurrScore.setText(String.valueOf(score - 1));
            }
        });

        // set up click listeners for the options:
        //   reset
        optBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FourPlayerActivity.this, "Options Button clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
