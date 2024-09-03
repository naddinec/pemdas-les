import java.util.Scanner;

public class perulanganbersarang2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = input.nextInt();       
        for (int y=batas; y>=1; y--){
            for (int x=1; x<=y; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
