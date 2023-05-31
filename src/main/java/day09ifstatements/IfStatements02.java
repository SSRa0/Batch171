package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {


        //Ornek1 = Kullanicidan alinan bir sayinin tek mi cift mi oldugunu komsola yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();

        //1.Yol
        if(num%2==0){
            System.out.println("Cift sayi...");

        }

        if(num%2!=0){
            System.out.println("Tek sayi");

        }
        //2.Yol
        if (num%2==0) {
            System.out.println("Cift sayi");
        }else{//aksi halde
            System.out.println("tek sayidir");
        }

    }//main
}//class
