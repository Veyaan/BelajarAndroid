package com.example.belajarandroid10pplg2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnRegister;
    EditText edPassword;
    EditText edUsername;
    Button btnLogin;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnRegister = (Button) findViewById(R.id.btnReg);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, register.class));


            }
        });

        sharedPreferences = getSharedPreferences("LOGIN_PREF", MODE_PRIVATE);

        edUsername = (EditText) findViewById(R.id.edUsername);
        edPassword = (EditText) findViewById(R.id.edPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String username = edUsername.getText().toString();
            String password = edPassword.getText().toString();
            if(username.equals("admin") && password.equals("admin")){
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("username", username);
                editor.apply();
                Toast.makeText(MainActivity.this, "Access granted!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,ListAudio.class));
                }else{
                Toast.makeText(MainActivity.this, "Access denied!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}