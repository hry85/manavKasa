import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armutFiyati=2.14,armutKilo;
        double elmaFiyati=3.67,elmaKilo;
        double domatesFiyati=1.11,domatesKilo;
        double muzFiyati=0.95,muzKilo;
        double patlicanFiyati=5.00,patlicanKilo;
        double toplam;

        Scanner input=new Scanner(System.in);

        System.out.print("Armut kac kilo : ");
        armutKilo=input.nextDouble();

        System.out.print("Elma kac kilo : ");
        elmaKilo=input.nextDouble();

        System.out.print("Domates kac kilo : ");
        domatesKilo=input.nextDouble();

        System.out.print("Muz kac kilo : ");
        muzKilo=input.nextDouble();

        System.out.print("Patlican kac kilo : ");
        patlicanKilo=input.nextDouble();

        toplam=(armutFiyati*armutKilo)+(elmaKilo*elmaFiyati)+(domatesKilo*domatesFiyati)+(muzKilo*muzFiyati)+(patlicanKilo*patlicanFiyati);
        System.out.println("Toplam tutar : " +toplam+ " TL");


    }
}
