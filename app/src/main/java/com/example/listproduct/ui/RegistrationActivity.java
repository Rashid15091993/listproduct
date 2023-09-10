package com.example.listproduct.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listproduct.R;

public class RegistrationActivity extends AppCompatActivity {
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_layout);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonReg);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Получите введенные данные
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Добавьте здесь код для регистрации пользователя
                // Например, отправка данных на сервер или сохранение их в локальной базе данных.

                // После успешной регистрации вы можете перенаправить пользователя на экран входа
                finish(); // Закройте активити регистрации
            }
        });
    }
}
