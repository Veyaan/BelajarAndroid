package com.example.belajarandroid10pplg2;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AudioPlayer extends RecyclerView.Adapter<AudioPlayer.ViewHolder> {
    private List<AudioModel> listAudio;

    public AudioPlayer(List<AudioModel> listAudio) {
        this.listAudio = listAudio;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvLagu;
        TextView tvPembuat;
        TextView tvAlbum;
        TextView tvJumlahPendengar;
        ImageView tvImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLagu = itemView.findViewById(R.id.lagu);
            tvPembuat = itemView.findViewById(R.id.pembuat);
            tvAlbum = itemView.findViewById(R.id.album);
            tvJumlahPendengar = itemView.findViewById(R.id.jumlahpendengar);
            tvImg = itemView.findViewById(R.id.img);
        }
    }

    @NonNull
    @Override
    public AudioPlayer.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_audio_player, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AudioPlayer.ViewHolder holder, int position) {
        AudioModel audio = listAudio.get(position);
        holder.tvLagu.setText(audio.getLagu());
        holder.tvPembuat.setText(audio.getPembuat());
        holder.tvAlbum.setText(audio.getAlbum());
        holder.tvJumlahPendengar.setText(String.valueOf(audio.getJumlahpendengar()) + " Pendengar");

        Glide.with(holder.itemView.getContext())
                .load(audio.getImgUrl())
                .into(holder.tvImg);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(v.getContext(), "Lagu yang kamu putar adalah " + audio.getLagu(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(v.getContext(), DetailListAudio.class);
                intent.putExtra("LAGU", audio.getLagu());
                intent.putExtra("PEMBUAT", audio.getPembuat());
                intent.putExtra("ALBUM", audio.getAlbum());
                intent.putExtra("JUMLAH", audio.getJumlahpendengar());
                intent.putExtra("IMG", audio.getImgUrl());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAudio.size();
    }
}
