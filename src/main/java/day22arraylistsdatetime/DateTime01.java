

package day22arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {
    public static void main(String[] args) {

        //Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();


        System.out.println(myCurrentDate);//2023-06-07

        //Tarih ten istedigimiz bileseni nasil aliriz?
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);//6

        int yearVaulue = myCurrentDate.getYear();
        System.out.println(yearVaulue);//2023

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//7


        //Month bir enum dir
        //Enum java da sabit degerler (Ay isimleri, Gun isimleri, Ulkedeki sehir isimleri) depolamak icin kullanilir
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);//JUNE

        //DayOfWeek bir enumdir
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//WEDNESDAY

        //ileriki tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(3));

        //Gecmis tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusYears(20).minusMonths(2).minusDays(5));

        //Specific bir tarih object i nasil olusturulur?
        LocalDate date1 = LocalDate.of(1990, 8, 10);
        LocalDate date2 = LocalDate.of(1980, 8, 10);


        //Bir tarihin bir tarih ten sonra olup olmadigi nasil kontorl edilir?
        boolean r1 = date1.isAfter(date2);
        System.out.println(r1);//true

        boolean r2 = date1.isBefore(date2);
        System.out.println(r2);//false

        boolean r3 = date1.isEqual(date2);
        System.out.println(r3);//false


    }
}
