package Modull_5;

import Modul_2.Pegawai_Gaji;
public class Perusahaan{

    String ap , np  , p , daftar;
    Pegawai_Gaji [] list;

    void setNp(String np){
        this.np = np;
    }

    String getNp(){
        return  np;
    }


    void setAp(String ap){
        this.ap = ap;
    }

    String getAp(){
        return  ap;
    }

    Perusahaan(String np , String ap , String p){
        this.ap = ap;
        this.np = np;
        this.p = p;
    }
    void setDaftar(Pegawai_Gaji[] list) {
        for (Pegawai_Gaji p1:list) {
            System.out.println(p1.getNpp() +"  -  "+  p1.getNamaPegawai());
        }
        this.list = list;
    }

    Pegawai_Gaji[] getDaftar(){
        return  list;
    }
    void setP(String p){
        this.p = p;
    }

    String getP(){

        return  p;
    }

}
