package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    Java da method nasil olusturulur?

    1)main method disinda classin icinde olusturulur

             1               2            3            4   5
    2) Access Modifier + Return Type  + method ismi + () + {}

     */

    /*

    Olusturulan methodlar nasil kullanilir ?
    1)Methodu olustumak methodu calistirmak icin yeterli degildir.Kullanilmak istenen method main methodun icinden kullanilir.

    2)Method un ismini + () yazin

    3)Varsa islem yapacaginiz datalari parantezin icine koyun bu islem mehol call(method cagirma) olarak adlandirilir.

    4)Method name + parametreler ==> method signature



     */
    public static void main(String[] args) {


      int sonuc =  toplamaYap(3 ,5);
        System.out.println(sonuc);




           long result = multiply(7,7);

           System.out.println(result);

           System.out.println(firstTwoMultiplyThirdAdd(2,5,9));



    }


        //Ornek 1 : toplama islemi yapan bir method olusturunuz.
        public static int  toplamaYap(int a,int b) {//bu kisimda method kapsaminda kullanilmasini ve istedigim datalari deklara ediyoruz

            return a + b;
            //return demek bu methodun cagrildigi yere return et demek
            //main method static oldugu icin main method icinde kullanacagimiz method static olmalidir.


            //Ornek 2: 2 sayiyi carpma islemi yapan mir method olustrunuz.

        }

    protected static long multiply(int a, int b){
        return a*b;
            }

            //Ornek 3 :

        private static int firstTwoMultiplyThirdAdd(int a, int b, int c){


        return a*b+c;
    }











}
