import java.sql.SQLOutput;
import java.util.Scanner;

public class kitleendeksi {
    public static void main(String[] args) {
      double kilo, boy, VKE;
      Scanner tal= new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz:" );
        kilo= tal.nextDouble();

        System.out.println("Lütfen boyunuzu (metre türünden) giriniz:");
        boy= tal.nextDouble();

        //  VÜCUT KİTLE ENDEKSİNİ(VKE) BULAN FORMÜL
        VKE = kilo /(boy * boy);


        System.out.println("Vücut kitle endeksiniz:"+ VKE);






    }
}
