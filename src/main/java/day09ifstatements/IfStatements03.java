package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        //Ornek : Verilen karakter buyuk harf ise ekrana "Buyuk harf" yazdiran
        // kucuk harf ise "Kucuk Harf" yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz..." );
        char ch = input.next().charAt(0);

        //1.Yol
        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk harf..");

        }
        if (ch>='a' && ch<='z'){
            System.out.println("kucuk harf.");

        }
        if (ch>='A' && ch<='Z') {
            System.out.println("buyuk harf");
        }else{
            System.out.println("kucuk harf");
        }



    }//main
}//class
