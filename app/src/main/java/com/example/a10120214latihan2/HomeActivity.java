package com.example.a10120214latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_home);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}

//NIM       : 10120214
//Nama      : Rully Fadia
//Kelas     : IF-6
//Tanggal Pengerjaan : 28-04-2023