package com.example.lab08p01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText01;
    Button button01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText01 = findViewById(R.id.a1_editText01);
        button01 = findViewById(R.id.a1_button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText01.getText().toString().isEmpty()) return;
                Intent intencja = new Intent(getApplicationContext(), MainActivity2.class);
                intencja.putExtra("login", editText01.getText().toString());
                startActivity(intencja);
            }
        });

    }
}