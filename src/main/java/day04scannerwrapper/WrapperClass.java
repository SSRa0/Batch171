package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive     : char      - boolean - byte - short - int   - long - float -double
        //Wrapper Class : Character - Boolean - Byte - Short -Integer- Long - Float -Double

        //Wrapper class lar non-primitive dir. o yuzden memory de cok yer kaplarlar
        //dolayisiyla sart degilse Wrapper Class kullanmayi tercih etmeyiz
        //n yazip nokta koyarsaniz hic method goremezsiniz cunku primitive ler method icermez
        int n = 12;

        // m yazip nokta koyarsaniz bir cok method gorebilirsiniz cunku wrapper classlar method icerir
        Integer m = 12;

        byte p = 33;
        Byte r = 44;
        //Ornek : short data type inin minimum ve maximum degerlerini kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);//maxShort = 32767

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);//minShort = -32768

        //Ornek 2 : int data type nin minimum degeri ile byte data type inin maximum degerleri toplamini bulunuz.
        int a = Integer.MIN_VALUE;
        Byte b = Byte.MAX_VALUE;
        System.out.println("a+b = " + (a + b));

        //Ornek 3 :Primitive int i Wrapper Integer a ceviriniz.
        int num = 19;
        Integer wrapperNum = num;
        //Ornek 4 : Wrapper Byte i primitve byte a ceviriniz.(Unboxing)
        Byte k = 19;
        byte primitveK = k;

        //Ornek 5 : Primitive char i Wrapper Character e ceviriniz
        char harf = 'B';
        Character wrapperHarf = harf;
        //Ornek 6: Wrapper Bollean i primitve bollean a ceviriniz.
        Boolean isOldWrapper =true;
        boolean isOld = isOldWrapper;

    }
}
