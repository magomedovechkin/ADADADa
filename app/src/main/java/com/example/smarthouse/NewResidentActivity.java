package com.example.smarthouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class NewResidentActivity extends AppCompatActivity {

    EditText email;
    EditText name;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_resident);



    }

    public void enter_your_house_nr_click(View view) {
        Intent intent = new Intent(this, EnterYourHouseActivity.class);
        startActivity(intent);
        finish();
    }

    public void new_resident_nr_click(View view) {

        email = findViewById(R.id.edit_new_email);
        name = findViewById(R.id.edit_new_password);
        password = findViewById(R.id.edit_new_name);

        String Email = email.getText().toString().trim();
        String Name = name.getText().toString();
        String Password = password.getText().toString();

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if (!Email.matches(emailPattern)){
            email.setError("Введите корректный email");
        } else if(Name.isEmpty()){
            name.setError("Введите корректное имя");
        } else if(Password.isEmpty()){
            password.setError("Введите корректный пароль");
        } else{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();


        }



    }
}