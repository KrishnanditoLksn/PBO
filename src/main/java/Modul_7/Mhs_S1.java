package Modul_7;
/*
mengimport kelas Mhs dari modul 4
 */
import Modul_4.Mhs;

public class Mhs_S1  extends Mhs {

    /*
    membuat kelas Konstruktor  Mhs_S1 yang bersifat protected
     */
    protected Mhs_S1(String nim, String nama, String tanggalLahir, Double uts1, Double uts2, Double uas) {
        super(nim, nama, tanggalLahir, uts1, uts2, uas);
    }

    @Override
    protected void Comparison(Double nilai_Finals){

        if(getNilai_final() >= 80 ){
           comparison = 'A';
        }

        else if (getNilai_final() >= 70 && getNilai_final()<=80) {
            comparison='B';
        }
        else if(getNilai_final()>=56 && getNilai_final() <=70){
            comparison='C';
        }
        else if(getNilai_final() >=45 && getNilai_final()<=56){
            comparison='D';
        }
        else {
            comparison='E';
        }
    }
}
