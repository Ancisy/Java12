import java.util.Random;

public class MidTestQuestion03 {
    public static void main(String[] args) {
        Random rd = new Random();
        int rdNumber = rd.nextInt();
        System.out.println("Số ngẫu nhiên là : " + rdNumber);
        boolean status = isPrimeNumber(rdNumber);
        if (status) {
            System.out.println("số trên là số nguyên tố");
        } else
            System.out.println("số trên ko phải số nguyên tố");
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
