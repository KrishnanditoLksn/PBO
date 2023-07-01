package Modul_3_Faculty;

public class Dosen {
    String nip;
    public  String nama;
    String email;
    String gelar;

    public Dosen(String nip , String nama){
        this.nip = nip;
        this.nama= nama;
    }

    void setGelar(String gelar){
        this.gelar= gelar;
    }

    void setEmail(String email){
        this.email = email;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return  nama;
    }
}
