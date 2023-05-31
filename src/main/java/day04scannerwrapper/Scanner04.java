package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {


        //Ornek : Kullanicidan 1 dikdorteginin iki kenar uzunlugunu aliniz.
        //a)Alanini hesaplayiniz. ==>Kisa kenar * uzun kenar
        //b) Cversesini hesaplayiniz ==> 2 * Kisa kenar + 2 * Uzun kenar

        Scanner input =  new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenar uzulugunu giriniz...");
        double shortSide =  input.nextDouble();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz...");
        double longSide = input.nextDouble();

        System.out.println("Alan = "+shortSide*longSide);

        System.out.println("Cevre = "+ ( 2 * shortSide +  2 * longSide));


    }
}
