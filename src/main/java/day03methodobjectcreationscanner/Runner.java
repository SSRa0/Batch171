package day03methodobjectcreationscanner;

public class Runner {
    public static void main(String[] args) {
        //Object nasil olusturulur.
        //New keywordu sifirdan yeni bir obje olusturmak icin kullanilir
        //Constructrt java da objeleri olusturmak icin kullanilan pzel bir methodtur.
        //Class ismi  +  Object ismi  +  Assigment Operator  +  "new" keywordu  +  Constructor
            Car          myCar                 =                      new             Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);
        myCar.hareket();
        myCar.dur();

        Student aliCan =new Student();
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);
        System.out.println("aliCan.name = " + aliCan.name);
        aliCan.feed();
        aliCan.study();

        //homework
        //icinde isi ve yas veriable lari ile teach methodu bulunan bir teacher objecti olusuturun  ve kullanin
        //

    }
}
