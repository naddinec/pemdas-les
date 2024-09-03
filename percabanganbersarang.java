import java.util.Scanner;
public class percabanganbersarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int belanjaan, bayar, diskon;
        String kartu = "ya";

        belanjaan = input.nextInt();

        if (kartu == "ya") {
            if (belanjaan > 5000) {
                diskon = 500;
            } else if (belanjaan >= 1000 ) {
                diskon = 150;
            } else {
                diskon = 0;
            }
        } else {
            if (belanjaan > 1000) {
                diskon = 50;
            } else {
                diskon = 0;
            }
        }
        bayar = belanjaan - diskon;
        System.out.println("Total Bayar: Rp." +bayar);
    }
}
