package com.team2.mtglifetracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class PlayerSelectActivity extends AppCompatActivity {

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

        setContentView(R.layout.activity_player_select);

        // get buttons
        ImageButton select2PBtn = findViewById(R.id.twoPlayerBtn);
        ImageButton select4PBtn = findViewById(R.id.fourPlayerBtn);

        // TODO: get life start selection from previous activity

        select2PBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PlayerSelectActivity.this, "Selects 2 player game",
                        Toast.LENGTH_SHORT).show();
            }
        });

        select4PBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PlayerSelectActivity.this, "Selects 4 player game",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}
