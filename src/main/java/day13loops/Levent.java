package day13loops;

import java.util.Scanner;

public class Levent {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir isim girin: ");
            String isim = scanner.nextLine();

            if (isim.equalsIgnoreCase("Levent")) {
                System.out.println("adamin dibi levent kral furkan baba ");
            } else {
                System.out.println("Başka bir isim girdiniz.");
            }
        }
    }
}



