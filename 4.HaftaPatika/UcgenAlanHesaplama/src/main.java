import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a,b,c;
        double u,alan;
        Scanner girdi=new Scanner(System.in);
        System.out.println("1.kenarı giriniz");
        a=girdi.nextInt();
        System.out.println("2. Kenarı Giriniz : ");
        b= girdi.nextInt();
        System.out.println("3. Kenarı Giriniz : ");
        c = girdi.nextInt();

        u=(a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin alanı : " +alan);


    }
}
