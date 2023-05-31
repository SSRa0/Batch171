package day08stringmanipulationmemoryusageifstatements;

public class StringManipulation01 {
    public static void main(String[] args) {
        // Ornek 1  : Bir String i n hic character icermedigini (Bos string oldugunu) kontrol eden kodu yaziniz.
        String str = "atatatat";
        boolean result1 = str.length()== 0;
        System.out.println("String bos mu? " + result1);

        //2.yol tavsiye edilir
        //Java eger bir konuda method olustyrmussa o methodu kullanamak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("Is Empty ? " + result2);

        // Ornek 2: Bir string in space haric hicbir character icermedigini kontrol eden kodu yaziniz
        String t = " ";
        // 1.yol
        boolean result3 = t.replace("","").length()==0;
        System.out.println(result3);

        //2.yol
        boolean result4 = t.replace("","").length()==0;
        System.out.println(result4);

        System.out.println(result3);
        //3. yol
        boolean result5 = t.isBlank();
        System.out.println(result5);

        //isBlank() methodu sadece iceren Stringler icin true verir , space disinda bir character var ise false verir
        //isBlank() methodu bos stringler icin de true verir
        //isBlank() methodu space + hic birsey icin true verir
        //isEmpty() methodu sadece hicbirsey icin true verir


        //Ornek 3: Bir string a, i, e characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //"Java is easy to learn" ===>
        //  0123456789....index
        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idXI = r.indexOf('i');
        System.out.println(idXI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);

        System.out.println(idxA+idxE+idXI);

        //Ornek 4 : Bir string deki "Java " kelimesinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz
        // "Ah java sensin olmuyor java"
        //indexOf ("Java") kullaniminda siz "Java " kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini

        String u = "Ah java sensin olmuyor java";

        int idxJava =  u.indexOf("java");
        System.out.println(idxJava);//3

         int idxjava = u.indexOf("Java");
        System.out.println(idxjava);


        //Ornek 5 : Bir string de a , i, e characterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz
        String v = "Java is easy to learn";
        int idxOfa = v.lastIndexOf('a');

        int idXOfe = v.lastIndexOf('e');
        System.out.println(idXOfe);

        int idXOfi = v.lastIndexOf('i');
        System.out.println(idXOfi);


        System.out.println(idXOfe+idxOfa+idXOfi);

        //Note : lastIndexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 verir.


    }
}
