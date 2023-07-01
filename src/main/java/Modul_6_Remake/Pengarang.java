package Modul_6_Remake;

public class Pengarang {
    private String nama , nik,alamat;

    public  Pengarang(String nama , String nik , String alamat){
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getAlamat(){
        return  alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getNik(){
        return  nik;
    }

    public void setNik(String nik){
        this.nik = nik;
    }
}
