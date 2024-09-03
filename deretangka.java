import java.util.Scanner;
public class deretangka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = input.nextInt();

        //5 10 15 20 25 30
        for (int i=1; i<=batas; i++){
            System.out.print(" " + i*5);
        }
        System.out.println();

        //8 9 10 11 12 13 14
        int counter = 8;
        for (int i=1; i<=batas; i++){
            System.out.print(" " + counter);
            counter++;
        }
        System.out.println();

        //1 4 9 16 25 36 49
        for (int i=1; i<=batas; i++){
            System.out.print(" " + i*i);
        }
        System.out.println();

        // 1 + 2 + 3 =
        int total = 1;
        System.out.print("1");
        for (int i=2; i<=batas; i++){
            System.out.print(" + " + i);
            total = total + i;
        }
        System.out.print(" = " + total);
        System.out.println();

        // fibonacci (0 1 1 2 3 5 8 13 21 34)
        int t1 = 0;
        int t2 = 1;
        int angkaBatas = 0;
        for (int i=1; i<=batas; i++){
            if (i==1){
                System.out.print(" " + t1);
            }
            if (i==2){
                System.out.print(" " + t2);
            }
            angkaBatas = t1 + t2;
            t1 = t2;
            t2 = angkaBatas;
            System.out.print(" " + angkaBatas);
        }
    }
}
