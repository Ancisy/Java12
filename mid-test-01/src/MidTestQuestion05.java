import java.util.Scanner;

public class MidTestQuestion05 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Số Dòng : ");
        int n = sc.nextInt();
        System.out.println("Số Cột : ");
        int m = sc.nextInt();
        int[][] firstArray = new int[n][m];
        int[][] secondArray = new int[n][m];
        //Nạp phần tử vào mảng 2 chiều firstArray
        System.out.println("Nhập phần tử vào mảng 2 chiều firstArray");
        inPut(n, m, firstArray);
        //Nạp phần tử vào mảng 2 chiều secondArray
        System.out.println("Nhập phần tử vào mảng 2 chiều secondArray");
        inPut(n, m, secondArray);
        System.out.println("In mảng firstArray: ");
        printArray(n, m, firstArray);
        System.out.println("In mảng secondArray: ");
        printArray(n, m, secondArray);
        //Cộng 2 mảng
        int[][] thirdArray = new int[n][m];
        thirdArray = addArray(n, m, firstArray, secondArray, thirdArray);
        System.out.println("In mảng sau khi cộng");
        printArray(n, m, thirdArray);

    }

    public static void inPut(int n, int m, int[][] Array) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nập phần tử dòng : " + (i + 1) + " Cột : " + (j + 1));
                Array[i][j] = sc.nextInt();
            }
        }
    }

    public static void printArray(int n, int m, int[][] Array) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Array[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static int[][] addArray(int n, int m, int[][] firstArray, int[][] secondArray, int[][] thirdArray) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                thirdArray[i][j] = firstArray[i][j] + secondArray[i][j];
            }
        }
        return thirdArray;
    }
}
