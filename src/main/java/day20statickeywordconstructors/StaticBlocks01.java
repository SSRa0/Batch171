package day20statickeywordconstructors;

public class StaticBlocks01 {

    //Bir variable olusturdugunuzda, deger atamatsaniz o variable i "initialize" etmediniz demektir.
    static double pi;
    static  String shape;

    //Note : static blocklar static variabllari initialize etmek icin kullanilirlar
// ve class icinde herseyden once calistirilirlar
// birden fazla static block oldugunda static blocklar yukaridan asagiya dogru yani yukarida olan once calisir
    static {
        shape="Circle";
        System.out.println("Static block 2");
    }

    static {
        pi = 3.14;
        System.out.println("Static block 1");
    }


    public static void main(String[] args) {
        /*
        Bazen main method dan calistirilmadan once variable larin hazir hale getirilmesi gerekir.
        bu nedenle static block lara ihtiyac duyabiliriz

        static varible lar static block lar icinde initialize edilirse o class in icinde herseyden once hazir
        hale getirilmis olur.
         */
        System.out.println(pi);
        System.out.println("main method");


    }


}