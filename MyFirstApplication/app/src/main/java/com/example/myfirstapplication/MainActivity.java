package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usrname;
    EditText pswd;
    Button log;
    String name="chithu";
    String pass="chi123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usrname=findViewById(R.id.username);
        pswd=findViewById(R.id.Password);
        log=findViewById(R.id.login);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputname=usrname.getText().toString();
                String inputpass=pswd.getText().toString();

                if(inputname.isEmpty() || inputpass.isEmpty()){
                    Toast.makeText(MainActivity.this,"FIELD EMPTY",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(inputname.equals(name) && (inputpass.equals(pass))){
                        Toast.makeText(MainActivity.this,"LOGIN SUCCESS",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"INCORRECT",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}