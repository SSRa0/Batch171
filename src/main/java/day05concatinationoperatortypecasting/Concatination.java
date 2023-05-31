package day05concatinationoperatortypecasting;

public class Concatination {
    public static void main(String[] args) {


        //Ornek 1 : Bir string ve iki int variable olusturun . String degeri ile int lerin toplamini console a yazdiriniz
        String s ="elma";
        int a  = 10;
        int b  = 11;
        System.out.println(s + a + b);//elma1011
        System.out.println(s + (a + b));//elma21
        System.out.println(s + a * b);//elma110
        System.out.println(a + b + s );//21elma
        System.out.println(a + s + b);//10elma11
        // Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        // Java da "+" sembolu iki string arasinda veya string ve bir sayi arasinda kullanlirsa cocatination islemi olur
        //concatination islemi birlestime yapar
        //Note concatination islemlerinde java matematikte ki islem onceligi kurallarina kullanir
        /*
      //1)Uslu sayilar
      //2)Parantez ici
      //3)Carpma bolme
      //4)Toplama cikarma
      //5)ayni oncelikli olanlarda soldan saga baslanir
         */

        //Ornek 2 : Size string olarak verilen iki fiyatin toplamini ekrana yazidiriniz
        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);//23005200


        //Integer.valuOf() string degerleri integer a cevirir
         int toplamFiyat  =  Integer.valueOf(shirt) + Integer.valueOf(shoes);
         System.out.println(toplamFiyat);//7500

        //Ornek 3 : Size string olarak verilen iki fiyatin toplamini ekrana yazdiriniz.
        String tv = "$1100";
        String radio = "$300";
        System.out.println(tv + radio);//$1100$300


        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);
        //Not : valueOf() methodu tum karakterleri rakam olan Strinleri sayilara cevirir.
        //Eger valueOf() methodu kullanilirken Stringin icine rakam olmayan bir karakter koyarsaniz hata alirsiniz
        //Bu tarz hatalari duzeltmeye ilerleyen derslerimizide ogrenecegiz.
        //valueOf () methodu kullanilirken sadece rakam olan karakterler kullanilir.

        String ipad = "1100";
        String telephone = "300";
        System.out.println(tv + radio);//$1100$300


        int totalPriceCash = Integer.valueOf(ipad) + Integer.valueOf(telephone);
        System.out.println(totalPrice);


    }
}
