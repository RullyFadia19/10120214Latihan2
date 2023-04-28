package com.example.a10120214latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextView registerBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        registerBtn =  findViewById(R.id.register_btn);

        registerBtn.setOnClickListener((v)->{
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}

//NIM       : 10120214-->
//Nama      : Rully Fadia-->
//Kelas     : IF-6-->
//Tanggal Pengerjaan : 28-04-2023-->