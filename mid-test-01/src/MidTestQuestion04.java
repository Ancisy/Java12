public class MidTestQuestion04 {
    public static void main(String[] args) {
        int count = 0; //Đếm số nguyên tố
        int n = 2; // Đếm bắt đầu từ 2
        int[] number = new int[10];
        System.out.println("10 số nguyên số đầu tiên là ");
        while (count < 10) {
            if (isPrimeNumber(n)) {
                System.out.print(n + " ");
                number[count] = n;
                count++;
                //System.out.println("mảng nhận giá trị thứ " + count + "là " + n);
            }
            n++;
        }
        System.out.println();
        System.out.println("Số nguyên tố nhỏ hơn 10 là ");
        for (int i = 0; i < 10; i++) {
            if (number[i] < 10) {
                System.out.println(number[i]);
            }
        }

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
