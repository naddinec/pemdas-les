import java.util.Scanner;
public class percabangancase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Warna lampu : ");
        String lampu = input.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati.");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan.");
                break;
            default:
                System.out.println("Warna lampu salah!");
                break;
        }
    }
}
