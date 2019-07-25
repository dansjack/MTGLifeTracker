package com.team2.mtglifetracker;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class LifeSelectActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // this removes the title bar from the activity
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        // hide's the title bar
        getSupportActionBar().hide();

        // enable full screen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_life_select);


        Button lifeUpBtn = findViewById(R.id.lifeUpBtn);
        Button lifeDwnBtn = findViewById(R.id.lifeDwnBtn);
        final TextView lifecount = findViewById(R.id.lifecount);

        lifeUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int life = Integer.parseInt(lifecount.getText().toString());
                lifecount.setText(String.valueOf(life + 10));
            }

        });

        lifeDwnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int life = Integer.parseInt(lifecount.getText().toString());
                lifecount.setText(String.valueOf(life - 10));
            }

        });

    }
}
