package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayForTeamA(){
        TextView scoreView=(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }
    public void addThreeForTeamA(View v){
        scoreTeamA+=3;
        displayForTeamA();
    }
    public void addTwoForTeamA(View v){
        scoreTeamA+=2;
        displayForTeamA();
    }
    public void addOneForTeamA(View v){
        scoreTeamA+=1;
        displayForTeamA();
    }
    private void displayForTeamB(){
        TextView scoreView=(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
    public void addThreeForTeamB(View v){
        scoreTeamB+=3;
        displayForTeamB();
    }
    public void addTwoForTeamB(View v){
        scoreTeamB+=2;
        displayForTeamB();
    }
    public void addOneForTeamB(View v){
        scoreTeamB+=1;
        displayForTeamB();
    }
    public void setToZero(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA();
        displayForTeamB();
    }
}
