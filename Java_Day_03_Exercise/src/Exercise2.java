import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi bất kỳ");
        String rdStr = sc.next();
        int size = rdStr.length();
        boolean status = false;

        int i = 0;
        int j = rdStr.length() - 1;
        if (size % 2 != 0) {
            System.out.println("Không phải chuỗi đảo nghịch");
        } else {
            while (j > i) {
                if (rdStr.charAt(i) != rdStr.charAt(j)) {
                    status = false;
                    break;
                } else{
                    status = true;
                }
                i++;
                j--;
            }

            if (status == true) {
                System.out.println("Đây là chuỗi đảo nghịch");
            }
            else {
                System.out.println("Đây không là chuỗi đảo nghịch");
            }
        }
    }
}
