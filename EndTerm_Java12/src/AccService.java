import java.util.ArrayList;

public class AccService {
    public ArrayList<Account> getAllUser(){
        ArrayList<Account> listAccount = new ArrayList<>();
        listAccount.add(new Account("12345678","Nghia","0988288036","12345",150000));
        listAccount.add(new Account("3452352343","Dao  ","0914523444","1234768",13030000));
        listAccount.add(new Account("43523453245","Trang","0932334234","3249284",33060000));
        listAccount.add(new Account("23452345352","Minh","0988888888","32419024",29004000));
        return listAccount;
    }
}
