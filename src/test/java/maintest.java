import  java.util.Scanner;
public class maintest {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        test1 rapot1= new test1();
        System.out.printf("Nama Matakuliah awal :  %s\n\n"  , rapot1.getNamaMatakuliah());

        System.out.println("input n ");
        String nm = input.next();

        rapot1.setNamaMatakuliah(nm);
        System.out.println();

        rapot1.tampilPesan();
    }


}
