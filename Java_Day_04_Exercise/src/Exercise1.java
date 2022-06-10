import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn :");
        String inputName = sc.nextLine();
        String[] array = inputName.split(" ");
        String outputName = "";
        for (int i = 0; i < array.length; i++) {
            outputName += String.valueOf(array[i].charAt(0)).toUpperCase() + array[i].substring(1);
            if (i < array.length - 1) {
                outputName += " ";
            }
        }
        System.out.println("Tên của bạn là : " + outputName);
    }
}
