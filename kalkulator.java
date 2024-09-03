import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Sisa Bagi");
        System.out.println("-----------------------------------------");

        System.out.print("Masukkan angka pertama : ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan operasi : ");
        int operasi = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int angka2 = input.nextInt();
        int angka3;

        switch (operasi) {
            case 1:
                angka3 = angka1+angka2;
                System.out.println("Hasil : " +angka3);
                break;
            case 2:
                angka3 = angka1-angka2;
                System.out.println("Hasil : " +angka3);
                break;
            case 3:
                angka3 = angka1/angka2;
                System.out.println("Hasil : " +angka3);
                break;
            case 4:
                angka3 = angka1*angka2;
                System.out.println("Hasil : " +angka3);
                break;
            case 5:
                angka3 = angka1%angka2;
                System.out.println("Hasil : " +angka3);
                break;
            default:
                System.out.println("Pilihan operasi tidak tersedia");
                break;
        }
    }
}
