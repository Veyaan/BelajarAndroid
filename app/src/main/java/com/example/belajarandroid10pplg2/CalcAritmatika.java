package com.example.belajarandroid10pplg2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalcAritmatika extends AppCompatActivity {

    EditText Angka1;
    EditText Angka2;
    Button btnTambah;
    Button btnKurang;
    Button btnKali;
    Button btnBagi;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calc_aritmatika);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Angka1 = (EditText) findViewById(R.id.Angka1);
        Angka2 = (EditText) findViewById(R.id.Angka2);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        Hasil = (TextView) findViewById(R.id.Hasil);


        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt(Angka1.getText().toString());
                int angka2 = Integer.parseInt(Angka2.getText().toString());
                int hasil = angka1 + angka2;
                Hasil.setText("Hasil = "+ hasil);
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt(Angka1.getText().toString());
                int angka2 = Integer.parseInt(Angka2.getText().toString());
                int hasil = angka1 - angka2;
               Hasil.setText("Hasil = "+ hasil);
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt(Angka1.getText().toString());
                int angka2 = Integer.parseInt(Angka2.getText().toString());
                int hasil = angka1 * angka2;
                Hasil.setText("Hasil = "+ hasil);
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float angka1 = Float.parseFloat(Angka1.getText().toString());
                float angka2 = Float.parseFloat(Angka2.getText().toString());
                float hasil = angka1 / angka2;
                Hasil.setText("Hasil = "+ hasil);
            }
        });
    }
}