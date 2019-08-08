package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class sincere1 extends AppCompatActivity {

    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sincere1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvData=findViewById(R.id.tvData);

        Intent intent= getIntent();
        String value = intent.getStringExtra("key");
        tvData.setText(value);
    }
}
