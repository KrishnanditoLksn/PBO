package Modul_1;

public class Buku {

    private final String judul;
    private  String pengarang;
    private  final  String isbn;
    private String penerbit;
    //private String kategori;
    // Data Structure and Algorithms;


    Buku(String judul, String isbn) {
        this.judul = judul;
        this.isbn = isbn;
    }


    public String pinjam(String penerbit,String pengarang1){
        System.out.println("Nama buku : " + judul + "\nNomor ISBN :" + isbn  +"\nPenerbit : " + penerbit + "\nPengarang : " + pengarang1);
        this.penerbit=penerbit;
        this.pengarang=pengarang1;

        return "Sedang Dipinjam";
    }


    public String kembali(String penerbit2){
        System.out.println("Nama buku : " + judul + "\nNomor ISBN : " + isbn+"\nPenerbit : " + penerbit2);
        this.penerbit =penerbit2;
        return  "Sudah Dikembalikan";
    }


    public static void main(String[]args) {
        Buku book1 = new Buku("Introduction to Algorithms, 3rd Edition (The MIT Press),3rd Edition", "9780262033848");
        Buku book2 = new Buku("Java Fundamental", "1304300");

        System.out.println(book1.pinjam("The MIT Press","Thomas H.Cormen  & Charles E.Leiserson"));
        System.out.println();
        System.out.println(book2.kembali("O,Reilly"));
    }
    }
