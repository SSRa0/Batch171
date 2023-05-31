package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 13;

        /* NOT :
            1- Bu yapinin icinde sadece bir tane data depolanabilir.
            2- ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
            3-Bir yapinin icinde coklu data depolayabilmek icin Java Array yapisini olustururuz.
        */

        /*  Array nasil olusturulur?
            String stdName [] = new String []; Hangi tipte ise o tip data type koyulur.      */

        String stdName [] = new String[5];
        System.out.println(Arrays.toString(stdName));
        //toString() metot kullanmadan sadece o array'in ramædeki adresini yazdirir.

        /*
        Array'ler diger collection'lardan cok daha hizlidir (superfast).
        Array'ler diger collection'lardan daha az memory kullanirlar.
         */

        // Array'e eleman ekleme nasil yapilir?
        stdName [2] = "Benna";
        stdName [3] = "Abdullah";
        stdName [4] = "Recep";
        stdName [0] = "Ekim";
        stdName [1] = "Ailana";

        System.out.println(Arrays.toString(stdName)); //[Ekim, Ailana, Benna, Abdullah, Recep]

        System.out.println(stdName[3]);//Abdullah
        System.out.println(stdName[0]);//Ekim
        System.out.println(stdName[4]);//Recep

        //length() Stringlerde metot (parantezli), Array'lerde ise parantezsiz yazilir.(metot degil)

        //Ornek-1: Array her elemanin sonuna "!" isareti koyunuz.
        for (int i =0; i< stdName.length; i++){
            System.out.println(stdName[i]+ "!");
        }







    }
}