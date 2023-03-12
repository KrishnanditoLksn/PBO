package Modul_3.BukuPerpus;//membuat program di package

public class Buku {//mendeklarasikan class Buku
    int  tahun_terbit;//membuat variabel tahun_terbit;
    String pengarang;//membuat variabel pengarang
    String isbn;//membuat variabel isbn bertipe string
    String judul;//membuat variabel judul bertipe string
    String Book_comparison;//membuat variabel untuk menentukan apakah buku itu lama atau tidak

    Buku(int tahun_terbit , String judul , String isbn){//method buku dengan parameter tahun_terbit , judul dan isbn
        this.tahun_terbit =tahun_terbit;
        this.judul = judul;
        this.isbn = isbn;}

    String getJudul() {
        return judul;
    }

    String getIsbn() {
        return isbn;
    }

    int getTahun_terbit() {
        return tahun_terbit;
    }

    void getBook_comparison(){
        if (getTahun_terbit() <= 2019){
            System.out.println("Old Book");
        }
        else {
            System.out.println("New Book");
        }
    }
}
