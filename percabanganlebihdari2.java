import java.util.Scanner;
public class percabanganlebihdari2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai : ");
        int nilai = input.nextInt();
        String grade;

        if (nilai >= 92) {
            grade ="A";
        } else if (nilai >=80) {
            grade = "B";
        } else if (nilai >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("Grade : " +grade);
    }

}
