package com.team2.mtglifetracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.team2.mtglifetracker.lib.Globals;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DiceRoll extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Globals.clearScreen(this);


        setContentView(R.layout.activity_dice_roll);

        final Button d4Btn = findViewById(R.id.d4);
        final Button d6Btn = findViewById(R.id.d6);
        final Button d8Btn = findViewById(R.id.d8);
        final Button d10Btn = findViewById(R.id.d10);
        final Button d12Btn = findViewById(R.id.d12);
        final Button d20Btn = findViewById(R.id.d20);
        final Button backToOptBtn = findViewById(R.id.backToOpt);
        final TextView dResultTitle = findViewById(R.id.dResultTitle);
        final TextView dResult = findViewById(R.id.dResult);

        d4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d4BtnClicked(dResultTitle, dResult);
            }
        });
        d6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d6BtnClicked(dResultTitle, dResult);
            }
        });
        d8Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d8BtnClicked(dResultTitle, dResult);
            }
        });
        d10Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d10BtnClicked(dResultTitle, dResult);
            }
        });
        d12Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d12BtnClicked(dResultTitle, dResult);
            }
        });
        d20Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d20BtnClicked(dResultTitle, dResult);
            }
        });

        backToOptBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void d4BtnClicked(TextView dResultTitle, TextView dResult) {
        dResultTitle.setText(getString(R.string.d4_title_string));
        dResult.setText(String.valueOf(rng(4)));
    }

    private void d6BtnClicked(TextView dResultTitle, TextView dResult) {
        dResultTitle.setText(getString(R.string.d6_title_string));
        dResult.setText(String.valueOf(rng(6)));
    }

    private void d8BtnClicked(TextView dResultTitle, TextView dResult) {
        dResultTitle.setText(getString(R.string.d8_title_string));
        dResult.setText(String.valueOf(rng(8)));
    }

    private void d10BtnClicked(TextView dResultTitle, TextView dResult) {
        dResultTitle.setText(getString(R.string.d10_title_string));
        dResult.setText(String.valueOf(rng(10)));
    }

    private void d12BtnClicked(TextView dResultTitle, TextView dResult) {
        dResultTitle.setText(getString(R.string.d12_title_string));
        dResult.setText(String.valueOf(rng(12)));
    }

    private void d20BtnClicked(TextView dResultTitle, TextView dResult) {
        dResultTitle.setText(getString(R.string.d20_title_string));
        dResult.setText(String.valueOf(rng(20)));
    }

    private int rng(int n) {
        return ThreadLocalRandom.current().nextInt(1, n + 1);
    }
}
