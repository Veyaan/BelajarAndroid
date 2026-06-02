package com.example.belajarandroid10pplg2;

import android.content.Intent;
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

public class register extends AppCompatActivity {

    Button btnRegis;
    EditText Confpass;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        btnRegis = (Button) findViewById(R.id.btnRegist);
        pass = (EditText) findViewById(R.id.passw);
        Confpass = (EditText) findViewById(R.id.confPassw);
        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = pass.getText().toString();
                String cpassword = Confpass.getText().toString();
                if (password.equals(cpassword)){
                    Toast.makeText(register.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(register.this, ConfirmRegister.class));
                }
           }

        });
    }
}