import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişken tanımları
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfı
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan verilerin alınıp değişkenlere aktarılması
        System.out.print("Matematik Notunuz : ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz  : ");
        muzik = inp.nextInt();

        //Ortalama alan değişkenin tanımlanıp ders notlarının ortalamasının aktarılması
        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;

        //Ortalamanın ekrana yazdırılması
        System.out.println("Ortalamanız : " + sonuc);

        //Ortalamanın 60'ı geçip geçmediğinin kontrolü ve sonucun ekrana bastırılması
        System.out.println(sonuc > 60.0 ? "Tebrikler sınıfı geçtiniz" : "Üzgünüm sınıfta kaldınız" );

    }
}