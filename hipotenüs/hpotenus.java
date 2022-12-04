package hipotenüs;
import java.util.Scanner;

public class hpotenus {

    
    public static void main(String[] args) {
          
        int a ,b ;

        double c;


        Scanner i = new Scanner(System.in);

        System.out.print("1. Kenari giriniz : ");
         
           a = i.nextInt();

        System.out.print("2.Kenari giriniz : ");

        b = i.nextInt();

        c = Math.sqrt((a*a)+(b*b));

        System.out.print("Hipotenus : "+ c);

    }
}
          //  Hakan Çoban
          //  https://app.patika.dev/hknxx