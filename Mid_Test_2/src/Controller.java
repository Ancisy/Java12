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
        Util.menuLogin();
        int choose = -1;
        boolean x = true;
            while(x){
                try {
                    sc = new Scanner(System.in);
                    System.out.println("Lựa chọn của bạn là : ");
                    choose = Integer.parseInt(sc.nextLine());
                    x=false;
                }catch (NumberFormatException e){
                    System.out.println("Vui lòng nhập lại " + e.getMessage());
                }
            }
        boolean flag = false;
        boolean status = false;
        while (true) {
            switch (choose) {
                case 1:
                    System.out.println("Nhập username : ");
                    String userName = sc.nextLine();
                        if (flag = checkUserName(userName)) {
                            System.out.println("Nhập password : ");
                            String passWord = sc.nextLine();
                            if (status = checkPassWord(passWord)) {
                                System.out.println("Chúc bạn " + userName + " đăng nhập thành công bạn có thể thực hiện các công việc sau ");
                                subMenuMain(); //thoát khỏi vòng lặp
                            } else {
                                subMenuLogin(); //thoát khỏi vòng lặp
                            }
                        } else {
                            System.out.println("Nhập lại username bạn ei ");
                        }
                        break;
                case 2:
                    break;
                default:
                    break;
            }
        }
    }

    public void subMenuLogin(){
        while (true) {
            Util.subMenuLogin();
            System.out.println("Lựa chọn của bạn là : ");
            int choose = Integer.parseInt(sc.nextLine());
            switch(choose){
                case 1:
                    main();
                    break;
                case 2:
                    System.out.println("Nhập Email của bạn : ");
                    String mail = sc.nextLine();
                    User user = service.findYourMail(myUser,mail);
                    if(user != null){
                        System.out.println("Đổi mật khẩu :");
                        String password = sc.nextLine();
                        user.setPassword(password);
                        main();
                    }else{
                        System.out.println("Tài khoản không tồn tại");
                    }
                    break;


            }
        }
    }
    public void subMenuMain() {
        while (true) {
            Util.subMenu();
            System.out.println("Lựa chọn của bạn là : (Bấm 5 để xem danh sách) ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    changeYourName();
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
                case 5:
                    service.show(myUser);
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

    public void changeYourName() {
        System.out.println("điền email của account cần đổi tên :");
        String mail = sc.nextLine();
        User fUser = service.findYourMail(myUser, mail);
        if (fUser != null) {
            System.out.println("Nhập username mới để đổi : ");
            String newUserName = sc.nextLine();
            service.changeUserName(myUser,fUser,newUserName);
        } else {
            System.out.println("không tìm thấy tài khoản cần đổi tên");
        }
    }

    public void changeYourEmail() {
        System.out.println("điền email cần đổi :");
        String oldMail = sc.nextLine();
        User yourUser = service.findYourMail(myUser, oldMail);
        if(yourUser != null) {
            System.out.println("điền email mới của bạn :");
            String newMail = sc.nextLine();
            service.changeEmail(myUser,yourUser,newMail);
        }else {
            System.out.println("Không có email này");
        }
    }

    public void changeYourPassWord(){
        System.out.println("điền email tài khoản cần đổi password:");
        String mail = sc.nextLine();
        User yourUser = service.findYourMail(myUser, mail);
        if(yourUser != null){
            System.out.println("điền password mới :");
            String pass = sc.nextLine();
            service.changePassword(yourUser,pass);
        }
    }

}
