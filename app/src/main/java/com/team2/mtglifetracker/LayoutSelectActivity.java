package com.team2.mtglifetracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.team2.mtglifetracker.lib.Globals;

public class LayoutSelectActivity extends AppCompatActivity {
    int playerCount = 0;
    int startingLife = 0;
    Globals glog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        glog = new Globals(getApplicationContext());
        glog.clearScreen(this);

        // determine content view
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            playerCount = extras.getInt("playerCount");
            startingLife = extras.getInt("startingLife");
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
                startActivity(glog.selectIntent(v, GameActivity.class, 1, playerCount, startingLife));
            }
        });

        layout2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(glog.selectIntent(v, GameActivity.class, 2, playerCount, startingLife));
            }

        });
    }
}
