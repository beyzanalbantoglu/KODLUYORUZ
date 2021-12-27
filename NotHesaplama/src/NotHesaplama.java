import java.util.Scanner;
public class NotHesaplama {
    public static void main(String[] args) {
            //Değişkenleri tanımladık.
            int mat,kimya,fizik,turkce,tarih,muzik;
            //Scanner sınıfımızı tanımladık.
            Scanner inp= new Scanner(System.in);

            System.out.print("Matematik notunuz: ");
            mat=inp.nextInt();

            System.out.print("Fizik notunuz: ");
            fizik=inp.nextInt();

            System.out.print("Kimya notunuz: ");
            kimya=inp.nextInt();

            System.out.print("Türkçe notunuz: ");
            turkce=inp.nextInt();

            System.out.print("Tarih notunuz: ");
            tarih=inp.nextInt();

            System.out.print("Müzik notunuz: ");
            muzik=inp.nextInt();

            int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
            double sonuc=toplam/6;

            System.out.println("Ortalamanız:" +sonuc);
            String gecti=sonuc>60 ? "Gecti" : "Kaldi";
            System.out.println(gecti);

            }
        }

