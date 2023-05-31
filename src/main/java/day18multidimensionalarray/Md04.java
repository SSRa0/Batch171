package day18multidimensionalarray;

import com.sun.security.jgss.GSSUtil;

public class Md04 {
    public static void main(String[] args) {
        //Ornek: Bir integer multi dimensional arraydeki en kucuk ve en buyuk elemanlarin toplamini bulunuz
        int ages[][] = {{15, 4}, {12, 43, 21}}; // ==> 4 + 43 ==>47
        int small = ages[0][0];
        int big = ages[0][0];

        //{{15, 4}, {12, 43, 21}}
        for (int[] w : ages) {
            for (int k : w) {
                small = Math.min(small, k);
                big = Math.max(big,k);
            }
        }
        System.out.println(small + big);//47

    }

}
