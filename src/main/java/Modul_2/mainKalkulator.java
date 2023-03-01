package Modul_2;
public class mainKalkulator {
    public static void main(String[]args){
        kalkulator k1= new kalkulator();

        k1.setFirstNumber();
        k1.setSecondNumber();

        System.out.println("The result of addition of "+ k1.getFirstNumber()   + " and " + k1.getSecondNumber() + " is ae " + k1.getAddition());
        System.out.println("The result of multiplication of " + k1.getFirstNumber() + " and " +k1.getSecondNumber() + " is are "+ k1.getMultiplication());
        System.out.println("The result of division of " + k1.getFirstNumber() + " and " + k1.getSecondNumber() + " is are " + k1.getDivision());
        System.out.println("The result of substraction of " + k1.getFirstNumber() + " and " + k1.getSecondNumber() + " is are " + k1.getSubstraction());


        //System.out.println("Result of addition of  "  + "  and " + k1.getSecondNumber()+ " is are " + k1.getAddition());
       // System.out.println("Result of Substraction of " + k1.getFirstNumber() + " and " + k1.getSecondNumber()+ " is are " + k1.getSubstraction());
        //System.out.println("Result of  Multiplication of " + k1.getFirstNumber()+ " and " + k1.getSecondNumber()+ " is are " + k1.getMultiplication());




    }

}
