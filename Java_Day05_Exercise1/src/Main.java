import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookService service = new BookService();
        // Tạo sách và hiển thị danh sách
        Book[] bookArr = service.getAllBook();
        service.show(bookArr);

        //Nhập tên sách cần tìm
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhập tên sách cần tìm : ");
        service.findBookbyName(bookArr,sc.nextLine());
        //Nhập tên thể loại sách cần tìm
        System.out.print("Nhập tên thể loại sách cần tìm: ");
        service.findBookbyCategory(bookArr,sc.nextLine());
        //Tìm sách trong năm nay
        System.out.println("Sách sản xuất trong năm nay : ");
        service.findBookbyYear(bookArr, LocalDate.now().getYear());
    }


}
