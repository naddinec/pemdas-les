import java.util.Scanner;
public class case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umur;
        System.out.print("Umur : ");
        umur = input.nextInt();
        if (umur >= 18) {
            System.out.print("Sudah bekerja (ya/tidak) : ");
            String bekerja = input.next();
            if (bekerja.equalsIgnoreCase("ya")) {
                System.out.print("Masukkan pendapatan perbulan : ");
                int pendapatan = input.nextInt();
                System.out.print("Jumlah tanggungan : ");
                int tanggungan = input.nextInt();
                int biaya = pendapatan / tanggungan;
                if (biaya < 300000) {
                    System.out.println("Penduduk Miskin");
                } else {
                    System.out.println("Bukan penduduk miskin");
                }
            } else {
                System.out.println("Penduduk Miskin");
            }
        } else {
            System.out.print("Masih sekolah (ya/tidak) : ");
            String sekolah = input.next();
            if (sekolah.equalsIgnoreCase("ya")) {
                System.out.println("Bukan penduduk miskin");
            } else {
                System.out.println("Penduduk Miskin");
            }
        }
    }
}
