import java.util.Scanner;

public class pembelianmotor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] data = {
            {"Honda", "Beat", "15000000"},
            {"Yamaha", "Nmax", "25000000"},
            {"Suzuki", "GSX-R150", "280000"};
        System.out.println("TOKO MOTOR JAYA");
        System.out.println("==================================");

        System.out.println("Daftar Motor :");
        for (int i=0; i < data.length; i++){
            System.out.println((i+1)+ ". " +data[i][0]+ " " +data[i][1]+ " - Rp " +data[i][2]);
        }
        System.out.println();

        System.out.print("Masukkan nomor motor yang ingin dibeli : ");
        int nomor = input.nextInt() -1;
        while (nomor < 0 || nomor >= data.length) {
            System.out.print("Nomor motor tidak valid, silahkan masukkan nomor motor yang valid : ");
            nomor = input.nextInt() -1;
        }
        System.out.print("Masukkan jumlah motor yang ingin dibeli : ");
        int jumlah = input.nextInt();

        int harga = Integer.parseInt(data[nomor][2]);
        int total = harga*jumlah;

        System.out.println();
        System.out.println("\nDetail pembelian");
        System.out.println("-----------------------------");
        System.out.println("Merk : " + data[nomor][0]);
        System.out.println("Model : "+ data[nomor][1]);
        System.out.println("Harga : " + data[nomor][2]);
        System.out.println("Jumlah : " +jumlah);
        System.out.println("Total : " +total);
        System.out.println("-------------------------------");

        System.out.println("\nMetode Pembayaran :");
        System.out.println("1. Pembayaran Tunai");
        System.out.println("2. Pembayaran Rekening");
        System.out.print("Masukkan pilihan : ");
        int pilihan = input.nextInt();
        if (pilihan == 1) {
            System.out.println("\nTerimakasih telah berbelanja di TOKO MOTOR JAYA");
            System.out.println("========================================================");
        } else if (pilihan == 2) {
            System.out.print("\nMasukkan nomor rekening Anda : ");
            String rekening = input.next();
            System.out.println("Terimakasih telah melakukan pembayaran melalui rekening " +rekening);
            System.out.println("========================================================");
        } else {
            System.out.println("PILIHAN TIDAK TERSEDIA");
        }
    
}
