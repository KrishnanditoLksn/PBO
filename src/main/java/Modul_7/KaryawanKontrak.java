package Modul_7;
import java.util.Scanner;

/*
membuat class bernama Karyawan Kontrak dengan mewariskan dari kelas Karyawan
 */

public class KaryawanKontrak extends Karyawan {
    int upahHarian;
    double upahTotal;

    /*
    membuat kelas konstruktor bernama Karyawan Kontrak
     */

    public KaryawanKontrak(String nama, int npp, int jumlahAnak, double subsidiPerAnak,int upahHarian) {
        super(nama, npp, jumlahAnak, subsidiPerAnak);
        this.upahHarian = upahHarian;
    }

    /*
    methd untuk mengeset upah Harian
     */

    public void setUpahHarian(int upahHarian){
        this.upahHarian = upahHarian;
    }

    /*
    method untuk mereturn upah harian
     */
    public int getUpahHarian(){
        return  upahHarian;
    }

    /*
    user memilih jumlah hari setiap bulan
     */
    public void jumlahHari(Scanner scan){
        System.out.println("Masukkan Bulan  :  ");
        int month = scan.nextInt();

        switch (month) {

            /*
            user menginput jumlah hari dan hanya sekali dalam 1 bulan
             */

            case (1) -> {
                System.out.println("Masukkan jumlah hari masuk : ");
                int j = scan.nextInt();
                if (j > 1 && j <= 31) {
                    upahTotal = (j * getUpahHarian()) + tunjanganAnak();
                    System.out.println(upahTotal);
                } else if (j > 31 || j == 0) {
                    System.out.println("Januari sampai 31 dan tidak boleh nol");
                }
            }
            case (2) -> {
                System.out.println("Masukkan jumlah hari masuk : ");
                int f = scan.nextInt();
                if (f > 1 && f <= 29) {
                    upahTotal = (f * getUpahHarian()) + tunjanganAnak();
                    System.out.println(upahTotal);
                } else {
                    System.out.println("Februari bisa sampai 29 dan tidak boleh nol");
                }
            }
            case (3) -> {
                System.out.println("Jumlah hari masuk : ");
                int m = scan.nextInt();
                if (m > 1 && m <= 31) {
                    upahTotal = (m * getUpahHarian()) + tunjanganAnak();
                    System.out.println(upahTotal);
                } else {
                    System.out.println("Maret sampai  31 dan tidak boleh nol");
                }
            }
            case(4)->{
                System.out.println("Jumlah hari masuk : ");
                int a  = scan.nextInt();
                if(a > 1 && a <= 30){
                    upahTotal = (a * getUpahHarian() + tunjanganAnak());
                    System.out.println(upahTotal);
                }
                else {
                    System.out.println("April sampai 30 dan tidak boleh nol ");
                }
            }
            case (5)->{
                System.out.println("Jumlah hari masuk : ");
                int m = scan.nextInt();
                if(m > 1 && m <= 31){
                    upahTotal = (m * getUpahHarian() + tunjanganAnak());
                    System.out.println(upahTotal);
                }
                else {
                    System.out.println("Mei sampai 31 dan tidak boleh nol ");
                }
            }
            case(6)->{
                System.out.println("Jumlah hari masuk : ");
                int jun = scan.nextInt();

                if(jun > 1 && jun<=30){
                    upahTotal = (jun * getUpahHarian() + tunjanganAnak());
                    System.out.println(upahTotal);
                }
                else {
                    System.out.println("Juni sampai 30 dan tidak boleh nol");
                }
            }
            case(7)->{
                System.out.println("Jumlah hari masuk : ");
                int jul = scan.nextInt();

                if(jul > 1  && jul<=31){
                    upahTotal  = (jul * getUpahHarian() + tunjanganAnak());
                    System.out.println(upahTotal);
                }
                else {
                    System.out.println("Juli sampai 31 dan tidak boleh nol ");
                }
            }
            case(8)->{
                System.out.println("Jumlah hari masuk : ");
                int au = scan.nextInt();

                if(au > 1  && au <=30){
                    upahTotal = (au * getUpahHarian() + tunjanganAnak());
                    System.out.println(upahTotal);
                }
                else {
                    System.out.println("Agustus sampai 30 dan tidak boleh nol ");
                }
            }
            case(9)->{
                System.out.println("Jumlah hari masuk : ");
                int sep = scan.nextInt();

                if(sep > 1 && sep<=31){
                    upahTotal=(sep * getUpahHarian()  + tunjanganAnak());
                    System.out.println(upahTotal);
                }
                else {
                    System.out.println("September sampai 31 dan tidak boleh nol ");
                }
            }
            case(10)->{
                System.out.println("Jumlah hari masuk : ");
                int okt = scan.nextInt();

                if(okt >  1 && okt <=30){
                    upahTotal =(okt * getUpahHarian() + tunjanganAnak());
                    System.out.println(upahTotal);
                }
                else {
                    System.out.println("Oktober sampai 30 dan tidak boleh nol");
                }
            }
            case(11)->{
                System.out.println("Jumlah hari masuk : ");
                int nov = scan.nextInt();

                if(nov > 1 && nov<=31){
                    upahTotal = (nov * getUpahHarian() + tunjanganAnak());
                    System.out.println(upahTotal);
                }
                else {
                    System.out.println("November sampai 31 dan tidak boleh nol ");
                }
            }
            case(12)->{

            }
        }
    }
}
