package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView newText;
    String NT1 , NT2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        newText = findViewById(R.id.newText);

        NT1 = intent.getStringExtra("Text1");
        NT2 = intent.getStringExtra("Text2");


        newText.setText(NT1+NT2);

    }
}