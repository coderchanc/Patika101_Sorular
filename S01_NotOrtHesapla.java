package Patika_101;

import java.util.Scanner;

public class S01_NotOrtHesapla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
            Matematik, fizik, kimya, turkce, tarih, ve muzik derslerinin sinav puanlarini hesaplayin ve yazdirin
            if - else kullanmayin

         */

        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.println("matematik notunuzu giriniz :");
        matematik = scan.nextInt();

        System.out.println("fizik notunuzu giriniz :");
        fizik = scan.nextInt();

        System.out.println("kimya notunuzu giriniz :");
        kimya = scan.nextInt();

        System.out.println("turkce notunuzu giriniz :");
        turkce = scan.nextInt();

        System.out.println("tarih notunuzu giriniz :");
        tarih = scan.nextInt();

        System.out.println("muzik notunuzu giriniz :");
        muzik = scan.nextInt();

        int sum = (matematik + fizik + kimya + turkce + tarih + muzik);
        double result =  (double) sum / 6;

        System.out.println(result);
    }
}
