package Ex_heritance;


class Bawah_pub2 extends Atas_pub{

    @Override
    public void cetak1(){
        super.cetak1();
        System.out.println("Telah selesai memanggil cetak 1 milik superclass");
    }

    void cetak2(){
        System.out.println("Ada di class Bawah ..");
        System.out.println(" i = "+ i);
    }

    public static void main(String[] args) {
        Bawah_pub2 bew = new Bawah_pub2();
        bew.cetak1();
        bew.cetak2();
    }

}
