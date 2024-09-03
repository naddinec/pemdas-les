import java.util.Scanner;
public class angkaprima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = input.nextInt();
        boolean angka = true;
        if (n==0 || n==1){
            angka = false;
        } else {
            for (int i=2; i<=n/2; i++){
                if (n%i==0){
                    angka = false;
                    break;
                }
            }
        } 
        if (angka){
            System.out.print(n +" adalah angka prima");
        }
        else {
            System.out.print(n + " bukan angka prima");
        }
    }
}
