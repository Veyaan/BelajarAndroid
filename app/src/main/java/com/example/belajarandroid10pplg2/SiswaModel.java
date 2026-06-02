package com.example.belajarandroid10pplg2;

public class SiswaModel {
    String nama;
    String absen;
    String alamat;

    String detailinfo;

    // Buat Construktor
    public SiswaModel(String nama, String absen, String alamat) {
        this.detailinfo = detailinfo;
        this.nama = nama;
        this.absen = absen;
        this.alamat = alamat;
    }


    // Buat Getter
    public String getNama() {

        return nama;
    }

    public String getAbsen() {

        return absen;
    }

    public String getAlamat() {

        return alamat;
    }

    public String getDetailinfo() {
        return detailinfo;
    }

}
