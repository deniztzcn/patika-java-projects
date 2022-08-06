import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik, dersSayisi = 0, matNot = 0, fizikNot = 0, kimyaNot = 0, turkceNot = 0,muzikNot = 0;

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        if((mat >= 0)  && (mat <= 100)) {
            dersSayisi++;
            matNot = mat;
        }

        System.out.print("Fiziik Notunuz : ");
        fizik = input.nextInt();
        if((fizik >= 0)  && (fizik <= 100)) {
            dersSayisi++;
            fizikNot = fizik;
        }

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        if((turkce >= 0)  && (turkce <= 100)) {
            dersSayisi++;
            turkceNot = turkce;
        }

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        if((kimya >= 0)  && (kimya <= 100)) {
            dersSayisi++;
            kimyaNot = kimya;
        }

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();
        if((muzik >= 0)  && (muzik <= 100)) {
            dersSayisi++;
            muzikNot = muzik;
        }


        double average = (1.0 * (matNot + fizikNot + kimyaNot + turkceNot + muzikNot) / dersSayisi);

        if (average < 55) {
            System.out.println("Sınıfta Kaldınız.");
            System.out.println("Ortalamanız : " + average);
        } else {
            System.out.println("Tebrikler Sınıfı Geçtiniz.");
            System.out.println("Ortalamanız : " + average);
        }
    }
}