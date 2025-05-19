package com.example.sayitahminuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class TahminEkraniActivity extends AppCompatActivity {
    private TextView textViewKalanHak,textViewYardim ;
    private EditText editTextPlain ;
    private Button buttonTahmin ;
    private int Rastgelesayi ;
    private int sayac = 5 ;
    private int i1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahmin_ekrani);

        textViewKalanHak = findViewById(R.id.textViewKalanHak);
        textViewYardim = findViewById(R.id.textViewYardim);
        editTextPlain = findViewById(R.id.editTextPlain);
        buttonTahmin = findViewById(R.id.buttonTahmin);

        Random r = new Random();
        Rastgelesayi = r.nextInt(6);
        Log.e("RastgeleSayi :",String.valueOf(Rastgelesayi));

        buttonTahmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayac-= 1;

                  i1 = Integer.parseInt(editTextPlain.getText().toString());


                if(i1 > Rastgelesayi) {
                    textViewKalanHak.setText("Kalan Hak 5:" + sayac);
                    textViewYardim.setText("Azalt ");

                }  if (i1 < Rastgelesayi) {
                    textViewYardim.setText("Arttır ");
                    textViewKalanHak.setText("Kalan Hak 5:"+sayac);

                } if (i1 ==Rastgelesayi) {
                    Intent i = new Intent(TahminEkraniActivity.this,SonucEkraniActivity.class);
                    i.putExtra("Sonuc",true);
                    startActivity(i);
                    finish();
                    return;

                }  if (sayac==0) {
                    Intent i = new Intent(TahminEkraniActivity.this,SonucEkraniActivity.class);
                    i.putExtra("Sonuc",false);
                    startActivity(i);
                }





                //startActivity(new Intent(TahminEkraniActivity.this,SonucEkraniActivity.class));
                //finish();
            }
        });

    }
}