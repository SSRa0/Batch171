package day21arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
        1)Ayni data typindaki coklu data lari depolamak icin Array kullaniriz
        2)Arraylerin bir negatif yonu var; icinde koyacaginiz eleman sayisini en basta belirtmek zorundasiniz
        3) Arrayler eleman sayisinda esnek degildirler.Bu yuzden java "Arraylist" adli yeni bir yapi olusturdu
       Bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar.
       4)ArrayList yerine sadece List de diyebiliriz
       5)Arraylist yerine sadece Liste de diyebiliriz
           a)Array ler super hizlidir
           b)Array ler memoryde cok az yer kaplar
           6)Arrayler primtive data type lari ve non primitive lerin reference larini depolayabilir
           ama Arraylistler "non-primtive" data tylarini depolar . bu yuzden arraylister arraylerden daha cok yer kaplar

         */
        //Arraylist nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        //Arraylist konsola nasil yazdirilir?
        System.out.println(ages);
        //Arraylistlere eleman nasil eklenir?
        //Arraylistlere eleman eklemek icin add() methodunu kullaniriz
        //add() methodu elemanlari sizin verdiginiz sirada list e ekler (Insertion order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);
        System.out.println(ages);

        //LIst e coklu eleman nasil eklenir?
        //Bir list e coklu eleman eklemek icin o elemanlari oncelikle bir listin icine koymalisiniz
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);

        ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages);//9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //Arraylistte eleman sayisi nasil bulunur ?
        //size () methodu bir listteki eleman sayisini verir.
        int numOfElement = ages.size();
        System.out.println(numOfElement);//12

        //ArrayListte specifik bir eleman nasil alinir?
        //get() methodu index kullanarak istedigimiz elamani almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);//656

        //Arraylist te spesific bir eleman nasil degistirilir ?
        ages.set(6,111);
        ages.set(4,313);
        //(Ey java git benim 6 indeximdeki datayi 111 cevir)
        System.out.println(ages);

        //Bir listeki tum elemanlari nasil silebililirim
        //ages.clear();
        //System.out.println(ages);//[]

        //ArrayListte specifik bir elemanin var olup olamdigini nasil anlariz
        boolean r = ages.contains(656);
        System.out.println(r);//true

        //Bir Arraylist in bos olup olamdigini nasil kontrol edebiliriz.
        //isEmpty methodu Arraylist bos ise true bos degil ise false return verir.
        boolean r2 = ages.isEmpty();
        System.out.println(r2);

        //Ornek 1: Size verilen bir listin bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String> names = new ArrayList<>();
        names.add("Gulce");
        names.add("Seda");
        names.add("Benna");
        names.add("Rıdvan");
        names.add("Enes");


        //1 . way
        if(names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }

        names.clear();

        //2. yol Recommended

        if(names.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }



        /*
        Bir method u ogrenirken asagidaki 3 seyi ogrenin
        1) o method ne is yapar?
        2) o method nasil kullanilir?
        3) o method size neyi verir?
         */


    }
}
