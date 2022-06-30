package com.example.smarthouseos.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.smarthouseos.R;
import com.example.smarthouseos.View.MainActivity;

public class LoginActivity extends Activity {

    private EditText email_et, password_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void enter_click(View view) {

        email_et = findViewById(R.id.email_edittext);
        password_et = findViewById(R.id.password_edittext);

        String email = email_et.getText().toString();
        String password = password_et.getText().toString();

        String emailPattern = "[a-zA-Z-0-9._-]+@[a-z]+\\.+[a-z]+";
        if (!email.matches(emailPattern)){
            email_et.setError("Введите корректный емаил\n Паттерн:user@gmail.com");
        } else if(password.isEmpty()){
            password_et.setError("Введите пароль");
        } else {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}