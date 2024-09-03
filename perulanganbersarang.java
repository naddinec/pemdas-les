import java.util.Scanner;
public class perulanganbersarang {
    public static void main(String[] args) {
        int k=0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = input.nextInt();
        for (int y=1; y<=batas; y++) {
            for (int x=1; x<=y; x++) {
                k++;
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
