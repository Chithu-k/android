package com.example.uivalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText age;
    EditText phone;
    EditText password;
    Button submit;

    Pattern name_PATTERN=Pattern.compile("^[A-Za-z]\\w{2,30}$");
    Pattern PASSWORD_PATTERN =Pattern.compile("^" +
            "(?=.*[@#$%^&+=])" +
            "(?=\\S+$)" +
            ".{4,}" +
            "$");
    Pattern Phone_PATTERN =Pattern.compile("^" +

            "(?=\\S+$)" +
            "[0-9]{10,10}" +
            "$");
    Pattern Age_PATTERN =Pattern.compile("^" +

            "(?=\\S+$)" +
            "[0-9]{1,2}" +
            "$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editTextTextPersonName2);
        age=findViewById(R.id.editTextTextPersonName4);
        phone=findViewById(R.id.editTextTextPersonName6);
        password=findViewById(R.id.editTextTextPassword);
        submit=findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputname = name.getText().toString();
                String inputage = age.getText().toString();
                String inputpass = password.getText().toString();
                String inputphone = phone.getText().toString();

                if(inputname.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Name Field is Empty", Toast.LENGTH_SHORT).show();
                }
                else if(inputage.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Age field is Empty", Toast.LENGTH_SHORT).show();
                }
                else if(inputphone.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Phone field is Empty", Toast.LENGTH_SHORT).show();
                }
                else if(inputpass.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Pass field is Empty", Toast.LENGTH_SHORT).show();
                }
                else if (!name_PATTERN.matcher(inputname).matches()){
                    name.setError("Enter alphabets [3-30 characters]");
                }

                else if (!Age_PATTERN.matcher(inputage).matches()){
                    age.setError("Incorrect Age");
                }

                else if (!Phone_PATTERN.matcher(inputphone).matches()){
                    phone.setError("Invalid Phone Number");
                }

                else if (!PASSWORD_PATTERN.matcher(inputpass).matches()){
                    password.setError("Weak Password");
                }

                else{
                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}