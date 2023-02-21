package Modul_1;

public class Buku {

    private String judul;
    private  String pengarang;
    private String isbn;
    private String penerbit;
    private String kategori;

    Buku(String judul, String isbn) {
        this.judul = judul;
        this.isbn = isbn;
    }

    public String pinjam(){
        System.out.println("Nama buku : " + judul + "\nNomor ISBN :" + isbn );
        return "Sedang Dipinjam";
    }


    public String kembali(){
        System.out.println("Nama buku : " + judul + "  \nNomor ISBN : " + isbn );
        return  "Sudah Dikembalikan";
    }

    public static void main(String[]args) {
        Buku book1 = new Buku("Calculus", "130495");
        Buku book2 = new Buku("Java Fundamental", "1304300");

        System.out.println(book1.pinjam());
        System.out.println();
        System.out.println(book2.kembali());
    }
    }
