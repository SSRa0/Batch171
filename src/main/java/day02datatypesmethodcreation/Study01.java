package day02datatypesmethodcreation;

public class Study01 {
    public static void main(String[] args) {


        System.out.println(rectangaleArea(9,4));

        System.out.println(perimeterRectangle((short) 1,58,1,58));

        System.out.println(perimeterRectangle2((byte) 12, (byte) 5));



            }







    public static long rectangaleArea (long a , long b){
        return a*b;


    }

    public static long perimeterRectangle (long a, long b ,long c ,long d){

        return a+b+c+d;
    }


    public static long perimeterRectangle2 (byte a,byte b){

        return (a+b)*2;

         // Access Modifier + Return Type  + method ismi + () + {} = method sistemi
        //Method name + parametreler ==> method signature = methodu cagirma sistemi


    }

}
