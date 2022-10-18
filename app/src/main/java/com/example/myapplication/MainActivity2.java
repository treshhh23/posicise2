package com.example.myapplication;

import static com.example.myapplication.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(layout.activity_main2);
    }

    static int cookie, grandma = 0;

    public void increaseCookies (View view) {
        cookie++;
        TextView cookieCount = (findViewById(R.id.textView2));
        cookieCount.setText("You have " + cookie + " cookies!");

    }

    public void increaseGrandmas (View view) {
        grandma++;
        TextView grandmaCount = (findViewById(id.txtGrandma));
        grandmaCount.setText(grandma + " grandmas ate " +grandma+"Cookies!");
        if (cookie > 0) {
            cookie--;
            TextView cookieCount = (findViewById(R.id.textView2));
            cookieCount.setText("You have " + cookie + " cookies!");
        } else {
            grandma--;
            return;
        }

    }


    public void changeView2 (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}