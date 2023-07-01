package Modul_1;

public class Buku {

    String judul;
    String pengarang;
    String isbn;
    String penerbit;
    String kategori;
    String pengarang1;

    // Data Structure and Algorithms;


    public Buku(String judul, String isbn) {
        this.judul = judul;
        this.isbn = isbn;
    }

    void setkategori(String kategori){
        System.out.println("Judul Buku : " + kategori);
        this.kategori=kategori;
    }




    void setPengarang(String pengarang1){
        System.out.println("Pengarang : " + pengarang1);
        this.pengarang=pengarang1;
    }

    //public String pinjam(String penerbit,String pengarang1,String kategori2){
        public String pinjam(){
        System.out.println("Nama buku : " + judul + "\nNomor ISBN :" + isbn  +"\nPenerbit : " + penerbit + "\nPengarang : " + pengarang + "\nKategori : " +kategori);
        /*this.penerbit=penerbit;
        this.pengarang=pengarang1;
        this.kategori=kategori2;*/
        return "Sedang Dipinjam";
    }




    public String kembali(String penerbit2 ,String pengarang2, String kategori2){
        System.out.println("Nama buku : " + judul + "\nNomor ISBN : " + isbn+"\nPenerbit : " + penerbit2 + "\nPengarang : " + pengarang2 +"\nKategori : " + kategori2);
        this.penerbit =penerbit2;
        this.pengarang=pengarang2;
        this.kategori=kategori2;
        return  "Sudah Dikembalikan";
    }
    }
