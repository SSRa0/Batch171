package day04scannerwrapper;


import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //Ornek : Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz.

        //1. Adim Scanner Classtan bir obje olusutur.
        Scanner input = new Scanner(System.in);

        //2. Adim : Kullaniciya ne istedigimize dair mesaj veriniz
        System.out.println("Ilk isminizi giriniz.");

        //3.Adim : Uygun method u  kullanarak kullanicinin verdigi datayi memory e yerlestiriniz.
        String firstName = input.next();

        System.out.println("Soy isminizi giriniz...");
        String lastName = input.next();
        System.out.println(firstName+" "+lastName);// ali can

    }
}
