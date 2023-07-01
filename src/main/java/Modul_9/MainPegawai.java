package Modul_9;

import java.util.*;
//mengimport method untuk border
import static Modul_7.MainKaryawan.divide;
import static Modul_9.mainBangunDatar.pembagi;

public class MainPegawai {

    private static void cetakPilihan(){
        System.out.println("1.MANAJER");
        System.out.println("2.PEMASARAN");
        System.out.println("3. HONORER ");
    }

    public static void main(String[] args) {
        int choice,npp;
        String nama;
        double gaPok,tunjangan;
        Scanner robot = new Scanner(System.in);
        System.out.println("Jumlah Pegawai : ");
        int jumPeg = robot.nextInt();

        Pegawai [] karyawan = new Pegawai[jumPeg];

        /*
        memasukkan data karyawan
         */
        for(int i = 0 ; i < karyawan.length; i++){
            do {
                cetakPilihan();
                System.out.println("Anda sebagai apa ? : ");
                choice = robot.nextInt();

                System.out.println((i + 1 ) + " . " + "Nama Karyawan : ");
                nama = robot.next();
                nama +=robot.nextLine();

                System.out.println("NPP : ");
                npp = robot.nextInt();

                System.out.println("Gaji Pokok : ");
                gaPok = robot.nextDouble();

                 if (choice == 1 ){
                     karyawan[i] = new Manajer();
                 }
                 else if(choice == 2){
                    karyawan[i] = new Pemasaran();

                 }
                 else if(choice == 3){
                     karyawan[i] = new Honorer();

                 }
                 else {System.out.println("yang bener ");}

                 karyawan[i].setNama(nama);
                 karyawan[i].setNpp(npp);
                 karyawan[i].setGapok(gaPok);
            }
            while (choice  < 1 || choice > 3);
        }

        divide();
        System.out.println("NO " + "\t\t\t" + "NPP" + "\t\t\t" + "NAMA" + "\t\t\t" + "STATUS" +"\t\t\t"+"GAJI POKOK"+"\t\t\t" + "TUNJANGAN"+"\t\t\t"+"GAJI TOTAL");
        pembagi();

        for(int i=0; i<jumPeg; i++){
            System.out.print((i+1)+ "."+"\t\t\t"+karyawan[i].getNpp()+"\t\t\t"+karyawan[i].getNama()+"\t\t\t"+karyawan[i].getStatus());

            if (karyawan[i] instanceof Manajer) {
                //menampilkan status manajer dan menghitung tunjangan manajer
                Manajer man1;
                man1 = (Manajer)karyawan[i];
                //System.out.print(" Manajer ");
                man1.setLembur(250000);
                tunjangan = man1.getTunJab()+man1.getLembur();
            }
            else if (karyawan[i] instanceof Pemasaran) {
                //menampilkan status pemasaran dan menghitung tunjangannya
                Pemasaran pem1;
                pem1 = (Pemasaran)karyawan[i];
                //System.out.print(" Pemasaran ");
                pem1.setBonus(150000);
                tunjangan = pem1.getBonus();
            }
            else if (karyawan[i] instanceof Honorer) {
                //menampilkan status honorer dan hitung tunjangannya
                Honorer hon1;
                hon1= (Honorer)karyawan[i];
                //System.out.print(" Honorer ");
                hon1.setLembur(100000);
                tunjangan = hon1.getLembur();
            }
            //dilanjutkan mencetak gajiPokok, tunjangan dan gaji total
            //untuk setiap karyawan
            System.out.println("\t\t\t"+karyawan[i].getGapok()+"\t\t\t"+karyawan[i].getTunjangan()+"\t\t\t"+karyawan[i].hitungGatot() + "\t\t\t" + karyawan[i].getEmail());
        }
    }
}
