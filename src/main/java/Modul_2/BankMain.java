package Modul_2;

public class BankMain {
    public static void main(String[]args){
        RekeningBank rekRonaldo  = new RekeningBank("7");
        System.out.println("Rekening Ronaldo  = " + rekRonaldo.getcekSaldo());
        System.out.println("Nabung Rp 6000000");
        rekRonaldo.settabung(60000000);
        System.out.println("Rekening Ronaldo sekarang = " + rekRonaldo.getcekSaldo());
        System.out.println("Ambil 1000");
        rekRonaldo.setambil(1000);
        System.out.println("Rekening Ronaldo sekarang = " + rekRonaldo.getcekSaldo());
    }


}
