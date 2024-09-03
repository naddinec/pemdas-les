import java.util.Scanner;
public class case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==== menghitung luas persegi panjang ====");
        System.out.print("panjang :");
        int panjang = input.nextInt();

        System.out.print("lebar : ");
        int lebar = input.nextInt();

        int luas = panjang*lebar;

        System.out.println("luas persegi panjang : " +luas);

    }
}
