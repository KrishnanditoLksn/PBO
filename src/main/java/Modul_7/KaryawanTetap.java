package Modul_7;
import java.text.NumberFormat;
import java.util.Locale;
/*
membuat kelas Karyawan tetap
 */

public class KaryawanTetap extends Karyawan {
    private double gajiPokok;
    private int gt;

    /*
    membuat konstruktor untuk kelas Karyawan tetap
     */

    public KaryawanTetap(String nama, int npp, int jumlahAnak, double subsidiPerAnakk) {
        super(nama, npp, jumlahAnak, subsidiPerAnak);
    }

    /*
    method untuk mereturn gaji pokok
     */
    public double getGajiPokok() {
        return gajiPokok;
    }
    /*
    method untuk mengesset gaji pokok
     */

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    /*
    metode untuk menghitung gaji Total
     */
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