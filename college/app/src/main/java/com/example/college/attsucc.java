package com.example.college;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class attsucc extends AppCompatActivity {
    Button bu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attsucc);
        bu=findViewById(R.id.button);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new
                        Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                Toast.makeText(attsucc.this,"HOME PAGE",Toast.LENGTH_SHORT).show();
            }
        });
    }
}