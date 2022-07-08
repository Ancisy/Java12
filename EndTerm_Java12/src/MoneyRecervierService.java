import java.util.ArrayList;

public class MoneyRecervierService {
    public ArrayList<MoneyReceiver> getAllReceiver(){
        ArrayList<MoneyReceiver> listReceiver = new ArrayList<>();
        listReceiver.add(new MoneyReceiver("99876543210",100000));
        listReceiver.add(new MoneyReceiver("99234232410",200000));
        listReceiver.add(new MoneyReceiver("9923443410",300000));
        return listReceiver;
    }
}
