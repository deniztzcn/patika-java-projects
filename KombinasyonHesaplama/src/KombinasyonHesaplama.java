import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kombinasyon Formülü = C(n,r) = n! / (r! * (n-r)!)
        System.out.print("Eleman Sayısını (n) Giriniz : ");
        int n = input.nextInt();
        System.out.print("Seçim Sayısını (r) Giriniz : ");
        int r = input.nextInt();

        //n.Faktöriyel
        int nTotal = 1;
        for (int i = 1; i <= n; i++) {
            nTotal = nTotal * i;
        }
        //r.Faktöriyel
        int rTotal = 1;
        for (int k = 1; k <= r; k++) {
            rTotal = rTotal * k;
        }
        //(n-r).Faktöriyel
        int nrTotal = 1;
        for (int j = 1; j <= (n-r); j++) {
            nrTotal = nrTotal * j;
        }
        int comb = nTotal / (rTotal * nrTotal);

        System.out.println("C("+n+","+r+") : " + comb);
    }
}
