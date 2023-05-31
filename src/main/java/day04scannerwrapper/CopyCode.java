package day04scannerwrapper;

import java.util.Scanner;

public class CopyCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("3 basamakli bir sayı giriniz..:");

        int number = input.nextInt();

        //son rakami al
        int birlerBasamagi = number % 10;
        //sayiyi kucult
        number = number / 10;

        //sondan ikinci rakami al
        int onlarBasamagi = number % 10;
        //sayiyikucult
        number = number / 10;

        //sondan ucuncuyu al
        int yuzlerBasamagi = number % 10;

        System.out.println("3 basamakli sayinin rakamlari toplami...:" + (birlerBasamagi + onlarBasamagi + yuzlerBasamagi));
    }
}
