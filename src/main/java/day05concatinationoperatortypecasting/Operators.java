package day05concatinationoperatortypecasting;

public class Operators {
    /*
    1) +,-,*,/ islemleri java da matematik kullanildigi gibi kullanilir.
    Note 1 : int / int ==> int olur
    Note 2 : double + int ==> double olur
    Cunku ; javada matematiksel islemlerde farkli data typlari kullanlirsa sonuc her zaman buyuk data type inda olur.


    2) Java da "Logical Operater" lar vardir . And ve Or islemleri "Logical Operator" lardir

       i)AND (&&) isleminde true alabilmek icin her sey true olmalidir.
      AND islemi "perfectionist" tir
      AND isleminde bir tane bile false sonucu false yapar.

      ii) OR (||) isleminde bir tane true sonucu true yapmaya yeter
      OR isleminde sonucun false olmasi icin herseyi false olmalidir
      OR islemi "polyanna" gibidir

      iii) Not oparator (!) true olani false , false olani true yapar
      !true => false
      !false => true
      !!true => true

      3) Comparsion (Karsilastirma) Operators
        < , > , <=, >= , == , !=
     NOTE = Karsilastirma operatorlerini kullandiginizda KESINLIKLE boolean (true veya false) alirsiniz.
     NOTE = biz (and) islemi icin && kullaniriz & kuillanimida vardir.
     Farklari nedir?
     "&&" kullanimda ilk ifade false oldugunda digerlerini kontrol etmez dolayisiyla
     hizli calisir. cunku && isleminde ilk ifade false ise digerlerinin bir onemi yoktur sonuc falsedur.
     "&" kullaniminda ilk ifade ne olursa olsun digerlerini kontrol eder dolayisi ile yavas calisir.
     Bis bu yuzden hep cift and && kullaniriz.
     */

    public static void main(String[] args) {
        boolean first = 3<5;
        boolean second = 2+3!=5;
        boolean third = 3*5>19;
        System.out.println(first + "-"+second + "-"+third);//true-false

        System.out.println(first && second);//false
        System.out.println(first || second || third);
    }
}
