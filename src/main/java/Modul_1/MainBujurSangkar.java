package Modul_1;
//mengimport metode scanner di java
import java.util.Scanner;


//mendeklarasikan class bernama MainBujurSangkar
public class MainBujurSangkar {
    //mendeklarasikan  metode main
    public static void main(String[]args){
        //membuat objek  pertama bujur sangkar  dengan  nama b1
        BujurSangkar b1= new BujurSangkar();
        //membuat objek kedua bujur sangkar dengan nama b2
        BujurSangkar b2= new BujurSangkar();
        //membuat  input scanner
        Scanner input = new Scanner(System.in);


        //user memasukkan sisi pertama bujursangkar
        System.out.println("Input sisi 1  bujursangkar : ");
        b1.sisi= input.nextInt();

        //user memasukkan sisi kedua bujursangkar
        System.out.println("Input sisi 2  bujursangkar");
        b2.sisi = input.nextInt();

        //mencetak luas bujur sangkar dengan memanggil variabel sisi yang sudah diisi dengan sisi pertama dengan objek b1 dan memanggil variabel sisi yang sudah diisi dengan objek b2
        //kemudian mencetak luas  dengan rumus sisi di input objek 1 dikali sisi di input object 2
        System.out.println("Luas bujursangkar dengan input sisi ke 1  bernilai " + b1.sisi + " dan " + b2.sisi+" adalah : " + b1.luas()+ " dan  luas ke 2 yaitu : " + b2.luas());
    }
}
