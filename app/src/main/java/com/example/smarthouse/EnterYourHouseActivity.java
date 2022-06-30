package com.example.smarthouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EnterYourHouseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_your_house);


    }

    public void enter_your_hose_click(View view) {

        EditText editEmail = findViewById(R.id.edit_email);
        EditText editPassword = findViewById(R.id.edit_password);

        String Email = editEmail.getText().toString();
        String Password = editPassword.getText().toString();

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if(!Email.matches(emailPattern)){
            editEmail.setError("Введите корректный Email");
        } else if (Password.isEmpty()){
            editPassword.setError("Введите корректный пароль");
        } else{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    public void new_resident_click(View view) {
        Intent intent = new Intent(this, NewResidentActivity.class);
        startActivity(intent);
        finish();
    }
}