import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Employee[] arrEmployee = service.listEmployee();
        //Hiển thị danh sách nhân viên
        service.show(arrEmployee);
        //Tìm nhân viên theo id
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhập id nhân viên cần tìm : ");
        service.findEmployeeByID(arrEmployee,sc.next());
        //Tìm nhân viên theo giới tính
        sc.nextLine();
        System.out.println("Nhân tên nhân viên cần tìm : ");
        service.findEmployeeByName(arrEmployee, sc.nextLine());
        //Liệt kê danh sách nhân viên theo giới tính
        service.listEmployeeByGender(arrEmployee);
        //Tìm nhân viên sống ở Hà Nội
        String address = "Hà Nội";
        System.out.println("Danh sách nhân viên sống ở Hà Nội");
        service.findEmployeeByAddress(arrEmployee, address);
    }
}
