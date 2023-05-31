package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //Ternary Statement
        //Ornek 1 : Sayi 10 dan kucuk ise consola "kucuk" yazdirin degil ise "kucuk degil" yazdiriniz
        //--------if else cozumu------

        int num = 2;
        if (num<10) {
            System.out.println("kucuk");
        }else {
            System.out.println("kucuk degil");
        }

            //------Ternanry Cozumu--------
                            //Conditon       ?     Condition treu ise calsisir : Condition falsi ise calisir  ;
           String sonuc =  num<10 ?          "Kucuk"                :            "Kucuk degil"    ;
            System.out.println(sonuc);


        int num2=12;
        if (num2<10) {
            System.out.println("tek");
        }else{
            System.out.println("cift");
        }


        String sonuc2 =num2<10  ?  "tek"     : "Cift";
        System.out.println(sonuc2);

        String sonuc3=num>0 ? "pozitif" : "pozitif değil";
        System.out.println("sonuc3 = " + sonuc3);


        //Ornek 4: Kullanicidan iki sayi aliniz "buyuk olmayan" (kucuk veya esit olan) sayiyi yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz..");

        double first = input.nextDouble();
        double second = input.nextDouble();

        //1. yol if else cozumu
        if (first < second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }

        //2. yol Ternary
        double result2 = first < second ? first : second;
        System.out.println(result2);


    }//main

}//class
