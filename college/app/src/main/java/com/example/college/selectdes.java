package com.example.college;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class selectdes extends AppCompatActivity {
    ImageButton ib;
    ImageButton bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectdes);
        ib=findViewById(R.id.imageButton2);
        bi=findViewById(R.id.imageButton3);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new
                        Intent(getApplicationContext(),attendance.class);
                startActivity(i);
            }
        });
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new
                        Intent(getApplicationContext(),timetable.class);
                startActivity(i);
            }
        });
    }
}