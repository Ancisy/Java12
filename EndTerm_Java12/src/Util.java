import java.util.Random;

public class Util {
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; // a-z
    private static final String alphaUpperCase = alpha.toUpperCase(); // A-Z
    private static final String digits = "0123456789"; // 0-9
    private static final String specials = "~=+%^*/()[]{}/!@#$?|";
    private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;
    private static final String ALL = alpha + alphaUpperCase + digits + specials;

    private static Random generator = new Random();
    public static int randomNumber(int min, int max) {
        return generator.nextInt((max - min) + 1) + min;
    }


    public static String randomId(int numberOfCharactor) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfCharactor; i++) {
            int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);
            char ch = ALPHA_NUMERIC.charAt(number);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void mainMenu(){
        System.out.println("Mời Bạn Đăng Nhập : ");
        System.out.println("1 - Đăng Nhập ");
        System.out.println("0 - Thoát hệ thống");
    }

    public static void loginSuccessMenu(){
        System.out.println("Chọn yêu cầu của bạn : ");
        System.out.println("1 - Truy Vấn Số Dư Tài Khoản");
        System.out.println("2 - Chuyển Tiền");
        System.out.println("3 - Xin Lịch Sử Giao Dịch");
        System.out.println("0 - Thoát hệ thống");
    }


}
