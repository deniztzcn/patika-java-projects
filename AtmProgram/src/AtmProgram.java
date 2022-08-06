import java.util.Scanner;

public class AtmProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3, balance = 1500, select, add, withdraw;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if(userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, X Bankasına Hoş Geldiniz.");
                do {
                    System.out.println("" +
                            "1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap\n");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak İstediğiniz Tutar : ");
                            add = input.nextInt();
                            balance += add;
                            break;
                        case 2:
                            System.out.print("Çekmek İstediğiniz Tutar : ");
                            withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= withdraw;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                    }
                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere !");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Hatalı Kullanıcı Adı veya Parola. Tekrar Deneyiniz.");
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
