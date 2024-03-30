package com.example.booking_bus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bienvenue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenue);
    }
    public void register(View view){
        startActivity(new Intent(Bienvenue.this, Inscription.class));
}

    public void login(View view){
        startActivity(new Intent(Bienvenue.this, MainActivity.class));
    }
}
