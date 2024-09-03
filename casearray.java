import java.util.Scanner;
public class casearray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //penjumlahan array
        System.out.print("Masukkan panjang array : ");
        int batas = input.nextInt();
        int[] angka = new int[batas];
        int total = 0;

        for (int i=0; i<angka.length; i++){
            System.out.print("Angka ke-" + (i+1) + " : ");
            angka[i] = input.nextInt();
            total = total + angka[i];
        }
        System.out.print("Total penjumlahan dari " + batas + " angka tersebut adalah : " + total);
        System.out.println();

        //angka yang ingin dicari dari array
        System.out.print("Masukkan  julah element array : ");
        int ar = input.nextInt();
        int[] ang = new int[ar];
        int j;
        for (j=0; j<ang.length; j++){
            System.out.println("Input " + (j+1) + " angka (dipisah dengan enter) : ");
            ang[j] = input.nextInt();
        }
        System.out.print("Angka yang ingin dicari : ");
        int num = input.nextInt();
        for (j=0; j<ang.length; j++){
            if (ang[j]==num){
                System.out.print("Angka yang ditemukan pada index ke-" +j);
                break;
            }
        }
        if (j==ar){
            System.out.print("Angka tidak ditemukkan");
        }
        System.out.println();

        //angka terbesar dari array
        System.out.print("Masukkan  julah element array : ");
        int ar1 = input.nextInt();
        int[] ang1 = new int[ar1];
        int k, max;
        for (k=0; k<ang1.length; k++){
            System.out.println("Input " + (k+1) + " angka (dipisah dengan enter) : ");
            ang1[j] = input.nextInt();
        }
        max = ang1[0];
        for (k=0; k<ang1.length; k++){
            if (ang1[k]>max){
                max = ang1[k];
            }
        }
        System.out.print("Angka terbesar adalah " +max);
        System.out.println();

        //mencari rata rata dari array
        System.out.print("Masukkan panjang array : ");
        int batas1 = input.nextInt();
        int[] angka1 = new int[batas1];
        int total1 = 0;

        for (int i=0; i<angka1.length; i++){
            System.out.print("Angka ke-" + (i+1) + " : ");
            angka1[i] = input.nextInt();
            total1 = total1 + angka1[i];
            total1 = total1/batas1;
        }
        System.out.print("Total rata-rata dari " + batas1 + " angka tersebut adalah : " + total1);
        System.out.println();
    }
}
