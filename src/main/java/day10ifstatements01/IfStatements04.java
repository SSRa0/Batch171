package day10ifstatements01;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
             /*
             Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        int yas = scan.nextInt();
        String evre = "";

        if (yas >= 0 && yas <= 4) {
            System.out.println("bebek");
        } else if (yas >= 5 && yas <= 12) {
            System.out.println("Cocuk");
        } else if (yas >= 13 && yas <= 20) {
            System.out.println("genc");
        } else if (yas >= 21 && yas <= 30) {
            System.out.println("yetiskin");
        } else if (yas > 30) {
            System.out.println("tamamlanmis");
        } else {
            System.out.println("Geçerli bir yaş giriniz.");
            System.exit(0);
        }

        /*
    Homework
    1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
    //ve kullaniciya uygun mesaj veren kodu yaziniz

    2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
    //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....

    3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
    //  1==> January, 2 ==> February .....

*/



    }
}
