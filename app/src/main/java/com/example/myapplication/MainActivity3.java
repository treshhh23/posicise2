package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void running (View view) {
        Intent intent = new Intent(this, runActivity.class);
        startActivity(intent);
    }

    public void pushUps (View view) {
        Intent intent = new Intent(this, pushActivity.class);
        startActivity(intent);
    }
}