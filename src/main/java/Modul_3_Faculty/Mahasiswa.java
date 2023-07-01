package Modul_3_Faculty;

public class Mahasiswa {
    private final String nim;
    private final String nama;
    private String email;
    private Dosen pembimbing;
    public Mahasiswa(String nama , String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public  void  setPembimbing(Dosen pembimbing){
        this.pembimbing = pembimbing;
    }

    public Dosen getPembimbing() {
        return pembimbing;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

