package Modul_9;

public class SegiEmpat extends  bangundatar {
    private int panjang , lebar ;
    int kelSegi;

    SegiEmpat(){}

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setPanjang(int panjang){
        this.panjang = panjang;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar(){
        return  lebar;
    }

    @Override
    double hitungKeliling() {
        kelSegi = getPanjang() * getLebar();
        return  kelSegi;
    }

    @Override
    String nama() {
        return "Segiempat";
    }

    @Override
    double hitungLuas() {
        return  getPanjang() * getLebar();
    }
}
