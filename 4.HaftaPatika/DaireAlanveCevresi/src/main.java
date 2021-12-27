import java.util.Scanner;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);


        System.out.print ("Yarıçapı giriniz:");
        r = inp.nextInt();
        System.out.print ("Merkez ölçüsünü giriniz:");
        a = inp.nextInt();
        double alan=(pi*r*r*a)/360;


        System.out.println("Dairenin Alanı =" + alan);

    }
}
