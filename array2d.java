import java.util.Scanner;
public class array2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //matrix
        System.out.print("Masukkan jumlah baris : ");
        int rows = input.nextInt();
        System.out.print("Masukka jumlah kolom : ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.format("Masukkan elemen (%d,%d) : " ,i,j);
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix yang dimasukkan: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //matrix tempat duduk
        System.out.print("Masukkan jumlah baris meja : ");
        int rows1 = input.nextInt();
        System.out.print("Masukka jumlah kolom meja : ");
        int cols1 = input.nextInt();

        String[][] matrix1 = new String[rows][cols];

        for (int i=0; i<rows1; i++){
            for (int j=0; j<cols1; j++){
                System.out.format("Siapa yang akan duduk di meja (%d,%d) : " ,i,j);
                matrix1[i][j] = input.next();
            }
        }

        System.out.println("Tempat duduk : ");
        for (int i=0; i<rows1; i++){
            for (int j=0; j<cols1; j++){
                System.out.print("| " + matrix1[i][j] + " |     ");
            }
            System.out.println();
        }
        //contoh matrix
        String[] []huruf = {
            {"A", "B", "C"},
            {"D", "E", "F"},
            {"G", "F", "I"}
        };
        System.out.println(huruf[0][1]);
        System.out.println(huruf[2][0]);
    }
}
