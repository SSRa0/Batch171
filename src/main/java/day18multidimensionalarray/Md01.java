package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        // Bir Array in elemanlari Array ise bu Arrayler Multidimensional Array dir

        // Multidimensional Array nasil olusturulur.
        int a[][] = new int[3][2];

        //Multidimensional Array lere eleman nasil eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

        //Multidimensional Array nasil yazdirilir?
        System.out.println(Arrays.toString(a)); //[[I@511baa65, [I@340f438e, [I@30c7da1e]
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]
        //multidimensional arrayleri console a yazdirmak icin toString() methodu degil,
        // deepToString() methodunu kullaniriz

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir?
        System.out.println(a[1][1]);//45
        System.out.println(a[2][1]);//0

        //Multidimensional array icindeki bir array nasil yazdirilir?
        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(Arrays.toString(a[1]));//[81, 45]


        //Kisa yoldan Multidimensional array nasil olusturulur?
        String students [][] ={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

        //Ornek 1: Yukaridaki students arrayinde toplam kac isim oldugunu bulunuz.

        int sum=0;
        //{{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        for( String [] w : students ){
            sum = sum + w.length;
        }
        System.out.println(sum);//8
    }
}
