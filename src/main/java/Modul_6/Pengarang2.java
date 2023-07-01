package Modul_6;

import java.util.Scanner;

public class Pengarang2 {
    String nama, alamat, nik, pubName;
    int PubDate;

    public Pengarang2(String authorName, String nik, String alamat, int pubDate) {
        this.nama = authorName;
        this.nik = nik;
        this.alamat = alamat;
        this.PubDate = pubDate;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }


}
