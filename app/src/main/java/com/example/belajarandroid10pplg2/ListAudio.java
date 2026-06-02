package com.example.belajarandroid10pplg2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class    ListAudio extends AppCompatActivity {

    RecyclerView rvListAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_audio);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvListAudio = findViewById(R.id.rvListAudio);

        ArrayList<AudioModel> ListDataAudio = new ArrayList<>();
        ListDataAudio.add(new AudioModel("Just Keep Watching", "Tate McRae", "F1 The Album", 12000000, "https://i.pinimg.com/736x/f7/15/66/f7156611c521e23f3df7c13be9566e94.jpg"));
        ListDataAudio.add(new AudioModel("Lose My Mind", "Don Toliver, ft. Doja Cat", "F1 The Album", 11000000, "https://i.pinimg.com/736x/99/b7/5a/99b75a60dd9ac6bc884304f4be3a9693.jpg"));
        ListDataAudio.add(new AudioModel("Bad As I Used To Be", "Chris Stapleton", "F1 The Album", 10500000, "https://i.pinimg.com/736x/99/b7/5a/99b75a60dd9ac6bc884304f4be3a9693.jpg"));
        ListDataAudio.add(new AudioModel("No Room For A Saint", "Dom Dolla", "F1 The Album", 10000000, "https://i.pinimg.com/736x/c3/33/14/c33314b6a41fe5997e2df9433c5fb713.jpg"));
        ListDataAudio.add(new AudioModel("Messy", "ROSE", "F1 The Album", 9500000, "https://i.pinimg.com/736x/60/23/de/6023dee9becff2a7c325be9e1a4ed9c3.jpg"));
        ListDataAudio.add(new AudioModel("Drive", "Ed Sheeran", "F1 The Album", 9800000, "https://i.pinimg.com/736x/ba/0a/7f/ba0a7fe8ae003072cee7b7e9ced65655.jpg"));
        ListDataAudio.add(new AudioModel("Don't Let Me Down", "Burna Boy", "F1 The Album", 16000000, "https://i.pinimg.com/736x/fb/d3/ce/fbd3ce015879a1125e7b4d6ff5299d82.jpg"));
        ListDataAudio.add(new AudioModel("Underdog", "Roddy Ricch", "F1 The Album", 11500000, "https://i.pinimg.com/736x/99/b7/5a/99b75a60dd9ac6bc884304f4be3a9693.jpg"));
        ListDataAudio.add(new AudioModel("Double C", "PAWSA", "F1 The Album", 27000000, "https://i.pinimg.com/736x/99/b7/5a/99b75a60dd9ac6bc884304f4be3a9693.jpg"));
        ListDataAudio.add(new AudioModel("OMG!", "Tiesto", "F1 The Album", 14000000, "https://i.pinimg.com/736x/0f/86/68/0f8668c0d6a39cf620c5dbb03950aa00.jpg"));
        ListDataAudio.add(new AudioModel("Gasoline", "Obongjayar", "F1 The Album", 23000000, "https://i.pinimg.com/736x/99/b7/5a/99b75a60dd9ac6bc884304f4be3a9693.jpg"));
        ListDataAudio.add(new AudioModel("Give Me Love", "Darkoo", "F1 The Album", 8000000, "https://i.pinimg.com/736x/99/b7/5a/99b75a60dd9ac6bc884304f4be3a9693.jpg"));
        ListDataAudio.add(new AudioModel("Attention", "Mr Eazi", "F1 The Album", 19000000, "https://i.pinimg.com/736x/99/b7/5a/99b75a60dd9ac6bc884304f4be3a9693.jpg"));
        ListDataAudio.add(new AudioModel("Baja California", "Myke Towers", "F1 The Album", 9000000, "https://i.pinimg.com/736x/99/b7/5a/99b75a60dd9ac6bc884304f4be3a9693.jpg"));

        AudioPlayer adapter = new AudioPlayer(ListDataAudio);

        rvListAudio.setLayoutManager(new LinearLayoutManager(this));
        rvListAudio.setAdapter(adapter);
    }
}
