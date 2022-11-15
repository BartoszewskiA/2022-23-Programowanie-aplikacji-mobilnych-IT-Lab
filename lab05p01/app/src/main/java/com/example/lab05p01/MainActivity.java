package com.example.lab05p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView nazwa, opis;
    ImageView ramka;
    Button next, back;
    int nr =0;
    int[] rysunki = new int[] { R.drawable.f_wilk,
                                R.drawable.f_rekin,
                                R.drawable.f_lion};
    String[] nazwy;
    String[] opisy;
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opis = findViewById(R.id.tw_opis);
        nazwa = findViewById(R.id.tw_nazwa);
        ramka = findViewById(R.id.ramka);
        next = findViewById(R.id.b_next);
        back = findViewById(R.id.b_back);
        nazwy = getResources().getStringArray(R.array.nazwy);
        opisy = getResources().getStringArray(R.array.opisy);
        nr = random.nextInt(rysunki.length);
        zaladuj(nr);

    }

    private void zaladuj(int nr) {
        ramka.setImageResource(rysunki[nr]);
        opis.setText(opisy[nr]);
        nazwa.setText(nazwy[nr]);
    }
}