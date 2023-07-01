package Modul_2;

public class RekeningBank {

    private final String nomorRek;
    private int saldo;

    public RekeningBank(String nomor){
        nomorRek = nomor;
        saldo = 0;

    }
    public int cekSaldo(){
        return  saldo;
    }

    public void tabung(int jumlah){
        saldo = saldo + jumlah;
    }

    public void ambil (int jumlah){
        saldo = saldo - jumlah;
    }

}
