package Modul_2;

public class MainSegitigaMRemake {
    public static void main(String[]args){
        Segitiga_Remake seg1= new Segitiga_Remake();
        Segitiga_Remake seg2= new Segitiga_Remake();

        seg1.setX1(1);
        seg1.setX2(7);
        seg1.setX3(7);
        seg1.setY1(2);
        seg1.setY2(2);
        seg1.setY3(9);

        System.out.println("Luas segitiga dengan titik (1,2) Page 4 of 5 (7,2) dan (7,9) adalah : " + seg1.hitungLuas());
        System.out.println("============================================================================================");

        seg2.setX1(0);
        seg2.setX2(5);
        seg2.setX3(8);
        seg2.setY1(0);
        seg2.setY2(4);
        seg2.setY3(2);
        System.out.println("Luas segitiga dengan titik (0,0) ,  (5,4) dan (8,2) adalah :" + seg2.hitungLuas());

    }
}
