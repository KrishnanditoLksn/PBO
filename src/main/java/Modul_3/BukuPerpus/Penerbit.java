package Modul_3.BukuPerpus;//membuat package

public class Penerbit {// membuat class bernama Penerbit
    static String  pub_name;//membuat variabel berisi  pub_name bertipe String dan bersifat static
    static  String alamat;//membuat variabel  berisi alamat bertipe String dan bersifat static
    static  int tahunberdiri;//membuat variabel  berisi tahunberdiri bertipe int dan bersifat int

    public  static  int getTahunberdiri() {//membuat method getTahunBerdiri bersifat public dan bertipe integer
        return tahunberdiri;//mengembalikan nilai tahunBerdiri bertipe integer
    }

    public  Penerbit(String pub_name , int tahunberdiri, String alamat){//membuat methode konstruktor bernama Penerbit dengan 3  parameter
        Penerbit.pub_name = pub_name;
        Penerbit.tahunberdiri = tahunberdiri;
        Penerbit.alamat =alamat;
    }


    static  String getPub_name() {//membuat metode getPubname bersifat public dan bertipe String dan mengembalikan nama penerbit
        return pub_name;
    }


    static String getAlamat() {//membuat metode getAlamat bersifat public dan bertipe String dan mengembalikan alamat penerbit
        return alamat;
    }
}
