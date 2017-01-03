package com.example.android.americanfootballscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }

    public void threeA(View view) {
        scoreA += 3;
        displayA(scoreA);
    }

    public void twoA(View view) {
        scoreA += 2;
        displayA(scoreA);
    }

    public void oneA(View view) {
        scoreA += 1;
        displayA(scoreA);
    }

    public void sixA(View view) {
        scoreA += 6;
        displayA(scoreA);
    }

    public void displayA(int score) {
        TextView tx = (TextView) findViewById(R.id.scoreA);
        tx.setText("" + score);
    }

    public void threeB(View view) {
        scoreB += 3;
        displayB(scoreB);
    }

    public void twoB(View view) {
        scoreB += 2;
        displayB(scoreB);
    }

    public void oneB(View view) {
        scoreB += 1;
        displayB(scoreB);
    }

    public void sixB(View view) {
        scoreB += 6;
        displayB(scoreB);
    }

    public void displayB(int score) {
        TextView tx = (TextView) findViewById(R.id.scoreB);
        tx.setText("" + score);
    }


}
