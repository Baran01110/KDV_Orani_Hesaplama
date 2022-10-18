import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi1;
        double KDV;

        System.out.print("Bir sayi giriniz ");
        Scanner girilen = new Scanner(System.in);



        sayi1 = girilen.nextInt();
        if (0<sayi1 && sayi1 <1000) {
             KDV=0.18;
        }
        else{
             KDV=0.08;
        }
        System.out.println("KDV'siz Fiyat " + sayi1);
            System.out.println("KDV'li Fiyat: " + (sayi1 + (sayi1 * KDV)));
        System.out.print("KDV tutarı: " + (sayi1*KDV));

    }
}