import java.util.Scanner;

public class pehitungbangun2d {
    static int HitungLuasPersegi(int sisi){
        int luaspersegi = sisi * sisi;
        return luaspersegi;
    }
    static int HitungLuasPersegiPanjang(int panjang, int lebar){
        int luaspersegipanjang = panjang * lebar;
        return luaspersegipanjang;
    }
    static double HitungLuasSegitiga(int alas, int tinggi){
        double luassegitiga = 0.5 * (alas * tinggi);
        return luassegitiga;
    }
    static double HitungLuasLingkaran(int diameter){
        double r = 0.5*diameter;
        double luaslingkaran = 0;
        if(r % 7 ==0){
            luaslingkaran = 22*(r*r/7);
        } else {
            luaslingkaran = 3.14 *r*r;
        }
        return luaslingkaran;
    }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Silahkan luas apa yang anda hitung!");
    System.out.println("A. Persegi");
    System.out.println("B. Persegi Panjang");
    System.out.println("C. Segitiga");
    System.out.println("D. Lingkaran");
    System.out.println();
    System.out.print("Masukkan pilihan anda : ");
    String choise = input.nextLine();
    System.out.println("=================================================");

    switch (choise.toLowerCase()) {
        case "a":
            System.out.println("Menghitung Luas Persegi");
            System.out.print("Masukkan Nilai Sisi : ");
            String sisi = input.nextLine();
            int s = Integer.parseInt(sisi);
            int luaspersegi = HitungLuasPersegi(s);
            System.out.println("Luas Persegi anda : " +luaspersegi);
            break;
        case "b":
            System.out.println("Menghitung Luas Persegi Panjang : ");
            System.out.print("Masukkan Nilai Panjang : ");
            String panjang = input.nextLine();
            System.out.print("Masukkan Nilai Lebar : ");
            String lebar = input.nextLine();
            int p = Integer.parseInt(panjang);
            int l = Integer.parseInt(lebar);
            int luaspersegipanjang = HitungLuasPersegiPanjang(p, l);
            System.out.println("Luas Persegi Panjang anda : " + luaspersegipanjang);
            break;
        case "c":
            System.out.println("Menghitung Luas Segitiga");
            System.out.print("Masukkan Nilai Alas : ");
            String alas = input.nextLine();
            System.out.println("Masukkan Nilai Tinggi : ");
            String tinggi = input.nextLine();
            int a = Integer.parseInt(alas);
            int t = Integer.parseInt(tinggi);
            double luassegitiga = HitungLuasSegitiga(a, t);
            System.out.println("Luas Segitiga anda : " +luassegitiga);
            break;
        case "d":
            System.out.println("Menghitung Luas Lingkaran");
            System.out.print("Masukkan Nilai Diameter : ");
            String diameter = input.nextLine();
            int d = Integer.parseInt(diameter);
            double luaslingkaran = HitungLuasLingkaran(d);
            System.out.println("Luas Lingkaran anda : " +luaslingkaran);
            break;
        default:
            System.out.println("WARNING : Pilihan anda tidak terdaftar");
    }
    System.out.println("=============================================");
}

}
