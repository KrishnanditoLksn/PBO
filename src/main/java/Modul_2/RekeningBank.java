package Modul_2;

public class RekeningBank {

    private String nomorRek;
    private int saldo;

    public   RekeningBank(String nomor){
        this.nomorRek = nomor;
        saldo = 0;
    }
    public int getcekSaldo(){

        return  saldo;
    }

    public void settabung(int jumlah){
        this.saldo = saldo + jumlah;
    }

    public void setambil (int jumlah){
        this.saldo = saldo - jumlah;
    }

}
