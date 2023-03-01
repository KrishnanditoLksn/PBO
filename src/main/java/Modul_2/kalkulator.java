package Modul_2;

import java.util.Scanner;
public class kalkulator {
    Scanner input = new Scanner(System.in);
    private     int FirstNumber;
    private   int SecondNumber;

    int getFirstNumber(){
        return  FirstNumber;
    }

    int getSecondNumber(){
        return  SecondNumber;
    }

    void setSecondNumber(){
        System.out.println("Input Second Number : ");
        SecondNumber = input.nextInt();
    }

    void  setFirstNumber(){
        System.out.println("Input First Number : ");
        FirstNumber = input.nextInt();
    }

    int getSubstraction(){
        return FirstNumber - SecondNumber;
    }

    int getAddition(){

        return  FirstNumber + SecondNumber;
    }

    int getMultiplication(){

        return  FirstNumber * SecondNumber;
    }

    int getDivision(){
        return  FirstNumber / SecondNumber;
    }
}
