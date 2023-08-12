public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refill = 1100;
        int bonus = 0;
        if (refill > 1000) bonus = refill / 100;
        int total = account + refill + bonus;
        System.out.println(total);
    }
}