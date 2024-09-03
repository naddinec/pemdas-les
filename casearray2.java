import java.util.Scanner;

public class casearray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //menghitung rata rata
        System.out.print("Masukkan panjang array : ");
        int batas1 = input.nextInt();
        int[] angka1 = new int[batas1];
        double total1 = 0;

        for (int i=0; i<angka1.length; i++){
            System.out.print("Angka ke-" + (i+1) + " : ");
            angka1[i] = input.nextInt();
            total1 = total1 + angka1[i];
        }
        double ratarata = (total1/batas1);
        System.out.print("Total rata-rata dari " + batas1 + " angka tersebut adalah : " + ratarata);
        System.out.println();
    }
}
