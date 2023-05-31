package day05concatinationoperatortypecasting;

public class TypeCasting {
    public static void main(String[] args) {
        /*

        Numeric primitive data type larinin birbirine donusturulmesine "Type Casting" denilir.
        Numeric (Sayisal) primitive Data typ lar : byte - short - int - long - float - double
         */
        //Note 1 : kucuk data type larina buyuk data typelarina cevirmeyi java otomatik olarak yapabilir.

        //Notw 2 : Buyuk data typlarini kucuk data type larina cevirmek riskli bir istir , java bu riskli
        //isi otomatik olarak yapmaz , bu islemi kod yazanlar yaparlar
        //Bu isleme "ExplicitNarrowing"(Aciktann Daraltma) denir


        //byte data type ini int data type ina ceviriniz
        byte age = 13;
        int ageInt = age;//AutoWidening
        //int data type ini short data typeina ceviriniz.
        int weight = 313;
        short weightShort = (short)weight;//Explicit Narrowing

        //int data type ini float data typina ceviriniz
        int population = 77000;
        float populationFloat = population;


        //double data type ini short data type ina ceviriniz
        double number = 12.99;
        System.out.println(number);

        short numberShort = (short) number ;
        System.out.println(numberShort);//12

        //ornek
        short num = 260;
        System.out.println(num);//260
        byte numByte = (byte) num;
        System.out.println(numByte);//4

        //Not
        //Donusum yaptiginiz sayi (260),  donuseceginiz data tyepini inin disinda ise
        //java kullandiginiz sayi ile "mod " islemi yapar ve mod isleminin sonucu sizin degeriniz olur


        //int data type ini float data  type ina ceviriniz

        int h = 782;//782
        float inth = h;//782.0

        System.out.println(inth);

        //double data type ini short data type ina cevirniz

        double type = 13.7;
        short typeshort = (short) type;
        System.out.println(typeshort);


        short nus = 260;
        System.out.println(nus);//260

        byte nusByte = (byte) nus;
        System.out.println(nusByte);//4

        //Not
        //Donusum yaptigimiz sayi(260) donuseceginiz data type inin sinirlari disinda ise java kullandiginiz sayi ile mod islemi yapar ve mod islemi
        //sonucu sizin yeni degeriniz olur


    }
}
