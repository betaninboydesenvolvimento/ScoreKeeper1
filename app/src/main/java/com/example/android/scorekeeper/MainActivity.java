package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int quantityScoreRiver = 0;
    int quantityScoreBoca = 0;
    int quantityFaltasRiver = 0;
    int quantityFaltasBoca = 0;
    int quantityCartoesRiver = 0;
    int quantityCartoesBoca = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void golRiver(View view) {
        quantityScoreRiver = quantityScoreRiver + 1;
        displayQuantityScoreRiver(quantityScoreRiver);
    }


    public void golBoca(View view) {
        quantityScoreBoca = quantityScoreBoca + 1;
        displayQuantityScoreBoca(quantityScoreBoca);
    }


    public void faltasRiver(View view) {
        quantityFaltasRiver = quantityFaltasRiver + 1;
        displayQuantityFaltasRiver(quantityFaltasRiver);
    }

    public void faltasBoca(View view) {
        quantityFaltasBoca = quantityFaltasBoca + 1;
        displayQuantityFaltasBoca(quantityFaltasBoca);
    }

    public void cartoesRiver(View view) {
        quantityCartoesRiver = quantityCartoesRiver + 1;
        displayQuantityCartoesRiver(quantityCartoesRiver);
    }

    public void cartoesBoca(View view) {
        quantityCartoesBoca = quantityCartoesBoca + 1;
        displayQuantityCartoesBoca(quantityCartoesBoca);
    }

    public void reset(View view) {
        quantityScoreRiver = 0;
        quantityScoreBoca = 0;
        displayQuantityScoreRiver(quantityScoreRiver);
        displayQuantityScoreBoca(quantityScoreBoca);
        quantityCartoesBoca = 0;
        quantityCartoesRiver = 0;
        displayQuantityCartoesBoca(quantityCartoesBoca);
        displayQuantityCartoesRiver(quantityCartoesRiver);
        quantityFaltasBoca = 0;
        quantityFaltasRiver = 0;
        displayQuantityFaltasBoca(quantityFaltasBoca);
        displayQuantityFaltasRiver(quantityFaltasRiver);
    }


    /**
     * Displays the given score for Team A.
     */

    public void displayQuantityScoreRiver(int score) {
        TextView quantityScoreRiver = (TextView) findViewById(R.id.score_river);
        quantityScoreRiver.setText(String.valueOf(score));
    }

    public void displayQuantityScoreBoca(int score) {
        TextView quantityScoreBoca = (TextView) findViewById(R.id.score_boca);
        quantityScoreBoca.setText(String.valueOf(score));
    }

    public void displayQuantityFaltasRiver(int quantityFaltas) {
        TextView quantityFaltasRiver = (TextView) findViewById(R.id.faltas_river);
        quantityFaltasRiver.setText(String.valueOf(quantityFaltas));
    }

    public void displayQuantityFaltasBoca(int quantityFaltas) {
        TextView quantityFaltasBoca = (TextView) findViewById(R.id.faltas_boca);
        quantityFaltasBoca.setText(String.valueOf(quantityFaltas));
    }

    public void displayQuantityCartoesRiver(int quantityCartoes) {
        TextView quantityCartoesRiver = (TextView) findViewById(R.id.cartoes_river);
        quantityCartoesRiver.setText(String.valueOf(quantityCartoes));
    }

    public void displayQuantityCartoesBoca(int quantityCartoes) {
        TextView quantityCartoesBoca = (TextView) findViewById(R.id.cartoes_boca);
        quantityCartoesBoca.setText(String.valueOf(quantityCartoes));
    }
}
