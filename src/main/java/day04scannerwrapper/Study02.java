package day04scannerwrapper;

import java.util.Scanner;


public class Study02 {
    public static void main(String[] args) {
        System.out.println("Lutfen 3 basmakli bir sayi giriniz.");

        Scanner input = new Scanner(System.in);
        int number  = input.nextInt();
        int birlerBasamagi  = number %10;
        number = number/10;


        int onlarBasamagi  = number %10;
        number = number/10;



        int yuzlerBasamagi  = number %10;
        number  = number/10;

        System.out.println(birlerBasamagi + onlarBasamagi + yuzlerBasamagi);

    }
}
