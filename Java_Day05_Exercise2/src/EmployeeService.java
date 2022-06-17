public class EmployeeService {
    public Employee[] listEmployee() {
        Employee[] arrEmployee = new Employee[4];
        arrEmployee[0] = new Employee("nv1", "Trang", "25-6-1996", GENDER.FEMALE, "0911344567", "Trang@gmail.com", "8 Hàng Gai, Hà Nội");
        arrEmployee[1] = new Employee("nv2", "Hùng", "2-9-1992", GENDER.MALE, "099367787", "Hung@gmail.com", "23 Hàng Bông, Hà Nội");
        arrEmployee[2] = new Employee("nv3", "Linh", "5-8-1996", GENDER.FEMALE, "0934344907", "Linh@gmail.com", "Quận 1, Hồ Chí Minh");
        arrEmployee[3] = new Employee("nv4", "Đạo", "3-6-1990", GENDER.MALE, "0923356567", "Dao@gmail.com", "Quận Gò Vấp, Hồ Chí Minh");

        return arrEmployee;
    }

    public void show(Employee[] arrEmployee) {
        for (int i = 0; i < arrEmployee.length; i++) {
            System.out.println(arrEmployee[i].getId() + " - " + arrEmployee[i].getName() + " - " + arrEmployee[i].getBirthday() + " - " + arrEmployee[i].getGender() + " - " +
                    arrEmployee[i].getPhone() + " - " + arrEmployee[i].getEmail() + " - " + arrEmployee[i].getAddress());
        }
    }

    public void findEmployeeByID(Employee[] arrEmployee, String id) {
        boolean status = false;
        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i].getId().equals(id)) {
                System.out.println(arrEmployee[i].getId() + " - " + arrEmployee[i].getName() + " - " + arrEmployee[i].getBirthday() + " - " + arrEmployee[i].getGender() + " - " +
                        arrEmployee[i].getPhone() + " - " + arrEmployee[i].getEmail() + " - " + arrEmployee[i].getAddress());
            status = true;
            }
        }
        if(status != true){
            System.out.println("Không tìm thấy nhân viên");
        }
    }

    public void findEmployeeByName(Employee[] arrEmployee, String name ){
        boolean status = false;
        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i].getName().contains(name)) {
                System.out.println(arrEmployee[i].getId() + " - " + arrEmployee[i].getName() + " - " + arrEmployee[i].getBirthday() + " - " + arrEmployee[i].getGender() + " - " +
                        arrEmployee[i].getPhone() + " - " + arrEmployee[i].getEmail() + " - " + arrEmployee[i].getAddress());
                status = true;
            }
        }
        if(status != true){
            System.out.println("Không tìm thấy nhân viên");
        }
    }

    public void listEmployeeByGender (Employee[] arrEmployee){
        System.out.println("Danh sách Nhân viên Nam :");
        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i].getGender() == GENDER.MALE ) {
                System.out.println(arrEmployee[i].getId() + " - " + arrEmployee[i].getName() + " - " + arrEmployee[i].getBirthday() + " - " + arrEmployee[i].getGender() + " - " +
                        arrEmployee[i].getPhone() + " - " + arrEmployee[i].getEmail() + " - " + arrEmployee[i].getAddress());
            }
        }

        System.out.println("Danh sách Nhân viên Nữ  :");
        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i].getGender() == GENDER.FEMALE ) {
                System.out.println(arrEmployee[i].getId() + " - " + arrEmployee[i].getName() + " - " + arrEmployee[i].getBirthday() + " - " + arrEmployee[i].getGender() + " - " +
                        arrEmployee[i].getPhone() + " - " + arrEmployee[i].getEmail() + " - " + arrEmployee[i].getAddress());
            }
        }

    }

    public void findEmployeeByAddress(Employee[] arrEmployee, String address ){
        boolean status = false;
        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i].getAddress().contains(address)) {
                System.out.println(arrEmployee[i].getId() + " - " + arrEmployee[i].getName() + " - " + arrEmployee[i].getBirthday() + " - " + arrEmployee[i].getGender() + " - " +
                        arrEmployee[i].getPhone() + " - " + arrEmployee[i].getEmail() + " - " + arrEmployee[i].getAddress());
                status = true;
            }
        }
        if(status != true){
            System.out.println("Không tìm thấy nhân viên");
        }
    }


}
