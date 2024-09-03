import java.util.Scanner;
public class datakaryawan {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== Pendataan Karyawan PT. CreativeMedia ====");
        System.out.print("Masukkan data karyawan : ");
        String nama = input.nextLine();

        System.out.print("alamat : ");
        String alamat = input.nextLine();

        System.out.print("usia : ");
        int usia = input.nextInt();

        System.out.print("gaji : ");
        double gaji = input.nextDouble();

        System.out.println("==== Data karyawan ====");
        System.out.println("nama : " +nama);
        System.out.println("alamat : " +alamat);
        System.out.println("usia : " +usia);
        System.out.println("gaji : " +gaji);

    }
}
