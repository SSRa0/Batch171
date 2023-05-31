package day01variables;

import javax.imageio.ImageTranscoder;

public class Study01 {
    public static void main(String[] args) {


        //char data type turunde bir rakam belirleyiniz ve bir variables olustrunuz.
        char   randomNumber = '8';

        System.out.println(randomNumber);
        //bollean data type turunde yuruyebilir misin sorusunu cevap veriniz.
        boolean  canYouWalking = true;

        System.out.println(canYouWalking);

        //byte data type turunde kac yasindasin sorusuna cevap veriniz.
        byte   howOldAreYou = 26;
        System.out.println(howOldAreYou);

        //string data type turunde hangi sehirde yasiyorsun sorusuna cevap veriniz.
        String  WhereYouLiveCity = "istanbul";
        System.out.println(WhereYouLiveCity);

        //string data type turunde hangi ulkede yasiyorsun sorusuna cevap veriniz.
        String WhereYouLiveCountry = "turkey";
        System.out.println(WhereYouLiveCountry);

        // iki tamsayi turunde variable olusturup toplamini yazdirin.
        byte number1 = 120;

        byte number2 = 119;


        System.out.println(number1 + number2);


        //NOTLAR
        //obje uretmek icin classlara ihtiyacimiz var.
        //objerlerde 2 ozellik var aktif pasif.
        //pasifler=Variables aktif=Method
        //Compaile javada yazilan kodlarin 0 ve 1 lere donusmesine denir.
        //Class isimleri buyuk harfle baslar.
        //Package isimleri kucuk harfle baslar
        //public=accsess modifair
        //main methodu arabanin motorudur.o olmadan kod baslamaz
        //Variables nasil olusturulur?
        //Data Type + variable name + Assigment Oparatot(atama operatoru) + Variable degeri + noktali virgul !!
        //Variable ler ne icin kullanilir = programda kullanılan verileri birbirlerinden ayırmak için onlara verilen adlardır
        //Data Type + variable name ==> Veriable declaration
        //Assigment Oparetor (=) + Variables degeri ==> Asignment
        // Java bu oparatoru gordugu zaman '=' a sag taraftan okumaya baslar.
        // Javada esittir demek '==' bu sekildedir.
         /* Javada temekde iki tip data vardir
        1)primitive data type:
        char,boolean,byte,short,int,long,float,double

        2)non primitive data type:
        String
                */
        //byte,short,int,long ==> sayi degerli icin kullanilirlar
        //Primitive data typlari ilkel data typlari demektir.Sade yalin yapiya sahip olduklari icin oyle denir.
        //Non primitive datalar sinirsizdir.
        //String coklu harfler icin kullanilan bir data typtir
        //Stringlere deger verilirken her zaman cift tirnak icinde yazilmalidir
        //null 0 dmek degildir yokluk demektir
        //long icin L koyuyoruz
        /*(Access Modifiers)
        Dört tane erişim belirtkesi vardır: Ön-tanımlı, private, protected, public.*/





    }
}
