import java.util.Scanner;
import java.util.regex.Pattern;

public class MidTestQuestion06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bàn phím Email : ");
        String myEmail = sc.next();
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        if (Pattern.matches(EMAIL_PATTERN, myEmail))
            System.out.println("Email nhập đúng định dạng");
        else
            System.out.println("Email sai mời nhập lại");
        System.out.println();
        System.out.println("Nhập vào số điện thoại : ");
        String phoneNumber = sc.next();

    }
}
