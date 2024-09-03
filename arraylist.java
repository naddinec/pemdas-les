import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList input = new ArrayList<>();

        input.add("Senter");
        input.add(12567);
        input.add("tikus");
        input.add(2485940);
        input.add(true);

        input.remove("tikus");

        System.out.println("Kantong ajaib");
        System.out.println("Kantong ajaib berisi " + input.size() + " item");
    }
}
