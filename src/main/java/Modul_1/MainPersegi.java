package Modul_1;

import javax.swing.*;
public class MainPersegi {
    public static void main(String[]args){
        Persegi o1= new Persegi();

        o1.panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));
        o1.lebar = Integer.parseInt(JOptionPane.showInputDialog("Input lebar : "));

        JOptionPane.showMessageDialog(null, "Luas dari persegi dengan panjang = " + o1.panjang +"dengan lebar " + o1.lebar + "adalah : " + o1.luas());
    }
}
