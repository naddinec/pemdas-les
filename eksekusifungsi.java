import java.util.Scanner;

public class eksekusifungsi {
    static void ucapSalam(){
        System.out.println("Selamat pagi");
        int x = 3*5;
        fungsi2(x);
    }

    //fungsi dengan parameter
    static void fungsi2(int ucapan){
        System.out.println(ucapan);
    }

    //fungsi yang membalikan nilai
    static int luasPersegi(int sisi){
        int luas = sisi*sisi;
        return luas;
    }
    public static void main(String[] args) {
        ucapSalam();

        //fungsi dengan scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi : ");
        int sisi = input.nextInt();
        System.out.println("luasnya adalah : " +luasPersegi(sisi));
    }
}
