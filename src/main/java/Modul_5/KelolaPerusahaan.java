package Modul_5;
import java.util.*;
import New_Book.Pegawai_Gaji;
public class KelolaPerusahaan {
    /*
    membuat variabel untuk data pegawai
     */
    static  int status , ja;
    static  String np , ap  , npp  ,  pemilik , namaPegawai , p;
    static  double gajii;
    static int golongan;
    Pegawai_Gaji [] terbesar;
    /*
    membuat method main
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        user diminta untuk input jumlah pegawai
         */

        System.out.println("Input Jumlah Pegawai : ");
        int jp = input.nextInt();

        Pegawai_Gaji[] pg1 = new Pegawai_Gaji[jp];
        Perusahaan[] p1 = new Perusahaan[jp];


        for (int i = 0; i < jp; i++) {
            /*
            namaPegawai = input.next();

            System.out.println("NPP :");
            npp = input.next();

            System.out.println("Golongan  : ");
            golongan = input.nextInt();

            System.out.println("Status : ");
            status = input.nextInt();

            /*System.out.println("Jumlah Anak");
                ja = input.nextInt();*/

            System.out.println((i + 1) + " . " + "Perusahaan : ");
            np = input.next();
            np += input.nextLine();

            System.out.println("Alamat Perusahaan : ");
            ap = input.next();
            ap += input.nextLine();

            System.out.println("Pemilik  : ");
            p = input.next();
            p += input.nextLine();


            pg1[i] = new Pegawai_Gaji(namaPegawai, npp, status, golongan);
            p1[i] = new Perusahaan(np, ap, p, pg1);
            pg1[i].setNamaPegawai(namaPegawai);
            pg1[i].setNpp(npp);
            pg1[i].setGolongan();
            pg1[i].setStatus();
            pg1[i].hitungGajiPokok();
            pg1[i].hitungTunjanganKeluarga();
            pg1[i].hitungGajiTotal();
            pg1[i].setNamaPerusahaan(np);
            p1[i].setAp(ap);

        }
    /*
    method for untuk menampilkan pegawai yang ada      */



        for(Pegawai_Gaji pegawaiGaji:pg1){
            System.out.println("Nama Pegawai : " + pegawaiGaji.getNamaPegawai() + " - " + pegawaiGaji.getStatus() + " - " +  pegawaiGaji.getGolongan() + " - " + pegawaiGaji.getNamaPerusahaan());
        }

        /*
        Method untuk menghitung  pegawai gaji terbesar
         */

        Pegawai_Gaji terbesar = pg1[0];
        int sum = 0;
        int total = 0;

        /*for (Pegawai_Gaji pegawaiGaji:pg1) {
            if(pegawaiGaji.getGajiPokok() > terbesar.getGajiPokok()){
                System.out.println("Nama Pegawai dengan gaji Terbesar adalah " + pegawaiGaji.getNamaPegawai());
            }
            else if(pegawaiGaji.getGajiPokok() < terbesar.getGajiPokok()){
                System.out.println("Nama Pegawai dengan gaji terkecil  adalah " + pegawaiGaji.getNamaPegawai());
            }
        }
        /*
        Menghitung rata
         */


        for(int i  = 1 ; i < pg1.length;i++){
            sum = (int) (sum + pg1[i].getGajiPokok());
            total = sum / jp;
        }
        System.out.println("Rata - Rata Gaji Pegawai : " + total);
    }
    }