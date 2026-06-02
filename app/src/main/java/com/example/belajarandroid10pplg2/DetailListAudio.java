package com.example.belajarandroid10pplg2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.bumptech.glide.Glide;

public class DetailListAudio extends AppCompatActivity {

    ImageView img;
    TextView tvLagu, tvPembuat, tvAlbum, tvJumlah;
    Button buttonLogout;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_list_audio);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        img = findViewById(R.id.detail_img);
        tvLagu = findViewById(R.id.detail_lagu);
        tvPembuat = findViewById(R.id.detail_pembuat);
        tvAlbum = findViewById(R.id.detail_album);
        tvJumlah = findViewById(R.id.detail_jumlahpendengar);
        buttonLogout = findViewById(R.id.buttonLogout);

        String lagu = getIntent().getStringExtra("LAGU");
        String pembuat = getIntent().getStringExtra("PEMBUAT");
        String album = getIntent().getStringExtra("ALBUM");
        int jumlah = getIntent().getIntExtra("JUMLAH", 0);
        String imageUrl = getIntent().getStringExtra("IMG");

        tvLagu.setText(lagu);
        tvPembuat.setText(pembuat);
        tvAlbum.setText(album);
        tvJumlah.setText(String.valueOf(jumlah) + " Listener");

        Glide.with(this)
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .into(img);

        sharedPreferences = getSharedPreferences("LOGIN_PREF", MODE_PRIVATE);

        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.clear();
                    editor.apply();
                    startActivity(new Intent(DetailListAudio.this,MainActivity.class));
            }
        });
    }
}
