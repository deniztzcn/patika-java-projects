import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fizik , kimya, turkce, tarih, muzik;

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        double sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Ortalamanız: " + sonuc);

        String pass = (sonuc > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(pass);
    }
}