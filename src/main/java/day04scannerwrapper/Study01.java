package day04scannerwrapper;

import java.util.Scanner;

public class Study01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 3 adet sayi giriniz.");
        int onenumber = input.nextInt();
        int twonumber = input.nextInt();
        int threenumber = input.nextInt();

        System.out.println("ortalama : "+(onenumber+twonumber+threenumber)/3);

        System.out.println("Lutfen 3 basmakli bir sayi giriniz.");
        Scanner sayi = new Scanner(System.in);

        int number  = input.nextInt();
        int birlerBasamagi  = number %10;
        number = number/10;

        number  = input.nextInt();
        int onlarBasamagi  = number %10;
        number = number/10;


        number = input.nextInt();
        int yuzlerBasamagi  = number %10;
        number /= 10;

        System.out.println(("Rakamlari toplami") + (birlerBasamagi + onlarBasamagi + yuzlerBasamagi));


    }
}