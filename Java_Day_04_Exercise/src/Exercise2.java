import java.util.Scanner;

public class Exercise2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập vào số phần tử của mảng: ");
        int size = sc.nextInt();
        long[] longArray = new long[size];
        //Nhập phần tử cho mảng
        System.out.println("Nhập phần tử cho mảng : ");
        inPut(size, longArray);

        //In các phần tử trong mảng
        System.out.println("In mảng : ");
        outPut(size, longArray);

        //Tăng phần tử chẵn thêm 1 đơn vị
        System.out.println("Mảng sau khi tăng thêm 1 đơn vị cho phần tử chẵn ");
        evenNumberOperation(size, longArray);
        outPut(size, longArray);
    }

    public static void inPut(int size, long[] array) {
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextLong();
        }
    }

    public static void outPut(int size, long[] array) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void evenNumberOperation(int size, long[] array) {
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                array[i] += 1;
            }
        }
    }
}
