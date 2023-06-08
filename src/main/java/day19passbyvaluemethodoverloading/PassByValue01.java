package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {

        // Note:Java "pass by value" sayesinde variable larin orjinal degerini korur

        int shirtPrice=100;
        //Java methoda gonderirken orjinal degeri degil kopyasinin gonderir ve degisen deger kopya deger olır
        System.out.println(discount("student", shirtPrice));//90
        //normalde indirim yaptik discount methodu ile ama buradaki deger hala orjinal

        System.out.println(shirtPrice);//100





    }
    //Discount Methodunu olusturalim

    public static int discount(String type, int price){
        switch (type){
            case "student" :
                price=price-10;
                break;
            case "veteran" :
                price=price-20;
                break;
            case "senior" :
                price=price-5;
                break;
            default:
                price = price;

        }
        return price;

    }





}