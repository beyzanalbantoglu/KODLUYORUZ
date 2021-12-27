import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,fiyat;
        Scanner manav = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armut = manav.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        elma = manav.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        domates = manav.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muz = manav.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = manav.nextDouble();

        fiyat = (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0);
        System.out.println("Toplam Tutar : " + fiyat +"TL");
    }
}
