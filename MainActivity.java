package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnClick;
    private EditText etView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick=findViewById(R.id.button);
        etView=findViewById(R.id.etView);

        btnClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),sincere1.class);
                String msg = etView.getText().toString();
                intent.putExtra("key",msg);
                        startActivity(intent);
            }
        });
    }
}
