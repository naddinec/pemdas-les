import java.util.Scanner;
public class percabangan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama :");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai :");
        int nilai = input.nextInt();

        if (nilai >= 92) {
            System.out.println("Selamat " + nama + " anda lulus!");   
        } else {
            System.out.println("Maaf " + nama + " anda gagal.");
        }
    }
}
