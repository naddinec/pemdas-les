public class operator {
    public static void main(String[] args) {
        
        // 1. penegasan =
        int bilangan = 10;

        // 2. aritmatika +, -, *, /, ++, --, +=, -=
        int bil1 = 12;
        int bil2 = 2;
        int hasil = bil1 + bil2;
        bil1++;

        // 3. pembanding <, >, <=, >=, !=
        int bil3 = 12;
        int bil4 = 2;
        boolean hasil1 = bil3 != bil4;

        // 4. logika
        int x = 5;
        boolean hasil2 =  x > 3 && x < 5;

        System.out.println("hasil : " + bil1);
    }
}
