package day09ifstatements;

public class IfStatements01 {
    public static void main(String[] args) {

        //Ornek : Sayi uc basamkli ise ekrana "Sayi uc basamklidir " yazdirini

        int number = 123;

        number = Math.abs(number);

        if (number>-1000 && number<-99) {
            System.out.println("Sayi uc basamklidir ");
        }


        if (number>99 && number<1000) {
            System.out.println("Sayi uc basamklidir");
        }

        //Ornek 2 : Bir stringdeki tekrarsiz characterleri ekrana yazdirniz
        // abbccdc ==> ad
        String str = "aac";

        char ch1 = str.charAt(0);

        if (str.indexOf(ch1)==str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = str.charAt(1);

        if (str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = str.charAt(2);

        if (str.indexOf(ch3)==str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }
    }//main
}//class
/*

  ********  Math Sınıfı  *******


  ceil:    Tek parametre alır(double) ve bir büyük tam sayıya yuvarlama yapar.
          Math.ceil(2.6) => 3.0

  cos: Tek parametre alır(double) ve cos değerini döner.
          Math.cos(30)

 sin:  Tek parametre alır(double) ve sin değerini döner.
          Math.sin(30)

 floor:    Tek parametre alır(double) ve bir küçük tam sayıya yuvarlar.
          Math.floor(2.6) => 2.0

 max:  İki parametre alır ve parametrelerden büyük olan sayıyı geri döner.
         Math.max(2.5,9) =>9

 min:  İki parametre alır ve parametrelerden küçük olan sayıyı geri döner.
         Math.min(2.5,9) => 2.5

 pow:  İki parametre alır ve ikinci parametreyi birincinin üstü olarak kullanır.
         Math.pow(3,5) => 3^5 anlamına gelir => 243.0

random: Parametre almaz ve 0 ile 1 arasında double bir değer döner
        Math.random()

round: Tek parametre alır(float) ve yakın olan tam sayıya döner.
        Math.round(2.4) => 2
       Math.round(2.6) => 3

   */
