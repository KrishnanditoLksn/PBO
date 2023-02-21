package Modul_1;

public class circle {
    double r;
    double luas;
    final double Phi=3.14;


    public void luas() {
        r = 6;
        luas = Phi * r * r;

        System.out.println(" Luas lingkaran dengan jari jari " + r + " adalah : " + luas);
    }

}
