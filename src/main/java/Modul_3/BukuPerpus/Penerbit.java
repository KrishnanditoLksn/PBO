package Modul_3.BukuPerpus;

public class Penerbit {
    static String  pub_name;
    static  String alamat;
    static  int tahunberdiri;

    public  static  int getTahunberdiri() {
        return tahunberdiri;
    }

    public  Penerbit(String pub_name , int tahunberdiri, String alamat){
        Penerbit.pub_name = pub_name;
        Penerbit.tahunberdiri = tahunberdiri;
        Penerbit.alamat =alamat;
    }


    public static  String getPub_name() {
        return pub_name;
    }

    void setAlamat(String alamat){
        Penerbit.alamat = alamat;
    }

    public static String getAlamat() {
        return alamat;
    }
}
