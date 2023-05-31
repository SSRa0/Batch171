package day18multidimensionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {

        //Ornek : Iki boyutlu bir array i tek boyutlu bir array e cevriniz.
        int numbers[][] = {{5, 4}, {2, 3, 2}};//==> {5,4,2,3,2}

        //1. step : iki boyutlu arrayde kac tane eleman oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi=0;
        for( int [] w : numbers){
            toplamElemanSayisi= toplamElemanSayisi+ w.length;
        }
        System.out.println(toplamElemanSayisi);

        //2. step : Tek boyutlu arrayi iki boyutlu arrayin eleman sayisini kullanarak olusturmaliyiz
        int newArr [] = new int[toplamElemanSayisi];
        //3. step : iki boyutlu arraydeki elemanlari tek boyutlu array e transfer etmeliyiz.

        int idx=0;

        for(int [] w : numbers){//outer loop ile multidimensional arrayin int array olan elemanlarini tek tek aliriz

            for(int k :w){//inner loop ile w sepetine koymus oldugumuz arrayin elemanlarini tek tek aliriz
                newArr[idx]=k;//yeni olusturmus oldugumuz arraye index kullanarak atama yapiyoruz
                idx++;//bir eleman ekledikten sonra bir yana kaydirma yapiyoruz
            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2]
    }
}