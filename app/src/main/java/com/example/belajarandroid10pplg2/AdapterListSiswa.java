package com.example.belajarandroid10pplg2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterListSiswa extends RecyclerView.Adapter<AdapterListSiswa.ViewHolder> {

    private List<SiswaModel> listSiswa;


    // constructor
    public AdapterListSiswa(List<SiswaModel> listSiswa) {
        this.listSiswa = listSiswa;
    }

    // ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama;
        TextView tvAbsen;
        TextView tvAlamat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.nama);
            tvAbsen = itemView.findViewById(R.id.absen);
            tvAlamat = itemView.findViewById(R.id.alamat);
        }
    }

    @NonNull
    @Override
    public AdapterListSiswa.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_detail_list_siswa, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListSiswa.ViewHolder holder, int position) {
        String nama = listSiswa.get(position).getNama();
        String absen = listSiswa.get(position).getAbsen();
        String alamat = listSiswa.get(position).getAlamat();
        holder.tvNama.setText(nama);
        holder.tvAbsen.setText(absen);
        holder.tvAlamat.setText(alamat);

    }

    @Override
    public int getItemCount() {
        return listSiswa.size();
    }
}
