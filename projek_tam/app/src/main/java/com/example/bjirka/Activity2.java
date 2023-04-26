package com.example.bjirka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        String nomor = intent.getStringExtra("nomor");
        String jenis = intent.getStringExtra("jenis");
        String ttl = intent.getStringExtra("ttl");
        String tinggal = intent.getStringExtra("tinggal");

        TextView teksNama = findViewById(R.id.teksNama);
        TextView teksNPM = findViewById(R.id.teksNPM);
        TextView teksKelamin = findViewById(R.id.teksKelamin);
        TextView teksTTL = findViewById(R.id.teksTTL);
        TextView teksAlamat = findViewById(R.id.teksAlamat);

        teksNama.setText(nama);
        teksNPM.setText(nomor);
        teksKelamin.setText(jenis);
        teksTTL.setText(ttl);
        teksAlamat.setText(tinggal);
    }

}