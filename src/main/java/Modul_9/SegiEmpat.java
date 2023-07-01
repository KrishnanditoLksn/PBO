package Modul_9;

public class SegiEmpat extends  bangundatar {
     int panjang;
     int kelSegi;

    SegiEmpat(){}

    public void setPanjang(int panjang){
        this.panjang = panjang;
    }

    public int getPanjang() {
        return panjang;
    }

    @Override
    public double hitungKeliling() {
        kelSegi = 4 * getPanjang();
        return  kelSegi;
    }

    @Override
    public String nama() {
        return "Segiempat";
    }

    @Override
    public double hitungLuas() {
        return  getPanjang() * getPanjang();
    }
}
