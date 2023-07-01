package Modul_2_Test;

import java.util.Scanner;
public class MainRapot {
    public static void main(String[]args){
            Scanner input  = new Scanner(System.in);
            Rpot rapotku1 = new Rpot();

        System.out.println("Nama Matakuliah awal : " + rapotku1.getNamaMatakuliah());
        System.out.println("Input nama matakuliah : ");
        String  namaMtk= input.next();
        rapotku1.setNamaMatakuliah(namaMtk);
        System.out.println();
        
        rapotku1.tampilPesan();
    }
}
