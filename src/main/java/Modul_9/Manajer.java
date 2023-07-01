package Modul_9;

public class Manajer extends Pegawai  {
    private double tunJabatan;
    private double lemburan;

    public double getTunJab(){
        return tunJabatan;
    }

    public double getLembur(){
        return  lemburan;
    }

    public void setLembur(double overtime){
        lemburan = overtime;
    }

    @Override
    public String getStatus() {
        return "Manager";
    }

    @Override
    public double getTunjangan() {
        return tunJabatan + lemburan;
    }

    @Override
    public double hitungGatot() {
        return getGapok() + getTunjangan()  + lemburan;
    }

    @Override
    public String getEmail() {
        return "@"+getNpp() + "Manajer.usd.ac.id";
    }
}