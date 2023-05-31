package day01variables;

public class Variables01 {
    public static void main(String[] args) {

        //java bu satiri okumaz
        /*
        java bu satiri da okumaz
         */

        //Variables nasil olusturulur?
        //Data Type + variable name + Assigment Oparatot(atama operatoru) + Variable degeri + noktali virgul
          int            age                   =                                   13                ;

          //java cumlesi => statement
        //Dil bilgisindeki nokota ne ise Javada'ki noktali virgul ayni seydir,yani statement in bittigini gosterir.
        //Eger variables declaration yapar,Assigment yapmazsaniz java kendi default degerlerini koyar.
        //Default deger sayilar icin sifirdir.
        //Java da "=" assignment oparetor dir. ve java bu oparetoru gordugu zaman once sag tarafi calistirir.
        //Ve sagdaki degeri alir soldaki kutuya koyar.
        //Javada esittir demek "=="      matematikte "=",  Javada"="
        //Data type + VariableName ==>Varible declarition
        //Assigment Oparetor (=) + Variables degeri ==> Asignment
        /*
        Javada temekde iki tip data vardir
        1)primitive data type:
          char,boolean,byte,short,int,long,float,double

        2)non primitive data type:
          String
            */

        //Ornek 1: Ogrencu ismi icin variable olusturup deger olarak Ati Can atayiniz
        //Data Type + variable name + Assigment Oparatot(atama operatoru) + Variable degeri + noktali virgul
        String        ogrenciAdi               =                                "Ali Can"           ;

        //String lere verilen degerler daima cift tirnak icinde yazilmalidir.
        //String ler icin "default value "(==>varsayilan deger )"null"dir
        /*
        Stringler bir variables olusturdugumuzda cogu zaman ona bir deger atariz.Atama yapamazsak, java o variable a varsayilan dger olarak null koyar

        -null demek 0 demek degildir, 0 da coddign te bir degeri vardir, null hiclik demektir.
        -icinde variable yada method bulunmayan bor bir obje demektir.

         */
        //char data type
        //TEK karakter icin kullanilir. Sayi yada sembol farketmez.
        //ornegin ==> A,x, ?, 5 ...
        //Ornek 2 : char data type tipinde bir ismin ilk harfi olarak bir variables olusturunuz ve bir deger atayiniz.
        char isminIlkHarfi = 'A' ;
        //Note: char data type inda drgerler daima tek tirnak icinde yazilmalidir
        char cocugunYasi= '8';

        //bollean data type:
        // bolleanlar sadece 2 farkli deger alabilir; true(dogru) veya false(yanlis)
        //O yuzden isimlendirme yapilirken ingilizce olarak mi? soru eki anlaminda basina is konulur.
        //Ornek 3 : bollean data tipindeki emeklimisin sorusu icin bir veriable olusturun ve false degerini atayin.
        boolean isRetired = true;

        //byte data type:
        //tam sayilar icin kullanilir, hafizada 1 byte yer kaplar
        //byte : -128 den +127 e (dahil) kadar tam sayi degerleri icin kullanilir.
        //Ornek 4 :byte data tipinde ogrenci yasi icin bir veriable olusturunuz ve deger atayiniz
        byte ogrenciYasi = 18;

        //short data type
        //tam sayilar icin kullanilir. hafizada 2 byte yer kaplar.
        //short: -32768 den +32767 e (dahil) kadar tamsayi degeri icin kullanilir.
        //Ornek 5 : site nufusu icin bir variable olusturup degerler atayiniz.
        short siteNufusu = 1300;

        //int data type :
        //tam sayilar icin kullanilir, hafizada 4 byte yer kaplar
        //int : -2,147,483,648 den +2,147,483,648  e (dahil) kadar tam sayi degerleri icin kullanilir.
        //Ornek 6 : ulke nufuslari icin bir variables olusturunuz bir deger atamasi yapiniz.
        int populationcountry = 2000000;

        //long data type
        //tam sayilar icin kullanilir, hafizada 8 byte yer kaplar
        //long : -9,223,372,036,854,775,808 den +9,223,372,036,854,775,808  e (dahil) kadar tam sayi degerleri icin kullanilir.
        //Ornek 7 : Insan vucundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //Note : bir deger long ise sonuna buyuk "L" veya kucuk "l" konulur.
         long cellNumberInHumanBody = 15371712465583523L;
         //Eger longa atadiginiz deger int lerin araliginda ise sonuna "L" koymaya gerek yok.
        //Long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder.
         long wightOfSun = 123456719;

         //float data type
         // 4 byte yer kaplar
         //Float virgullu sayilar (Decimal Number ==> ondalik sayilar ) icin kullanilir(Fiyatlandirmalar - 12.99)
         //Ornek 8: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturunuz.
         //Note : bir deger float ise sonuna buyuk "F" veya kucuk "f" konulur.
         //Java onadalikli sayilari otomatik olarak "double" kabul eder.
         float totalcost = 139.89F;
         float gomlekUcret =78.97f;

         //double data type
         //double virgullu sayilar (Decimal Number ==> ondalik sayilar ) icin kullanilir.8 byte yer kaplar.
         //Ondalikli kismi icin daha fazla rakam olabilir. Hucre agirligi gibi bilimsel calismalarda kullanilabilir.
         //Ornel 9 : Hucre agirligi ve amipin agirligi icin 2 tane variables olusturunuz.
          double amipWeight = 0.00001;
          double hucreAgirligi=0.000006576;

          //Ornek 10: Ogrenci notlari icin iki adet veriable olusturunuz ve toplamlarini ekrana yazdiriniz.
          byte  note1 = 50;
          byte  note2 = 70;

          //System.out.println(); ekrana yazdirir.

        System.out.println(note1 + note2);
        //System.out.println(); Ekrana yazidirir ve pointeri bir sonraki satira koyar
        //System.out.print();Ekrana yazidirir ve pointeri bir sonraki satira koyar




    }
}
