package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz.");
        int number = input.nextInt();
        //Bir sayinin son rakamini alabilmek icin o sayiyi 18 a bolup kalani almaliyiz
        // %==> modulus oparator solunda bulunan sayinin saginda bulunan sayiya bolumunde kalani verir.
        //dolayisiyla %10 her zaman bize birler basamginda bulunan sayiyi verir
        //bir tamsayiyi bir tamsayiya bolerseniz java sonucu kesinlikle tamsayi yapar.
        //java bu durumda yuvarlama yapmaz, ondalik kismi iptal eder.
        //dolayisiyla bir tamsayiyi 10 a bolersek birler basamagini silmis oluruz.

        //son rakami al
        int birlerBasamagi = number % 10;
        number = number / 10;

        //sondan ikinci rakami al
        int sondanIkinci = number % 10;
        number = number / 10;

        //sondan üçüncüyü al
        int sondanUcuncu = number % 10;
        number = number / 10;

        //sondan dorduncuyu al
        int sondanDorduncu = number % 10;
        number = number / 10;

        //sondan besinciyi al
        int sondanBesinci = number % 10;
        number = number / 10;
        //son rakam oldugu icin artık kücültmeye gerek yok

        System.out.println(sondanBesinci + sondanDorduncu + birlerBasamagi + sondanIkinci);



/*
    Homework
    1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
     ornegin => 3,5,7 icin ortalama (3+5+7)/3=5
    2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
     ornegin => 312 icin 3+1+2=6

 */
    }
}
