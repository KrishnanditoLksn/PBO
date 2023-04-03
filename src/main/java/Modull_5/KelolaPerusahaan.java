package Modull_5;
import java.util.*;
import Modul_2.Pegawai_Gaji;

public class KelolaPerusahaan {
    static  int status , ja;
    static  String np , ap  , npp  ,  pemilik , namaPegawai , p;
    static  double gajii;
    static int golongan;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Jumlah Pegawai : ");
        int jp = input.nextInt();

        Pegawai_Gaji [] pg1 = new Pegawai_Gaji[jp];
        Perusahaan [] p1 = new Perusahaan[jp];

        for(int i = 0; i < jp; i++){
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

            System.out.println((i + 1)+ " . " + "Perusahaan : ");
            np = input.next();
            np +=input.nextLine();

            System.out.println("Alamat Perusahaan : ");
            ap = input.nextLine();
            ap += input.nextLine();

            System.out.println("Pemilik  : ");
            p = input.next();
            p += input.nextLine();

            pg1[i] = new Pegawai_Gaji(namaPegawai, npp , status ,golongan);
            p1[i] = new Perusahaan(np , ap , p);
            pg1[i].setNamaPegawai(namaPegawai);
            pg1[i].setNpp(npp);
            pg1[i].setGolongan(golongan);
            pg1[i].setStatus(status);
            pg1[i].hitungGajiPokok();
            pg1[i].hitungTunjanganKeluarga();
            pg1[i].hitungGajiTotal();
            p1[i].setNamaPerusahaan(np);
            p1[i].setAp(ap);
            p1[i].setP(p);
            /*

            System.out.println(pg1[i].getNamaPegawai());
            System.out.println(pg1[i].getNpp());
            System.out.println(pg1[i].getStatus());
            System.out.println(pg1[i].getGolongan());
            System.out.println(pg1[i].getJuumlahAnak());

            */
        }
        for (Perusahaan perusahaan1 : p1) {
            System.out.println("Daftar Perusahaan  : " + perusahaan1.getNamaPerusahaan() + " - " + perusahaan1.getNp() );
        }
    }
    /*
    method for

     */

    }
