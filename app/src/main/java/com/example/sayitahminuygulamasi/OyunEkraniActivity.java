package com.example.sayitahminuygulamasi;

import static com.example.sayitahminuygulamasi.R.id.buttonOyunaGec;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OyunEkraniActivity extends AppCompatActivity {
    private Button buttonBasla;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_ekrani);

        buttonBasla= findViewById(R.id.buttonBasla);
        buttonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OyunEkraniActivity.this,TahminEkraniActivity.class));

            }
        });
    }
}