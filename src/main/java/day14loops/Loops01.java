package day14loops;

public class Loops01 {
    public static void main(String[] args) {
        // Verilen bir string i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        //1. yol
        String t = "Java";
        String ters = "";

        for (int i = t.length() - 1; i >= 0; i--) {
            ters = ters + t.substring(i, i + 1);
        }
        System.out.println(ters);


        //2 . yol
        String u = "Java";
        String ters2 = "";
        for (int i = u.length() - 1; i >= 0; i--) {
            ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters2);

        //ornek 2: size verilen bir string in "Palindrome" olup olmadigini kontrol eden kodu yaziniz
        //  nalan, ey edip adanada pide ye, 404
        //Logic : String i ters cevir sonrada duz hali ile ters halini karsilastir, ayni ise "Palindrome"

        String duz = "Nalan";
        String ters3 = "";

        for (int i = duz.length() - 1; i >= 0; i--) {
            ters3= ters3+duz.substring(i,i+1);
        }

        if(duz.equalsIgnoreCase(ters3)){
            System.out.println(duz+" : Palindrome dur");
        }else{
            System.out.println(duz+" : Palindrome degildir");
        }

    }
}

