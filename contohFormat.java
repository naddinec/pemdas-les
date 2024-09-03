public class contohFormat {
    public static void main(String[] args) {
        
        String namaDepan = "nadine";
        String namaBelakang = "candra";
        double tinggi = 158.158;

        System.out.format("nama saya %s %s %n", namaDepan, namaBelakang);
        System.out.printf("nama saya %s %s %n", namaDepan, namaBelakang);
        System.out.printf("tinggi saya %.2f %n", tinggi);

    }
}
