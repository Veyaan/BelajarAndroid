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
import java.util.List;

public class list extends AppCompatActivity {

    RecyclerView rvListSiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvListSiswa = (RecyclerView) findViewById(R.id.rvListSiswa);
        // Membuat Arraylist menggunakan SiswaModel
        ArrayList<SiswaModel> ListDataSiswa = new ArrayList<>();
        SiswaModel siswa1 = new SiswaModel("Albay", "1", "Jati");
        SiswaModel siswa2 = new SiswaModel("Abdillah", "2", "Ngembal");
        SiswaModel siswa3 = new SiswaModel("Radit", "3", "Jepara");
        SiswaModel siswa4 = new SiswaModel("Kitaro", "4", "Kudus");
        SiswaModel siswa5 = new SiswaModel("Edgard", "5", "Kudus");
        SiswaModel siswa6 = new SiswaModel("Vyan", "6", "Kudus");
        SiswaModel siswa7 = new SiswaModel("Assa", "7", "Kudus");
        SiswaModel siswa8 = new SiswaModel("Miftah", "8", "Kudus");
        SiswaModel siswa9 = new SiswaModel("Zizo", "9", "Kudus");
        SiswaModel siswa10 = new SiswaModel("Ilham", "10", "Kudus");

        ListDataSiswa.add(siswa1);
        ListDataSiswa.add(siswa2);
        ListDataSiswa.add(siswa3);
        ListDataSiswa.add(siswa4);
        ListDataSiswa.add(siswa5);
        ListDataSiswa.add(siswa6);
        ListDataSiswa.add(siswa7);
        ListDataSiswa.add(siswa8);
        ListDataSiswa.add(siswa9);
        ListDataSiswa.add(siswa10);

        AdapterListSiswa adapter = new AdapterListSiswa(ListDataSiswa);

        rvListSiswa.setLayoutManager(new LinearLayoutManager(this));
        rvListSiswa.setAdapter(adapter);


    }
}