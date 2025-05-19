package com.example.sayitahminuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SonucEkraniActivity extends AppCompatActivity {
    private Button buttonTekrarOyna ;
    private TextView textViewSonuc ;
    private ImageView imageViewResim ;
    private Boolean Sonuc ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc_ekrani);
        imageViewResim = findViewById(R.id.imageViewResim);
        textViewSonuc = findViewById(R.id.textViewSonuc);
        buttonTekrarOyna = findViewById(R.id.buttonTekrarOyna);

        Sonuc =getIntent().getBooleanExtra("Sonuc",false);
        if(Sonuc){
            textViewSonuc.setText("Tebrikler Kazandınız..");
            imageViewResim.setImageResource(R.drawable.happy);
        }else{
            textViewSonuc.setText("Kaybettinizz..");
            imageViewResim.setImageResource(R.drawable.cry);
        }


        buttonTekrarOyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SonucEkraniActivity.this,TahminEkraniActivity.class));
                finish();
            }
        });
    }
}