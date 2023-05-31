package day03methodobjectcreationscanner;


import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //1. Adim Scanner Classtan Obje olustur.
        Scanner input = new Scanner(System.in);

        //2.adim kullaniciya ne istediginize dair mesaj veriniz.
        System.out.println("Lutfen yasinizi giriniz");

        //3.adim Uygun methodu kullanarak kullanicinin verdigi datayi memorye yerlestiriniz.
        byte age = input.nextByte();

        System.out.println("age = " + age);



    }
}
