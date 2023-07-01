package Modul_5;

import New_Book.Pegawai_Gaji;
public class Perusahaan{
    /*
    inisiasi variabel untuk data pegawai
     */

    String ap , np  , p , daftar , namaPerusahaan;
    Pegawai_Gaji [] list;

    /*

     */
/*
membuat metode untuk mengeset Alamat  Perusahaan
 */
    void setAp(String ap){
        this.ap = ap;
    }

/*
membuat metode konstruktor Perusahaan
 */
    Perusahaan(String np , String ap , String p,Pegawai_Gaji[] list){
        this.ap = ap;
        this.np = np;
        this.p = p;
        this.list = list;
    }

    /*
    metode untuk mengeset daftar pegawai
     */
    void setDaftar(Pegawai_Gaji[] list) {
        this.list = list;
    }

    Pegawai_Gaji cari(){
        int min = (int) this.list[0].getGajiPokok();
        int indeks = 0;

        for(int i = 1 ; i < this.list.length; i++) {
            if (this.list[i].getGajiPokok() > min) {
                min = (int) this.list[i].getGajiPokok();
                indeks = i;
            }
        }
        return list[indeks];
    }


    Pegawai_Gaji[] getDaftar(){
        return  list;
    }

}
