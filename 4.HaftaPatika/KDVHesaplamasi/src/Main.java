import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvTutar,kdvliTutar;
        Scanner input=new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz :   ");
        tutar = input.nextDouble();

        if(tutar<=1000 && tutar>0) {
            double kdvOran =0.18 ;

            kdvTutar = tutar*kdvOran;
            kdvliTutar=tutar+kdvTutar;

            System.out.println("KDV'siz Tutar : "+ tutar);
            System.out.println("KDV' Oranı : "+ kdvOran);
            System.out.println("KDV Tutarı : "+ kdvTutar);
            System.out.println("KDV'li Tutarı : "+ kdvliTutar);}

        if(tutar>1000)
        {
            double kdvOran = 0.08 ;
            kdvTutar = tutar*kdvOran;
            kdvliTutar=tutar+kdvTutar;
            System.out.println("KDV'siz Tutar : "+ tutar);
            System.out.println("KDV' Oranı : "+ kdvOran);
            System.out.println("KDV Tutarı : "+ kdvTutar);
            System.out.println("KDV'li Tutarı : "+ kdvliTutar);
        }

    }
}


