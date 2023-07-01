package Modul_6_Remake;

import java.util.Scanner;

/*Buatlah program untuk mengelola data buku dan pengarangnya. Setiap buku memiliki ciri
        kode buku, judul, tahun terbit, tahun terbit, dan daftar pengarang. Pengarang adalah
        seseorang yang memiliki NIK, nama, alamat. Setiap buku bisa memiliki lebih dari satu
        pengarang.
        Buatlah kelas main bernama KelolaBuku yang melalukan beberapa hal sebagai berikut:
        a. Meminta masukan berapa jumlah buku baru yang akan disimpan.
        b. Untuk setiap obyek buku:
        • Membuat obyek buku dan memasukkan kode buku, judul, pengarang, tahun
        terbit, .
        • Meminta masukan berupa jumlah pengarang.
        • Memasukkan data-data pengarang sesuai jumlah pengarangnya.
        • Mengeset daftar pengarang pada class Buku.
        c. Menampilkan data buku beserta pengarangnya masing-masing
        PRODI INFORMATIKA
        FAKULTAS SAINS DAN TEKNOLOGI
        UNIVERSITAS SANATA DHARMA YOGYAKARTA_____________________________________________________________________________________________
        Modul 5 Praktikum PBO I Genap 2021/2022 – Prodi Informatika FST USD | H a l 2
        d. Menampilkan jumlah buku yang diterbitkan pada tahun tertentu. Tahun yang
        dikehendaki dimasukkan lewat keyboard.
        e. Menampilkan buku terbitan paling lama.
        f. Menampilkan buku terbitan paling akhri.*/
public class Book {
    private  String judul , tahun_terbit,kode_buku,nama , nik,alamat;
    Pengarang[]listP;

    public  Book(String judul , String tahun_terbit,String kode_buku , Pengarang[]listP){
        this.judul = judul;
        this.tahun_terbit = tahun_terbit;
        this.kode_buku = kode_buku;
        this.listP  = listP;
    }

    public String getJudul(){
        return  judul;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public String getTahun_terbit(){
        return  tahun_terbit;
    }

    public void setTahun_terbit(String tahun_terbit){
        this.tahun_terbit = tahun_terbit;
    }

    public String getKode_buku(){
        return kode_buku;
    }

    public void setKode_buku(String kode_buku){
        this.kode_buku = kode_buku;
    }

    Pengarang[]getListP(){
        return listP;
    }

    public void setListP(Pengarang[]listP){
        this.listP = listP;
    }

    public  void tambahPengarang(){
        Scanner input = new Scanner(System.in);

        System.out.println("Nama Pengarang : ");
        nama  = input.next();
        nama +=input.nextLine();

        System.out.println("NIK : ");
        nik = input.next();
        nik += input.nextLine();

        System.out.println("Alamat : ");
        alamat = input.next();
        alamat += input.nextLine();
    }
}
