import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        String nama;

        Scanner input = new Scanner(System.in);
        System.out.print("nama karyawan : ");
        nama = input.next();

        System.out.println("nama karyawan : " +nama);
    }
}
