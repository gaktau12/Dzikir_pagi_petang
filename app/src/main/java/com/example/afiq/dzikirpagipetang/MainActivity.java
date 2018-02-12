package com.example.afiq.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CardView cardsore, cardpagi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inisialisasiKomponen();

        cardsore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Dzikir_soreActivity.class));
            }
        });

        cardpagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Dzikir_pagiActivity.class));
            }
        });
    }

    private void inisialisasiKomponen() {
        cardsore = (CardView) findViewById(R.id.cardsore);
        cardpagi = (CardView) findViewById(R.id.cardpagi);
    }
}
