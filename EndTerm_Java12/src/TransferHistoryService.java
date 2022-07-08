import java.util.ArrayList;
import java.util.Date;

public class TransferHistoryService {
    ArrayList<TransferHistory> history = new ArrayList<>();
    public ArrayList<TransferHistory> saveTransferHistory(Date dateNow, String description, String stk, long sendMoney){
        history.add(new TransferHistory(dateNow,description,stk,sendMoney));
        return history;
    }

    public void showTransferHistory(){
        System.out.println("Danh sách history ");
        for(TransferHistory h : history){
            System.out.println(h.getId() + " - " + h.getDescription() + " - " + h.getReceiverSTK() +" - " + h.getTransferDate() + " - " + h.getMoney());
        }
    }
}
