package Modul_7;

/*
membuat kelas Karyawan tetap
 */
public class KaryawanTetap extends  Karyawan {
    double gajiPokok;
    int gt;

    /*
    membuat konstruktor untuk kelas Karyawan tetap
     */
    public KaryawanTetap(String nama, int npp, int jumlahAnak, double subsidiPerAnak,double gajiPokok) {
        super(nama, npp, jumlahAnak, subsidiPerAnak);
        this.gajiPokok = gajiPokok;
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

    public void gajiTotal(){
        gt = (int) (getGajiPokok() + tunjanganAnak());
        System.out.println(gt);
    }

}
