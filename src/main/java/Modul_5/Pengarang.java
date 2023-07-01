package Modul_5;

public class Pengarang {
    /*
    inisias variabel pengarang
     */
    String nama , nik , alamat;


    Pengarang(String nama , String nik , String alamat){
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
    }
    /*
    metode setter dan getter untuk data pengarang
     */
    String getNik(){
        return  nik;
    }

    /*void setDaftarP(Book2 [] daftarP){
        this.daftarp = daftarP;
    }*/

    public void setNik(String nik){
        this.nik = nik;
    }

    String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    String getAlamat(){
        return  alamat;
    }

}
