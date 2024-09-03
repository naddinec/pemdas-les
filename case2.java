import java.util.Scanner;
public class case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== menghitung volume tabung ====");
        
        System.out.print("jari jari : ");
        int jari = input.nextInt();

        System.out.print("tinggi : ");
        int tinggi = input.nextInt();

        double phi = 3.14;

        double volume = phi*jari*jari*tinggi;
        double lp = 2*phi*jari*(jari+tinggi);

        System.out.printf("Volume tabung : %.2f %n ", volume);
        System.out.printf("luas permukaan tabung : %.2f %n ", lp);

    }
}
