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

public class LifeSelectActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Globals.clearScreen(this);

        setContentView(R.layout.activity_life_select);

        Button lifeUpBtn = findViewById(R.id.lifeUpBtn);
        Button lifeDwnBtn = findViewById(R.id.lifeDwnBtn);
        Button contBtn = findViewById(R.id.continueBtn);
        final TextView lifecount = findViewById(R.id.lifecount);


        lifeUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Globals.incrementer(lifecount, 10, true);
            }

        });

        lifeDwnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Globals.incrementer(lifecount, 10, false);
            }

        });

        contBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Globals.selectIntent(v, PlayerSelectActivity.class,
                        Integer.parseInt(lifecount.getText().toString())));
            }
        });

    }
}
