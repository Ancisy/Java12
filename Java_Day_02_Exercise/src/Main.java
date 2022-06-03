import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int randomNumber;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số bất kỳ : ");
        number = sc.nextInt();

        Random rd = new Random();
        randomNumber = rd.nextInt(100);
        System.out.println("Số random ngẫu nhiên là : " + randomNumber);

        String result= number>randomNumber ? "Số bạn nhập vào lớn hơn " + randomNumber : "Số bạn nhập vào nhỏ hơn " + randomNumber;
        System.out.println(result);

    }
}
