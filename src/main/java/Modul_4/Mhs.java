package Modul_4;//membuat program di dalam package

public class Mhs {//membuat class Mhs
    String nama, tanggal_lahir, nim;//membuat variabel untuk nama tanggal lahir dan nim
    double uts1, uts2, uas , nilai_final;//membuat variabel untuk uts1,uts2,uas

    char  comparison;//membuat variabel comparison

    public void setNim(String nim) {
        this.nim = nim;
    }//membuat method setNim

    public void setTanggal_lahir(String tanggal_lahir) {//membuat mmethod setTanggalLahir
        this.tanggal_lahir = tanggal_lahir;
    }

    public void setNama(String nama) {//membuat method setNama
        this.nama = nama;
    }

    public Mhs(String nim, String nama, String tanggalLahir,Double uts1 , Double uts2 , Double uas) {//membuat class  objek Mhs beserta atribut nya
        this.nama = nama;
        this.tanggal_lahir = tanggalLahir;
        this.nim = nim;
        this.uts1 = uts1;
        this.uts2 = uts2;
        this.uas = uas;
    }
    public String getNama(){//membuat method getNama
        return  nama;
    }

    public String getNim(){//membuat method getNim
        return  nim;
    }


    public String getTanggal_lahir() {//membuat method getTanggalLahir
        return tanggal_lahir;
    }


    public void setUas(double uas) {//membuat method setUas
        this.uas = uas;
    }

    public void setUts2(double uts2) {//membuat method setUts2
        this.uts2 = uts2;
    }

    public void setUts1(double uts1) {//membuat method setUts1
        this.uts1 = uts1;
    }

    public double getUas(){//membuat method getUas
        return  uas;
    }

    double getNilai_final(){//membuat method getNilaiFinal
        return  nilai_final;
    }

    void setNilai_final(double uts1 , double uts2 , double uas){//membuat method setNilaiFinal
        nilai_final = ((0.30 * uts1)  + (0.30  * uts2)  +  (0.40 * uas));
        this.uts1 = uts1;
        this.uts2 = uts2;
        this.uas  = uas;
    }

    void Comparison(Double nilai_finals){//membuat method Comparison untuk menentukan nilai final berdasarkan input user
        this.nilai_final = nilai_finals;

        if (getNilai_final() >=80){
            comparison = 'A';
        }
        else if (getNilai_final() >= 70  && getNilai_final() < 80){
            comparison = 'B';
        }
        else if (getNilai_final()>= 56 && getNilai_final() <70){
            comparison = 'C';
        }
        else if (getNilai_final() >= 45 && getNilai_final() <=56){
            comparison='D';
        }
        else if (getNilai_final() <= 45){
            comparison ='E';
        }
        else {
            System.out.println("INVALID");
        }
    }
    char getComparison(){//membuat method Comparison
        return  comparison;
    }
}
