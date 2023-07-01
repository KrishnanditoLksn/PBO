package Modul_2_Test;

import Modul_2_Test.Gaji_Pegawai;

public class MainGaji {
        public static void main(String[]args){
            Gaji_Pegawai pegawai1 = new Gaji_Pegawai();
            pegawai1.NamaPegawai();
                System.out.println("=============================");
                pegawai1.setstatus();
            System.out.println("=================================");
            pegawai1.setJumlahAnak();
            System.out.println("=================================");
            pegawai1.golongan();
            System.out.println("=================================");
            pegawai1.setTunjangan();
            System.out.println("==================================");
            pegawai1.hitungGajiPokok();
    }
}
