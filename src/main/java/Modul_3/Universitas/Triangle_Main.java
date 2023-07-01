package Modul_3.Universitas;

import Modul_3.Universitas.Dot;
import Modul_3.Universitas.Triangle;

public class Triangle_Main {
    public static void main(String[]args){
            Dot A = new Dot(1,2);
            Dot B = new Dot(7 , 2);
            Dot C = new Dot(7,9);
            Triangle seg1= new Triangle(A, B , C);

        System.out.println("Luas Segitiga  dengan titik (1 ,2 ) ( 7 ,2 ) dan (7 , 9 ) adalah :   "  + seg1.hitungLuas());
    }
}
