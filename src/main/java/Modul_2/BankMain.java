package Modul_2;

public class BankMain {
    public static void main(String[]args){
        RekeningBank RekeningBudi  = new RekeningBank("12345");
        System.out.println("Rekening Budi = " + RekeningBudi.cekSaldo());
        System.out.println("Nabung Rp 6000000");
        RekeningBudi.tabung(60000000);
        System.out.println("Rekening Budi sekarang = " +RekeningBudi.cekSaldo());
        System.out.println("Ambil 1000");
        RekeningBudi.ambil(1000);
        System.out.println("Rekening Budi sekarang = " + RekeningBudi.cekSaldo());
    }


}
