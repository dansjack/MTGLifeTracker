package com.team2.mtglifetracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class LayoutSelectActivity extends AppCompatActivity {
    int playerCount = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // this removes the title bar from the activity
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        // hide's the title bar
        getSupportActionBar().hide();

        // enable full screen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        // determine content view
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            playerCount = extras.getInt("playerCount");
        }

        if (playerCount == 2) {
            setContentView(R.layout.activity_layout_select_2p);
        } else if (playerCount == 4) {
            setContentView(R.layout.activity_layout_select_4p);
        }


        Button layout1Btn = findViewById(R.id.l1Btn);
        Button layout2Btn = findViewById(R.id.l2Btn);

        layout1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playerCount == 2) {
                    Intent gameSelectIntent = new Intent(v.getContext(), GameActivity.class );
                    gameSelectIntent.putExtra("layoutType", 2);
                    gameSelectIntent.putExtra("playerCount", playerCount);
                    startActivity(gameSelectIntent);
                } else if (playerCount == 4) {
                    Intent gameSelectIntent = new Intent(v.getContext(), GameActivity.class );
                    gameSelectIntent.putExtra("layoutType", 1);
                    gameSelectIntent.putExtra("playerCount", playerCount);
                    startActivity(gameSelectIntent);
                }
            }
        });

        layout2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playerCount == 2) {
                    Intent gameSelectIntent = new Intent(v.getContext(), GameActivity.class );
                    gameSelectIntent.putExtra("layoutType", 1);
                    gameSelectIntent.putExtra("playerCount", playerCount);
                    startActivity(gameSelectIntent);
                } else if (playerCount == 4) {
                    Intent gameSelectIntent = new Intent(v.getContext(), GameActivity.class );
                    gameSelectIntent.putExtra("layoutType", 2);
                    gameSelectIntent.putExtra("playerCount", playerCount);
                    startActivity(gameSelectIntent);
                }
            }

        });
    }
}
