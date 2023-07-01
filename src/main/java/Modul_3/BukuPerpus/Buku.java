package Modul_3.BukuPerpus;//membuat program di package

public class Buku {//mendeklarasikan class Buku
    int  tahun_terbit;//membuat variabel tahun_terbit;
    String pengarang;//membuat variabel pengarang
    String isbn;//membuat variabel isbn bertipe string
    String judul;//membuat variabel judul bertipe string

    Buku(int tahun_terbit , String judul , String isbn){//method buku dengan parameter tahun_terbit , judul dan isbn
        this.tahun_terbit =tahun_terbit;
        this.judul = judul;
        this.isbn = isbn;
    }

    String getJudul() {//membuat metode bernama getJudul bertipe data String dan bersifat package-private
        return judul;//mengembalikan isi di variabel judul
    }

    String getIsbn() {//membuat metode bernama getIsbn bertipe data String dan bersifat package private
        return isbn;//mengembalikan isi di variabel isbn
    }

    int getTahun_terbit() {//membuat metode bernama getTahunTerbit bertipe data int dan bersifat package-private
        return tahun_terbit;//mengembalikan isi di variabel tahun_terbit
    }

    void getBook_comparison(){//membuat metode  buku baru atau lama  bertipe void
        if (getTahun_terbit() <= 2019){//jika buku tahun terbit  kurang dari 2019 maka itu buku lama
            System.out.println("Old Book");
        }
        else {
            System.out.println("New Book");//dan jika  lebih dari 2019 maka itu buku baru
        }
    }
}
