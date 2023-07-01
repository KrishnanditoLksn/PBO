package Ex_heritance;

public class Bawah_pub1 {
    public int i = 5;

    private void cetak1(){
        System.out.println("Ada di class BAWAH");
        
    }

    void cetak2(){
        System.out.println("Ada di class  BAWAH .....");
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Bawah_pub1 bwh   = new Bawah_pub1();
    }
}
