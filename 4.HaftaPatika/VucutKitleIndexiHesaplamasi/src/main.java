import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double boy,kilo,index ;
        Scanner vucut = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = vucut.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = vucut.nextDouble();
        index = kilo / (boy * boy ) ;

        System.out.print("Vücut Kitle İndeksiniz : " + index);
    }
}
