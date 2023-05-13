package Modul_9;

public class Manajer extends Pegawai {
    private double tunjanganJabatan;
    private double lemburan;

    double getTunJab(){
        return tunjanganJabatan;
    }

    double getLembur(){
        return  lemburan;
    }

    @Override
    String getStatus() {
        return "Manager";
    }

    @Override
    double getTunjangan() {
        return tunjanganJabatan + lemburan;
    }

    @Override
    double hitungGatot() {
        return getGapok() + getTunjangan()  + lemburan;
    }
}
