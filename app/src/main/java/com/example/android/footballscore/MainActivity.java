package com.example.android.footballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addGoalForA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        TextView scoreView1 = findViewById(R.id.team_a_score1);
        scoreView.setText(String.valueOf(score));
        scoreView1.setText(String.valueOf(score));
    }

    int scoreTeamB = 0;

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addGoalForB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
        TextView scoreView1 = (TextView) findViewById(R.id.team_b_score1);
        scoreView1.setText(String.valueOf(score));
    }

    int freeKickTeamA = 0;

    /**
     * Displays the given free kick for Team A.
     */
    public void addFreeKickForA(View v) {
        freeKickTeamA = freeKickTeamA + 1;
        displayFreeKickTeamA(freeKickTeamA);
    }

    //To display the result
    public void displayFreeKickTeamA(int free) {
        TextView scoreView = (TextView) findViewById(R.id.free_kick_text_view_a);
        scoreView.setText(String.valueOf(free));
    }

    /**
     * Displays the free kick for Team B.
     */
    int freeKickTeamB = 0;

    public void addFreeKickForB(View v) {
        freeKickTeamB = freeKickTeamB + 1;
        displayFreeKickTeamB(freeKickTeamB);
    }

    //To display the result
    public void displayFreeKickTeamB(int free) {
        TextView scoreView = (TextView) findViewById(R.id.free_kick_text_view_b);
        scoreView.setText(String.valueOf(free));
    }

    int foulsTeamA = 0;

    /**
     * Displays the given fouls for Team A.
     */
    public void addFoulsForA(View v) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsTeamA(foulsTeamA);
    }

    //To display the result
    public void displayFoulsTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_text_view_a);
        scoreView.setText(String.valueOf(fouls));
    }

    /**
     * Displays the fouls for Team B.
     */
    int foulsTeamB = 0;

    public void addFoulsForB(View v) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsTeamB(foulsTeamB);
    }

    //To display the result
    public void displayFoulsTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_text_view_b);
        scoreView.setText(String.valueOf(fouls));
    }

    /**
     * To Reset the whole scores.
     */

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        freeKickTeamA = 0;
        freeKickTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFreeKickTeamA(freeKickTeamA);
        displayFreeKickTeamB(freeKickTeamB);
        displayFoulsTeamA(foulsTeamA);
        displayFoulsTeamB(foulsTeamB);

    }
}
