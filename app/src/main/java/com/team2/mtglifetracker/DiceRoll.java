package com.team2.mtglifetracker;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.team2.mtglifetracker.lib.Globals;

import java.util.concurrent.ThreadLocalRandom;

public class DiceRoll extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Globals.clearScreen(this);


        setContentView(R.layout.activity_dice_roll);

        final ImageButton d4Btn = findViewById(R.id.d4);
        final ImageButton d6Btn = findViewById(R.id.d6);
        final ImageButton d8Btn = findViewById(R.id.d8);
        final ImageButton d10Btn = findViewById(R.id.d10);
        final ImageButton d12Btn = findViewById(R.id.d12);
        final ImageButton d20Btn = findViewById(R.id.d20);

        final TextView d4Result = findViewById(R.id.d4Result);
        final TextView d6Result = findViewById(R.id.d6Result);
        final TextView d8Result = findViewById(R.id.d8Result);
        final TextView d10Result = findViewById(R.id.d10Result);
        final TextView d12Result = findViewById(R.id.d12Result);
        final TextView d20Result = findViewById(R.id.d20Result);

        final Button backToOptBtn = findViewById(R.id.backToOpt);

        d4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dieClicked(4, d4Result);
                showHideDie(d4Btn);
                showHideResult(d4Result);
            }
        });
        d6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dieClicked(6, d6Result);
                showHideDie(d6Btn);
                showHideResult(d6Result);

            }
        });
        d8Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dieClicked(8, d8Result);
                showHideDie(d8Btn);
                showHideResult(d8Result);

            }
        });
        d10Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dieClicked(10, d10Result);
                showHideDie(d10Btn);
                showHideResult(d10Result);

            }
        });
        d12Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dieClicked(12, d12Result);
                showHideDie(d12Btn);
                showHideResult(d12Result);

            }
        });
        d20Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dieClicked(20, d20Result);
                showHideDie(d20Btn);
                showHideResult(d20Result);

            }
        });

        backToOptBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void dieClicked(int n, TextView dResult) {
        dResult.setText(String.valueOf(rng(n)));
    }

    private int rng(int n) {
        return ThreadLocalRandom.current().nextInt(1, n + 1);
    }

    private void showHideDie(final ImageButton d) {
        d.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                d.setVisibility(View.VISIBLE);
            }
        }, 1000);
    }

    private void showHideResult(final TextView result) {
        result.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                result.setVisibility(View.INVISIBLE);
            }
        }, 1000);
    }
}
