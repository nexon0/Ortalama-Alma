import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int Matematik, Turkce, Tarih, Kimya, Fizik, Müzik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunu Giriniz :");
        Matematik = inp.nextInt();
        System.out.print("Turkce Notunu Giriniz :");
        Turkce = inp.nextInt();
        System.out.print("Tarih Notunu Giriniz :");
        Tarih = inp.nextInt();
        System.out.print("Kimya Notunu Giriniz :");
        Kimya = inp.nextInt();
        System.out.print("Fizik Notunu Giriniz :");
        Fizik = inp.nextInt();
        System.out.print("Müzik Notunu Giriniz :");
        Müzik = inp.nextInt();

        int toplam = Matematik + Turkce + Tarih + Kimya + Fizik + Müzik;
        double ortalama = toplam / 6.0;
        System.out.println("Toplam Ortalamanız : " + ortalama);


    }
}