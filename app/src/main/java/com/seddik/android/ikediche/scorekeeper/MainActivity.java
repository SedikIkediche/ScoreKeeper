package com.seddik.android.ikediche.scorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final String SCORE_TEAM_A = "scoreTeamA";
    private final String FOUL_TEAM_A = "foulTeamA";
    private final String SHOT_TEAM_A = "shotTeamA";
    private final String SCORE_TEAM_B = "scoreTeamB";
    private final String FOUL_TEAM_B = "foulTeamB";
    private final String SHOT_TEAM_B = "shotTeamB";

    private int scoreTeamA = 0;
    private int foulTeamA = 0;
    private int shotTeamA = 0;

    private int scoreTeamB = 0;
    private int foulTeamB = 0;
    private int shotTeamB = 0;

    private TextView scoreTeamATextView;
    private TextView foulTeamATextView;
    private TextView shotTeamATextView;

    private TextView scoreTeamBTextView;
    private TextView foulTeamBTextView;
    private TextView shotTeamBTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTeamATextView = findViewById(R.id.score_team_a_text_view);
        foulTeamATextView = findViewById(R.id.foul_team_a_text_view);
        shotTeamATextView = findViewById(R.id.shot_team_a_text_view);
        scoreTeamBTextView = findViewById(R.id.score_team_b_text_view);
        foulTeamBTextView = findViewById(R.id.foul_team_b_text_view);
        shotTeamBTextView = findViewById(R.id.shot_team_b_text_view);

        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt(SCORE_TEAM_A);
            foulTeamA = savedInstanceState.getInt(FOUL_TEAM_A);
            shotTeamA = savedInstanceState.getInt(SHOT_TEAM_A);
            scoreTeamB = savedInstanceState.getInt(SCORE_TEAM_B);
            foulTeamB = savedInstanceState.getInt(FOUL_TEAM_B);
            shotTeamB = savedInstanceState.getInt(SHOT_TEAM_B);
            scoreTeamATextView.setText(String.valueOf(scoreTeamA));
            foulTeamATextView.setText(String.valueOf(foulTeamA));
            shotTeamATextView.setText(String.valueOf(shotTeamA));
            scoreTeamBTextView.setText(String.valueOf(scoreTeamB));
            foulTeamBTextView.setText(String.valueOf(foulTeamB));
            shotTeamBTextView.setText(String.valueOf(shotTeamB));
        }
    }

    /**
     * this method for saving the state of the ui in configuration changes
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(SCORE_TEAM_A, scoreTeamA);
        outState.putInt(FOUL_TEAM_A, foulTeamA);
        outState.putInt(SHOT_TEAM_A, shotTeamA);
        outState.putInt(SCORE_TEAM_B, scoreTeamB);
        outState.putInt(FOUL_TEAM_B, foulTeamB);
        outState.putInt(SHOT_TEAM_B, shotTeamB);
        super.onSaveInstanceState(outState);
    }

    /**
     * this method for display the score for team A in the screen
     */
    private void displayScoreForTeamA(int score) {
        scoreTeamATextView.setText(String.valueOf(score));
    }

    /**
     * this method for display the fouls for team A in the screen
     */
    private void displayFoulForTeamA(int foul) {
        foulTeamATextView.setText(String.valueOf(foul));
    }

    /**
     * this method for display the shots for team A in the screen
     */
    private void displayShotForTeamA(int shot) {
        shotTeamATextView.setText(String.valueOf(shot));
    }

    /**
     * increase the score for team A by 1
     */
    public void setScoreForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * increased the fouls for team A by 1
     */
    public void setFoulForTeamA(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    /**
     * increased the shots for team A by 1
     */
    public void setShotForTeamA(View view) {
        shotTeamA = shotTeamA + 1;
        displayShotForTeamA(shotTeamA);
    }

    /**
     * this method for display the score for team B in the screen
     */
    private void displayScoreForTeamB(int score) {
        scoreTeamBTextView.setText(String.valueOf(score));
    }

    /**
     * this method for display the fouls for team B in the screen
     */
    private void displayFoulForTeamB(int foul) {
        foulTeamBTextView.setText(String.valueOf(foul));
    }

    /**
     * this method for display the shots for team B in the screen
     */
    private void displayShotForTeamB(int shot) {
        shotTeamBTextView.setText(String.valueOf(shot));
    }

    /**
     * increase the score for team B by 1
     */
    public void setScoreForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * increase the fouls for team B by 1
     */
    public void setFoulForTeamB(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * increase the shot for team A by 1
     */
    public void setShotForTeamB(View view) {
        shotTeamB = shotTeamB + 1;
        displayShotForTeamB(shotTeamB);
    }

    /**
     * reset the match information
     */
    public void resetMatch(View view) {
        displayScoreForTeamA(0);
        displayFoulForTeamA(0);
        displayShotForTeamA(0);
        displayScoreForTeamB(0);
        displayFoulForTeamB(0);
        displayShotForTeamB(0);
        scoreTeamA = 0;
        foulTeamA = 0;
        shotTeamA = 0;
        scoreTeamB = 0;
        foulTeamB = 0;
        shotTeamB = 0;
    }
}
