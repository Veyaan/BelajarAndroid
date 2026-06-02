package com.example.belajarandroid10pplg2;

public class AudioModel {
    String lagu;
    String pembuat;
    String album;
    int jumlahpendengar;
    String imgUrl;

    public AudioModel(String lagu, String pembuat, String album, int jumlahpendengar, String imgUrl) {
        this.lagu = lagu;
        this.pembuat = pembuat;
        this.album = album;
        this.jumlahpendengar = jumlahpendengar;
        this.imgUrl = imgUrl;
    }

    public String getLagu() {
        return lagu;
    }

    public String getPembuat() {
        return pembuat;
    }

    public String getAlbum() {
        return album;
    }

    public int getJumlahpendengar() {
        return jumlahpendengar;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
