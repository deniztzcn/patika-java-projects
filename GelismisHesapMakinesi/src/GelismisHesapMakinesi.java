import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void plus() {
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ +". sayı : ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Gireceksiniz : ");
        int amount = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= amount; i++) {
            System.out.print(i + ". sayı : ");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void multiple(){
        Scanner input = new Scanner(System.in);
        int number, result = 1, i = 1;
        while(true) {
            System.out.print(i++ + ". sayı : ");
            number = input.nextInt();

            if (number == 1)
                break;
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void divided(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int amount = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= amount; i++) {
            System.out.print(i + ". sayı : ");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değeri Giriniz : ");
        int base = input.nextInt();
        System.out.print("Üs Değeri Giriniz : ");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }
    static void factorial(){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Sonuç : " + result);
    }
    static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();
        System.out.print("Modu Giriniz : ");
        int mod = input.nextInt();
        int result = number % mod;

        System.out.println("Sonuç : " + result);
    }
    static void area(){
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenar Uzunluğu Giriniz : ");
        int kenar1 = input.nextInt();
        System.out.print("2. Kenar Uzunluğu Giriniz : ");
        int kenar2 = input.nextInt();

        System.out.println("Alan : " + (kenar1 * kenar2));
        System.out.println("Çevre : " + (2 * (kenar1 + kenar2)));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Faktöriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Diktörtgen Alan ve Çevre Hesabı\n" +
                "0-Çıkış Yap";

        System.out.println(menu);
        do {
            System.out.print("Lütfen Bir İşlem Seçiniz : ");
            select = input.nextInt();
            switch(select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiple();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    area();
                    break;
                case 0:
                    System.out.println("Güle Güle !");
                    break;
                default:
                    System.out.println("Yanlış bir sayı girdiniz, tekrar deneyiniz");
            }
        } while(select != 0);
    }
}
