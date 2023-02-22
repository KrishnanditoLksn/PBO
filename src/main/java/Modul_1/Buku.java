package Modul_1;

public class Buku {

    private final String judul;
    private  String pengarang;
    private  final  String isbn;
    private String penerbit;
    private  String kategori;
    // Data Structure and Algorithms;


    public Buku(String judul, String isbn) {
        this.judul = judul;
        this.isbn = isbn;
    }


    public String pinjam(String penerbit,String pengarang1,String kategori2){
        System.out.println("Nama buku : " + judul + "\nNomor ISBN :" + isbn  +"\nPenerbit : " + penerbit + "\nPengarang : " + pengarang1 + "\nKategori : " +kategori2);
        this.penerbit=penerbit;
        this.pengarang=pengarang1;
        this.kategori=kategori2;
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
