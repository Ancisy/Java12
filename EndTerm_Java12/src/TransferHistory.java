import java.util.Date;

public class TransferHistory {
    private String id;
    private Date transferDate;
    private String description;
    private String receiverSTK;
    private long money;


    public TransferHistory() {
    }

    public TransferHistory(Date transferDate, String description, String receiverSTK, long money) {
        this.id = Util.randomId(3);
        this.transferDate = transferDate;
        this.description = description;
        this.receiverSTK = receiverSTK;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReceiverSTK() {
        return receiverSTK;
    }

    public void setReceiverSTK(String receiverSTK) {
        this.receiverSTK = receiverSTK;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return id + " - " + transferDate + " - " + description + " - " + receiverSTK + " - " + money;
    }
}
