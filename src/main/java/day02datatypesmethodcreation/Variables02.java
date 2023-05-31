package day02datatypesmethodcreation;

public class Variables02 {


        /*
        Javada temelde 2 tip data vardir
         1)primitive data type:
          char,boolean,byte,short,int,long,float,double

        2)non-primitive data type:

         */

        /*
        Note 1) primitive data typlarini java olusturmustur , biz olusturmayiz.
        Note 2) primitive data typlarinin isimlerinda sadece kucuk harf kullanilir.
        Note 3) primitive data lar data typlarina gore memory de farkli farkli yer kaplarlar.
        Note 4) primitve data lar iclerinde SADECE sizin atadiginiz degeri barindirirlar.
         */
        /*
        Non-primitive data types
        Ornek => String ....
        ==> Uretilen her bir class ayni zamanda bir non-primitive data type dir.
          * Bu yuzden non-primitive data typ lar sinirsiz sayidadir denilebilir.
          * None-primitve data typlarin isimleri buyuk harfle baslar.
          * None - primitiveler icin java memoryde buyuklugune gore degisen boyularda yer ayirir.
          *

         */


    public static void main(String[] args) {

        //Ornek: Ulke ismi icin bir variable olusuturun ve ekrana yazdirin.

        String ulkeIsmi = "Turkiye";
        System.out.println(ulkeIsmi);
        /*
        Interwiew sorusu : "primitive " ve "non primitve" data type lari arasindaki fark nedir?
        1)"primitive" ler sadece bizim atadigmiz degeri ve methodlari icerir
           "non-primitive" ler bizim atadigimiz degeri ve method lari icerir
        2)"primtive" ler kucuk harfle baslar ,"non-primitive"ler buyuk harfle baslar
        3)"non-primitve" leri java ve developelar uretebilir , sinirsiz sayidadir.
        4)"primitve" ler memory de data type larina gore sabit boyutta bellek kullanirlar.
        "non-primitive" ler icin java memory de buyuklugune gore degisen boyutlarda bellek kullanilabilir.
         */






    }
}
