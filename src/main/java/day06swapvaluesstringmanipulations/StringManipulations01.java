package day06swapvaluesstringmanipulations;

import java.util.Locale;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non-primitive data type dir ve ayni zamanda bir classdir.
        String s = "Java is easy";

        //Ornek1 : "s" Stringindeki tum characcterleri buyuk harf yapiniz
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY


        //Ornek2 : "s" Stringindeki tum characterleri kucuk harf yapiniz.
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Ornek3 = "s" Stringindeki ilk characteri aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Ornek4 : "s" stringindeki bastan ikinci ve sondan ikinci characteleri aliniz
        char firstCh = s.charAt(1);
        char secondCh = s.charAt(10);
        System.out.println(firstCh);
        System.out.println(secondCh);
        System.out.println("" +secondCh+firstCh);

        //Ornek5 : "s" string inde kullanilan character sayisini bulunuz.
        int sLengt = s.length();
        System.out.println(sLengt);

        //Ornek6 : "s" Stringin deki ilk 4 chacracteri aliniz.
        // s.substring ==> bu kullanimda ilk idex dahildir, ikinci imdex harictir.
        String sub1 = s.substring(0,4);
        System.out.println(sub1);//java

        //Ornek7 :"s" Stringindeki "is" kelimesini aliniz
        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        //Ornek8 :"s" Stringindeki easy kelimesini aliniz
        String sub3 =s.substring(8,12);
        System.out.println(sub3);//easy

        //ikinci yol
        s.substring(8);

        //Ornek 9: "s" Stringindeki "money" kelimesinin var olup olmadigini kontrol ediniz.
        boolean isExist =  s.contains("money");
        System.out.println(isExist);

        //Ornek 9: "s" Stringinin belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Ornek 11: "s" Stringinin 5. index dahil olmak uzere bu indexten itibaren "i" karakteri ile baslayip baslamadigni
        //kontrol eder
       boolean isBegin =  s.startsWith("i",5);
       boolean isBegin2 = s.startsWith("v",2);



    }
}
