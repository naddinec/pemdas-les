import java.util.Scanner;
public class piramidaterbalik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = input.nextInt();

        for (int i=1; i<=batas; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=batas-i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
