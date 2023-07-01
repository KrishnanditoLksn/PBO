package Modul_9;
import java.util.Scanner;
import static Modul_7.MainKaryawan.divide;

public class mainBangunDatar {
    private static final int WIDTH = 100;
    public static void pembagi() {System.out.println("-".repeat(WIDTH));}

    public static void choice() {
        System.out.println("1.SEGITIGA");
        System.out.println("2.LINGKARAN");
        System.out.println("3.SEGIEMPAT");
    }

    public static void main(String[] args) {
        Scanner robot = new Scanner(System.in);
        double jari2;
        int a, sisi, sisiB, sisiC, sisiA;
        System.out.println("Jumlah Bangun datar : ");
        int n = robot.nextInt();

        bangundatar[] bangundatars;
        bangundatars = new bangundatar[n];

        for (int i = 0; i < n; i++) {
            do {
                divide();
                choice();
                divide();
                System.out.println("yokk  : ");
                a = robot.nextInt();

                if (a == 1) {
                    System.out.print("SISI A : ");
                    sisiA = robot.nextInt();

                    System.out.print("SISI B : ");
                    sisiB = robot.nextInt();

                    System.out.print("SISI C : ");
                    sisiC = robot.nextInt();
                    bangundatars[i] = new Segitiga();
                    if (bangundatars[i] instanceof Segitiga) {
                        Segitiga segitiga;
                        segitiga = (Segitiga) bangundatars[i];
                        segitiga.setA(sisiA);
                        segitiga.setB(sisiB);
                        segitiga.setC(sisiC);
                    }
                }

                else if (a == 2) {
                    System.out.print("Jari - Jari  : ");
                    jari2 = robot.nextDouble();

                    bangundatars[i] = new Lingkaran();
                    if (bangundatars[i] instanceof Lingkaran) {
                        Lingkaran lingkaran;
                        lingkaran = (Lingkaran) bangundatars[i];
                        lingkaran.setJariJari(jari2);
                    }
                }

                /*
                asumsi segi empat disini persegi
                 */
                else if (a == 3) {
                    System.out.print("Sisi 1  : ");
                    sisi= robot.nextInt();
                    bangundatars[i] = new SegiEmpat();
                    if (bangundatars[i] instanceof SegiEmpat) {
                        SegiEmpat segiEmpat;
                        segiEmpat = (SegiEmpat) bangundatars[i];
                        segiEmpat.setPanjang(sisi);
                    }
                }
                else {
                    System.out.println("gobles atuh salah");
                }
            } while (a < 1 || a > 3);
        }

        divide();
        System.out.println("NO " + "\t\t\t" + "NAMA BANGUN DATAR" + "\t\t\t" + "KELILING" + "\t\t\t" + "LUAS");
        pembagi();

        for (int i = 0; i < bangundatars.length; i++) {
            System.out.println((i + 1) + "\t\t\t" + bangundatars[i].nama() + "\t\t\t\t" + bangundatars[i].hitungKeliling() + "\t\t\t\t" + bangundatars[i].hitungLuas());
        }
    }
}