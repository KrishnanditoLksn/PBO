package bekasmodul;

import Modul_7.Karyawan;
import Modul_7.KaryawanTetap;

import java.text.NumberFormat;
import java.util.Locale;

public class Karyawan_Tetap extends Karyawan {
    KaryawanTetap[]karyawanTetaps;
    private  double gajiPokok;
    private int gt;
    protected Karyawan_Tetap(String nama, int npp, int jumlahAnak, double subsidiPerAnak) {
        super(nama, npp, jumlahAnak, subsidiPerAnak);
    }

    public void setKaryawanTetaps(KaryawanTetap[]karyawanTetaps){
        this.karyawanTetaps = karyawanTetaps;
    }

    public double getGajiPokok(){
        return  gajiPokok;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public double gajiTotal() {
        gt = (int) (getGajiPokok() + tunjanganAnak());
        return gt;
    }
    /*
    metode untuk menkonversi double ke  format rupiah
     */

    @Override
    protected String convertRupiah(int price){
        Locale localId = new Locale("in","ID");
        NumberFormat format = NumberFormat.getCurrencyInstance(localId);
        return format.format(price);
    }

}
