package com.team2.mtglifetracker;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.team2.mtglifetracker.lib.Globals;

public class HomeActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Globals.clearScreen(this);

        setContentView(R.layout.activity_home);


        Button beginBtn = findViewById(R.id.beginBtn);

        beginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Initialize Intent (intents are how we signal to Android we want to change activities)
                startActivity(new Intent(v.getContext(), LifeSelectActivity.class ));
            }

        });

    }
}
