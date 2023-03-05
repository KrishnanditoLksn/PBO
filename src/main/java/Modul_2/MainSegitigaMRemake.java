package Modul_2;//membuat metode main di package modul_2

public class MainSegitigaMRemake {//membuat class MainSegitigaRemake
    public static void main(String[]args){//membuat metode main
        Segitiga_Remake seg1= new Segitiga_Remake();//inisiasi objek bernama seg1 di konstruktor
        Segitiga_Remake seg2= new Segitiga_Remake();//inisiasi objek bernama seg2 di konstruktor

        seg1.setX1(1);//membuat atribut 1 untuk x1
        seg1.setX2(7);//membuat atribut 2 untuk x2
        seg1.setX3(7);//membuat atribut 7 untuk x3
        seg1.setY1(2);//membuat atribut 2 untuk y1
        seg1.setY2(2);//membuat atribut 2 untuk y2
        seg1.setY3(9);//membuat atribut 9 untuk y3

        System.out.println("Luas segitiga dengan titik (1,2) Page 4 of 5 (7,2) dan (7,9) adalah : " + seg1.hitungLuas());//mencetak dan memanggil metode hitungLuas untuk objek seg1
        System.out.println("============================================================================================");//mencetak pembatas

        seg2.setX1(0);//membuat atribut 0 untuk x1
        seg2.setX2(5);//membuat atribut 5 untuk x2
        seg2.setX3(8);//membuat atribut 8 untuk x3
        seg2.setY1(0);//membuat atribut 0 untuk y1
        seg2.setY2(4);//membuat atribut 4 untuk y2
        seg2.setY3(2);//membuat atribut 2 untuk y3
        System.out.println("Luas segitiga dengan titik (0,0) ,  (5,4) dan (8,2) adalah :" + seg2.hitungLuas());//mencetak dan memanggil metode hitungLuas untuk objek seg2

    }
}
