import java.util.Scanner;
public class percabangan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai belanja : ");
        int belanja = input.nextInt();
        
        if (belanja > 100000) {
            System.out.println("Selamat, anda mendapatkan hadiah!"); 
        }
        System.out.println("Terima Kasih...");
    }
}
