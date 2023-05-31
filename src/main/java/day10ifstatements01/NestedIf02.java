package day10ifstatements01;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {

      /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz        */

        Scanner input = new Scanner(System.in);
        System.out.println("3 adet sayi giriniz");
        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());


        boolean ucgenmi = a+b>c && c>Math.abs(a-b) &&
                a+c>b && b>Math.abs(a-c) &&
                c+b>a && a>Math.abs(c-b) ;

        if (a <= 0 || b <= 0 || c <= 0) {

            System.out.println("Gecerli kenar uzunlugu giriniz");

        } else if (ucgenmi) {

            if (a == b && b == c && a == c) {
                System.out.println("Eskenar");
            } else if (a == b || b == c || a == c) {
                System.out.println("Ikizkenar");
            } else {
                System.out.println("Cesitkenar");
            }
        } else {
            System.out.println("Ucgen degildir");
        }



    }

}