package com.example.lab08p02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

   Button ok, anuluj;
   EditText liczba;
   Spinner lista_prod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ok = findViewById(R.id.a2_button01);
        anuluj = findViewById(R.id.a2_button02);
        liczba = findViewById(R.id.a2_editText01);
        lista_prod = findViewById(R.id.a2_spinner01);
        przygotu_odpowiedz();
    }

    private void przygotu_odpowiedz() {
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent odpowiedz = new Intent();
                int sztuk;
                if(liczba.getText().toString().isEmpty())
                    sztuk = 1;
                else
                    sztuk = Integer.parseInt(liczba.getText().toString());
                odpowiedz.putExtra("sztuk", sztuk);
                String[] nazwy = getResources().getStringArray(R.array.produkty);
                String wybrany_produkt = nazwy[(int)lista_prod.getSelectedItemId()];
                odpowiedz.putExtra("produkt", wybrany_produkt);
                setResult(RESULT_OK,odpowiedz);
                finish();
            }
        });
        anuluj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}