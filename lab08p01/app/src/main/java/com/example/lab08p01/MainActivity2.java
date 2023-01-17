package com.example.lab08p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView01 = findViewById(R.id.a2_textView01);
        Bundle paczka = getIntent().getExtras();
        String s = paczka.getString("login");
        textView01.setText(s);
    }
}