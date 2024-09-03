public class fungsistatic {
    //fungsi non static
    void makan(String makanan){
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + makanan);
    }
    //fungsi static
    static void minum(String minuman){
        System.out.println("Saya sedang minum " + minuman);
    }
    public static void main(String[] args) {
        minum("kopi");
        fungsistatic input = new fungsistatic();
        input.makan("nasi goreng");
    }
}
