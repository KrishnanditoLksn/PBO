package Modull_5;

public class Pengarang {
    String nama , nik , alamat;

    Pengarang(String nama , String nik , String alamat){
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
    }

    public String getNama(){
        return  nama;
    }
    void setNama(String nama){
        this.nama = nama;
    }

    public String getNik(){
        return  nik;
    }

    void setNik(String nik){
        this.nik = nik;
    }

    void setAlamat(String alamat){
        this.alamat =alamat;
    }
    String getAlamat(){
        return  alamat;
    }

}
