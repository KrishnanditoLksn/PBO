package Modul_2;//membuat metode main di package modul_2

import New_Book.KumpulanSegitiga;

import java.util.Scanner;

public class MainSegitigaMRemake {//membuat class MainSegitigaRemake
    static int jS;
    static  double x1,y1,x2,y2,x3,y3;
    public static void main(String[]args){//membuat metode main
        /*Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Segitiga :");
        jS = input.nextInt();

        Segitiga_Remake [] segitigaRemakes = new Segitiga_Remake[jS];
        KumpulanSegitiga  [] jumlahSegitiga = new KumpulanSegitiga[jS];
        for(int i = 0 ; i < jS;i++) {
            /*jumlahSegitiga: menyimpan jumlah segitiga yang ada dalam
            KumpulanSegitiga*/
            /*jumlahSegitiga[i]*/

        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Segitiga :");
        jS = input.nextInt();

        Segitiga_Remake[] segitigaRemakes = new Segitiga_Remake[jS];
        KumpulanSegitiga[] jumlahSegitiga = new KumpulanSegitiga[jS];
        for (int i = 0; i < jumlahSegitiga.length; i++) {
            /*jumlahSegitiga: menyimpan jumlah segitiga yang ada dalam
            KumpulanSegitiga*/

            System.out.println("====================================");
            System.out.println("Segitiga ke" + (i + 1) + " : ");
            System.out.println("=====================================");
            System.out.println("X1 : ");
            x1 = input.nextDouble();
            System.out.println("Y1 : ");
            y1 = input.nextDouble();
            System.out.println("X2 : ");
            x2 = input.nextDouble();
            System.out.println("Y2 : ");
            y2 = input.nextDouble();
            System.out.println("X3 : ");
            x3 = input.nextDouble();
            System.out.println("Y3 : ");
            y3 = input.nextDouble();


            segitigaRemakes[i] = new Segitiga_Remake(x1, y1, x2, y2, x3, y3);
            segitigaRemakes[i].setX1((int) x1);
            segitigaRemakes[i].setY1((int) y1);
            segitigaRemakes[i].setX2((int) x2);
            segitigaRemakes[i].setY2((int) y2);
            segitigaRemakes[i].setX3((int) x3);
            segitigaRemakes[i].setY3((int) y3);
            jumlahSegitiga[i] = new KumpulanSegitiga(jumlahSegitiga, segitigaRemakes);
            jumlahSegitiga[i].setDaftarS(segitigaRemakes);
            jumlahSegitiga[i].setJumlahS(jumlahSegitiga);
        }

        /*
        memanggil metode untuk menghitung keliling
         */
        /*for(KumpulanSegitiga segitigaRemake : jumlahSegitiga){
            System.out.println(segitigaRemake.HitungLuas() + segitigaRemake.hitungKeliing() + segitigaRemake.rataS());
        }*/
        double Luas = KumpulanSegitiga.HitungLuas();
        double terbesar  = KumpulanSegitiga.segitigaBesar();
        double kecil = KumpulanSegitiga.segitigaKecil();

        System.out.println("Segitiga luas terbesar : ");
        System.out.println(terbesar);

        System.out.println("Segitiga luas terkecil : ");
        System.out.println(kecil);


        }





















        /*Segitiga_Remake seg1= new Segitiga_Remake(0.0 , 0.0,0.0,0.0,0.0,0.0);//inisiasi objek bernama seg1 di konstruktor*/

        /*Segitiga_Remake seg2= new Segitiga_Remake(0.0 , 0.0,0.0,0.0,0.0,0.0);//inisiasi objek bernama seg2 di konstruktor*/

        /*seg1.setX1(1);//membuat atribut 1 untuk x1
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
        System.out.println("Luas segitiga dengan titik (0,0) ,  (5,4) dan (8,2) adalah :" + seg2.hitungLuas());//mencetak dan memanggil metode hitungLuas untuk objek seg2*/

    }