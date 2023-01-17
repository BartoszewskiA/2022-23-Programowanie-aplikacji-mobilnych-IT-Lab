package com.example.lab08p02;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button dodaj_element;
    TextView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dodaj_element = findViewById(R.id.a1_button01);
        lista =  findViewById(R.id.a1_textView01);
        dodaj_element.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencja = new Intent(getApplicationContext(), MainActivity2.class);
                startActivityForResult(intencja, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==1 && resultCode==RESULT_OK)
        {
            Bundle paczka = data.getExtras();
            String s = paczka.getString("produkt");
            int i = paczka.getInt("sztuk");
            String wpis = lista.getText().toString()+ s + " : "+i+ " sztuk\n";
            lista.setText(wpis);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}