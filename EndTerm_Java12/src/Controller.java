import java.util.ArrayList;
import java.util.Scanner;
public class Controller {
    ArrayList<Account> listAccount;
    AccService service;
    ArrayList<MoneyReceiver> listReceiver;
    MoneyRecervierService serviceReceiver;


    Scanner sc;

    public Controller(){
        service = new AccService();
        serviceReceiver = new MoneyRecervierService();
        listAccount = service.getAllUser();
        listReceiver = serviceReceiver.getAllReceiver();
        sc = new Scanner(System.in);
    }
    public void main(){
        while(true){
            Util.mainMenu();
            System.out.println("Lựa chọn của bạn là : ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1 :
                    Account yourAccount = Login();
                    System.out.println("Chúc bạn " + yourAccount.getFullname() + " Đăng Nhập Thành Công ");
                    break;
                case 0 :
                    System.exit(0);
                    break;
            }
        }
    }

    public Account Login(){
        Account loginAccount = null;
        boolean flag = true;
        while(flag){
            System.out.println("Nhập số điện thoại ");
            String phonenumber = sc.nextLine();
            for(Account a : listAccount){
                if(a.getPhoneNumber().equals(phonenumber)){
                    System.out.println("Nhập password: ");
                    String password = sc.nextLine();
                    if(a.getPassword().equals(password)){
                        loginAccount = a;
                        loginSuccess(a);
                        flag = false;
                        return loginAccount;
                    }else{
                        System.out.println("Sai password vui lòng nhập lại tài khoản");
                    }
                }else{
                    flag = true;
                    System.out.println("Xin vui lòng đăng nhập lại ");
                    break;
                }
            }
        }
        return loginAccount;
    }

    public void loginSuccess(Account yourAccount){
        while(true){
            Util.loginSuccessMenu();
            System.out.println("Lựa chọn của bạn là : ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1 :
                    checkDepositsMoney(yourAccount);
                    break;
                case 2 :
                    long sendMoney = checkSendMoney(yourAccount);
                    System.out.println("Nhập số tài khoản bạn cần chuyển");
                    String stk = sc.nextLine();
                    transferMoney(yourAccount,listReceiver,sendMoney,stk);
                    break;
                case 3 :

                    break;
                case 0 :
                    System.exit(0);
                    break;
            }
        }
    }
    //Truy Vấn Số Dư Tài Khoản
    public void checkDepositsMoney(Account yourAccount){
        long accountBalance = yourAccount.getDepositsMoney();
        System.out.println("Số dư tài khoản của bạn hiện tại là : " + accountBalance);
    }

    //Kiểm tra số tiền gửi đi
    public long checkSendMoney(Account yourAccount) {
        long money = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Nhập số tiền bạn muốn chuyển ");
            money = Long.parseLong(sc.nextLine());
            if (money > 50000 && money <(yourAccount.getDepositsMoney()-50000)) {
                flag = false;
                return money;
            } else {
                System.out.println("Số tiền của bạn không đặt yêu cầu, yêu cầu nhập lại ");
                flag = true;
            }
        }
        return money;
    }

    //Gửi tiền qua tài khoản khác
    public void transferMoney(Account yourAccount,ArrayList<MoneyReceiver> listReceriver,Long sendMoney, String receiverSTK) {
        long yourMoney = yourAccount.getDepositsMoney()-sendMoney;
        yourAccount.setDepositsMoney(yourMoney);
        System.out.println("Số tài khoản của bạn sau khi gửi tiền đi " + yourAccount.getDepositsMoney() );

        for(MoneyReceiver r: listReceriver){
            if(r.getStk().equals(receiverSTK)){
                System.out.println("Tài khoản "+ receiverSTK + " đã nhận được tiền ");
                long money = r.getDepositMoney() + sendMoney;
                r.setDepositMoney(money);
                System.out.println("Tài khoản " + receiverSTK + " có số tiền là : " + r.getDepositMoney());
            }
        }
    }


}
