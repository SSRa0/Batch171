package day03methodobjectcreationscanner;

public class Car {
    //Verable lar olusturulaim.
    public String model = "Tesla";
    public int fiyat = 20000;
    //Methodlari olusurularim
    //Note : "return type" void oldugunda method icinde "return" keywordu kullanilmaz.
    public void hareket(){
        System.out.println("Tesla cok hizli hareket eder...");
    }

    public void dur() {
        System.out.println("Cok guvenli bir sekilde durur");
    }
}


