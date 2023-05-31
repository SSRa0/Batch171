package day08stringmanipulationmemoryusageifstatements;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Ornek : Bir string in belirli bir karqakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz
        //    abc@gmail.com ===> gmail

        String a = "abc@hotmail.com";

        int startingIndex = a.indexOf('@');

        int endingndex = a.indexOf('.');

        String companyName = a.substring(startingIndex,endingndex);

        System.out.println("companyName = " + companyName);//companyName = gmail

        System.out.println("hard coding ===>"+a.substring(4,9));

        //Ornek 2 : Verlien iki strimgin birbirinin aynisi olup olmadigni kontrol eden kodu yaziniz
        String h = "Alican";
        String i = "alican";
        boolean result =  h.equals(i);
        System.out.println(result);//false

        //Java da memory kullanimi
        //Javada memory kullanimi 2 ye ayrilir
        //Dip note: Java da Memory kullanimi 2 tür memory vardir==> (Stack=>Small(Primitive datalar koyulur), Heap==>Huge(non-primitiveler datalar koyulur)

        /*
          1)Stack Memory ===> small
        a) kucuk memory dir
        b) Primitive leri ve Non Primitive adreslerini (referance) tutar
        ==> Java heap memory de yerlestirilen tum Non-primtive datalar icin bir adres olusturur
        bu adresi stack memory de saklar

         */


        /*

       Note: String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden kullaniriz?
        Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
        ikiside ayni ise stringler esittir de. ama biz code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duyudugumuz seydir

                 */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");
        System.out.println(s==t);//false cunku adresler ve degerller farkli
        System.out.println(s.equals(t));//false cunku degeler farkli
        System.out.println(s==r);//false
        System.out.println(s.equals(r));//true cunku equals () sadece degerlere bakar. "s" ve "r" nin degerleri ayni oldugunda

        //_______________________________________________________________________________________________________________________________________

        //Ornek 3 = Verilen iki stiring in birbirinin aynisi olup olamdigni buyuk harf kucuk harf dikkate almadan
        //kontrol eden kodu yaziniz
        //equalsIgnoreCase () iki string in birbirinin aynisi olup olmadigini buyuk kucuk harf dikkate alinmadan kontrol ediniz

        String j = "Alican";
        String k = "alican";

        boolean result3 = j.equalsIgnoreCase(k);
        System.out.println(result3);//true

        /*Homework
        //Bir String variable olusturunuz ve bu stringdeki rakam olmayan karakterlerin sayisini konsola yazdiriniz
        //Bir String variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri konsolda buyuk harfle yazdiriniz,
        //Bir String variable olusturunuz ve bu Stringdeki ilk ve son karakterlerin ascii degerlerini konsola yazdiriniz
        //Tek kelimeli bir sehir ismi icin bir variable olusturun ve sehir isminin ilk harfini Buyuk harf ile diger harflerini kucuk harflerle yazidrniz.
        //Asagidaki kurallara gore kullanicinin girinigi password u kontrol ediniz
        //a) en az 6 karakter olsun
        //b)en az bir tane buyuk harf icersin
        //c) en az bir tane kucuk harf olsun
        //d) en az bir tane rakam olsun

    Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
    Note 2: Tum sorulari dinamik kodlarla cozulmelidir
    Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz



         */


    }
}
