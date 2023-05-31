package day13loops;

public class Loops01 {
    public static void main(String[] args) {

        //Ornek 1: Ekrana 5 kere "Hi" yazdirin
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");

        /*
        Code standarts
        1) Tekrar (Repetition) olmamalidir
        2) Dynamic olmalidir
        3) Tamir (Fix) ve update kolay yapilabilmelidir
         */

        //2. Yol
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" lar kullanilir
        //Dort tane loop var, 1) for-loop 2) while-loop 3) do-while-loop 4) for-each-loop
        //1) for-loop
        /*
        for ( Baslangic degeri  ; Loop calisma sarti   ; Artirma/eksiltme   ){
            calisacak kodlar
        }*/
        // i++ =>  i=i+1 => i+=1
        //Baslangic degeri  ;       Loop calisma sarti   ;     Artirma/eksiltme

        for(int i=1         ;    i<6              ;             i++           ){
            System.out.println("Hi..!");

        }


        //Ornek 2 : 11 den 14 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for( int i =11   ; i<15  ;           i++  ){
            System.out.println(i);
        }

        //Ornek 3: 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz

        for( int i =40   ; i>22  ; i--  ){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //Ornek 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz
        for(int i=18 ; i<57 ; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }












    }
}








