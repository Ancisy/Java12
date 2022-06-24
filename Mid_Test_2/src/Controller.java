import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArrayList<User> myUser;
    UserService service;
    Scanner sc;

    public Controller() {
        service = new UserService();
        myUser = service.getAllUser();
    }

    public void main() {
        Util.menu();
        sc = new Scanner(System.in);
        System.out.println("Lựa chọn của bạn là : ");
        int choose = Integer.parseInt(sc.nextLine());
        while (true) {
            switch (choose) {
                case 1:
                    System.out.println("Nhập username : ");
                    String userName = sc.nextLine();
                    boolean flag = false;
                    boolean status = false;
                    if (flag = checkUserName(userName)) {
                        System.out.println("Nhập password : ");
                        String passWord = sc.nextLine();
                        if (flag = checkPassWord(passWord)) {
                            System.out.println("Chúc bạn " + userName + " đăng nhập thành công bạn có thể thực hiện các công việc sau ");
                            subMenuMain();
                            break;
                        } else {
                            System.out.println("Quên password: ");
                        }
                    } else {
                        System.out.println("Nhập lại password: ");
                    }
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }
    }

    public void subMenuMain() {
        Util.subMenu();
        System.out.println("Lựa chọn của bạn là : ");
        int choose = Integer.parseInt(sc.nextLine());
        while (true) {
            switch (choose) {
                case 1:
                    changeUserName();
                    break;
                case 2:
                    changeYourEmail();
                    break;
                case 3:
                    changeYourPassWord();
                    break;
                case 4:
                    main();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;

            }
        }
    }

    public void showUser() {
        service.show(myUser);
    }

    public boolean checkUserName(String userName) {
        boolean flag = service.checkUserName(myUser, userName);
        return flag;
    }

    public boolean checkPassWord(String passWord) {
        boolean flag = service.checkPassWord(myUser, passWord);
        return flag;
    }

    public void changeUserName() {
        System.out.println("điền email của account cần đổi tên :");
        String mail = sc.nextLine();
        User fUser = service.findYourMail(myUser, mail);
        if (fUser != null) {
            service.changeUserName(myUser, fUser, mail);
        } else {
            System.out.println("không tìm thấy tài khoản cần đổi tên");
        }
    }

    public void changeYourEmail() {
        System.out.println("điền email cần đổi :");
        String oldMail = sc.nextLine();
        User yourUser = service.findYourMail(myUser, oldMail);
        System.out.println("điền email mới của bạn :");
        String newMail = sc.nextLine();
        service.changeEmail(myUser,yourUser,oldMail);
    }

    public void changeYourPassWord(){
        System.out.println("điền email tài khoản cần đổi password:");
        String mail = sc.nextLine();
        User yourUser = service.findYourMail(myUser, mail);
        System.out.println("điền password mới :");
        String pass = sc.nextLine();
        service.changePassword(yourUser,pass);
    }

}
