package Modul_1;
import java.util.Scanner;
public class MainBujurSangkar {
    public static void main(String[]args){

        BujurSangkar b1= new BujurSangkar();
        BujurSangkar b2= new BujurSangkar();
        Scanner input = new Scanner(System.in);


        System.out.println("Input sisi 1  bujursangkar : ");
        b1.sisi= input.nextInt();

        System.out.println("Input sisi 2  bujursangkar");
        b2.sisi = input.nextInt();

        System.out.println("Luas bujursangkar dengan input sisi ke 1  bernilai " + b1.sisi + " dan " + b2.sisi+" adalah : " + b1.luas()+ " dan  luas ke 2 yaitu : " + b2.luas());

    }
}
