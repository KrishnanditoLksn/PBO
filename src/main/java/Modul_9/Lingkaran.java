package Modul_9;

public class Lingkaran extends  bangundatar{
    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    private double jariJari;

    Lingkaran(){}

    @Override
    double hitungKeliling() {
        return 2 * Math.PI * getJariJari();
    }

    @Override
    String nama() {
        return "Lingkaran";
    }

    @Override
    double hitungLuas() {
        return Math.PI * Math.pow(2, getJariJari());
    }
}
