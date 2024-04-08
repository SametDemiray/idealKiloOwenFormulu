package org.example;

import java.util.Scanner;

// Bu program, Owen formülünü kullanarak bir kişinin BMR'sini hesaplar. Daha sonra, bu BMR değerini günlük kalori ihtiyacına
// dönüştürerek ideal kilo tahmini yapar. Bu hesaplama, bir kişinin kilo kontrolü için ne kadar kalori alması gerektiğini
// tahmin etmek için bir yaklaşım sağlar.
// Lütfen unutmayalım ! Bu ve diğer hesaplamar kesin sonuç olmamakla birlikte kişiye göre değişkenlik gösterebilir.

public class Main {
    public static void main(String[] args) {

        double kilo;
        double boy;
        double idealKilo;
        int yas;
        String cinsiyet;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Owen Formülü ile İdeal Kilo Hesaplama Programına Hoş Geldiniz!");
        System.out.println("Lütfen kilonuzu girin (kg): ");
        kilo = scanner.nextDouble();

        System.out.println("Lütfen boyunuzu girin (cm): ");
        boy = scanner.nextDouble();

        System.out.println("Lütfen yaşınızı girin: ");
        yas = scanner.nextInt();

        System.out.println("Lütfen cinsiyetinizi girin (erkek/kadın): ");
        cinsiyet = scanner.next().toLowerCase();

        idealKilo = hesaplaBMR(kilo, boy, yas, cinsiyet);

        // Owen formülü ile BMR hesaplandıktan sonra, ideal kilo tahmini yapmak için
        // belirli bir aktivite seviyesine göre günlük kalori ihtiyacı belirlenebilir.
        // Bu günlük kalori ihtiyacı, ideal kilo tahmini için temel bir veri olarak kullanılabilir.

        System.out.println("Owen formülüne göre ideal kilo: " + idealKilo + " kg");

        scanner.close();
    }
    public static double hesaplaBMR(double kilo, double boy, int yas, String cinsiyet){

        double bmr;
        double sabit;

        sabit = (cinsiyet.equals("kadın")) ? 1 : 0;
        bmr = (0.3*kilo) + (0.3*boy) + (0.3*yas) + sabit;
        return bmr;

    }
}