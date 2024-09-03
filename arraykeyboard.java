import java.util.Scanner;

public class arraykeyboard {
    public static void main(String[] args) {
        //SATU DIMENSI
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang array : ");
        int batas = input.nextInt();
        String[] siswa = new String[batas];

        for (int i=0; i<siswa.length; i++){
            System.out.print("siswa " + (i+1) + " : ");
            siswa[i] = input.next();
            }

            System.out.print("nama siswa adalah : ");
            for (int i=0; i<siswa.length; i++){
                System.out.print(siswa[i]);
                if (i<siswa.length-1){
                    System.out.print(", ");
                }
        }
    }
}
