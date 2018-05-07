package com.example.android.courtcounter;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A in a game by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

        if (scoreTeamA == 21 && scoreTeamB < 20) {
            displayForTeamA("You win!");
            displayForTeamB("You Lose!");
        } else if (scoreTeamA >= 22 && scoreTeamA == scoreTeamB + 2) {

            displayForTeamA("You Win!");
            displayForTeamB("You Lose!");

        } else if (scoreTeamA == 30 && scoreTeamA == scoreTeamB + 1) {
            displayForTeamA("You Win!");
            displayForTeamB("You Lose!");
        }
    }


    /**
     * Increase the score for Team A in a game by 1 point after Team B commits a foul.
     */
    public void teamBFoul(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

        if (scoreTeamA == 21 && scoreTeamB < 20) {
            displayForTeamA("You win!");
            displayForTeamB("You Lose!");
        } else if (scoreTeamA >= 22 && scoreTeamA == scoreTeamB + 2) {

            displayForTeamA("You Win!");
            displayForTeamB("You Lose!");

        } else if (scoreTeamA == 30 && scoreTeamA == scoreTeamB + 1) {
            displayForTeamA("You Win!");
            displayForTeamB("You Lose!");
        }
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B in a game by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

        if (scoreTeamB == 21 && scoreTeamA < 20) {

            displayForTeamB("You win!");
            displayForTeamA("You Lose!");
        } else if (scoreTeamB >= 22 && scoreTeamB == scoreTeamA + 2) {
            displayForTeamB("You Win!");
            displayForTeamA("You Lose!");

        } else if (scoreTeamB == 30 && scoreTeamB == scoreTeamA + 1) {
            displayForTeamB("You Win!");
            displayForTeamA("You Lose!");
        }
    }


    /**
     * Increase the score for Team B in a game by 1 point after Team A commits a foul.
     */
    public void teamAFoul(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

        if (scoreTeamB == 21 && scoreTeamA < 20) {

            displayForTeamB("You win!");
            displayForTeamA("You Lose!");
        } else if (scoreTeamB >= 22 && scoreTeamB == scoreTeamA + 2) {
            displayForTeamB("You Win!");
            displayForTeamA("You Lose!");

        } else if (scoreTeamB == 30 && scoreTeamB == scoreTeamA + 1) {
            displayForTeamB("You Win!");
            displayForTeamA("You Lose!");
        }
    }

    /**
     * Resets the scores for Team A and B to 0.
     */

    public void resetScoreToZero(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamA("");
        displayForTeamB("");
    }

    public void displayForTeamA(String msg) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_msg);
        scoreView.setText(String.valueOf(msg));
    }


    public void displayForTeamB(String msg) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_msg);
        scoreView.setText(String.valueOf(msg));
    }
}







