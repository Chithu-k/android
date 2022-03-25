package com.example.college;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class timetable extends AppCompatActivity {
    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        sub=findViewById(R.id.button3);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new
                        Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                Toast.makeText(timetable.this,"HOME PAGE",Toast.LENGTH_SHORT).show();

            }
        });
    }
}