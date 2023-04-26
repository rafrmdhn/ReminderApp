package com.example.bjirka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bjirka.Activity2;
import com.example.bjirka.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText namaUser, npm, kelamin, tanggalLahir, alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaUser = (EditText) findViewById(R.id.username_input);
        npm = (EditText) findViewById(R.id.npmUser);
        kelamin = (EditText) findViewById(R.id.jenisKelamin);
        tanggalLahir = (EditText) findViewById(R.id.tempatTanggalLahir);
        alamat = (EditText) findViewById(R.id.alamatUser);
        Button klik = findViewById(R.id.button2);
    }

    public void GoToActivity2(View view){
        String nama = namaUser.getText().toString();
        String nomor = npm.getText().toString();
        String jenis = kelamin.getText().toString();
        String ttl = tanggalLahir.getText().toString();
        String tinggal = alamat.getText().toString();

        Intent goToActivity2 = new Intent(this, Activity2.class);

        goToActivity2.putExtra("nama", nama);
        goToActivity2.putExtra("nomor", nomor);
        goToActivity2.putExtra("jenis", jenis);
        goToActivity2.putExtra("ttl", ttl);
        goToActivity2.putExtra("tinggal", tinggal);

        startActivity(goToActivity2);
    }

    @Override
    public void onClick(View v){

    }
}