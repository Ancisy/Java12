public class MoneyReceiver {
    private String stk;
    private long depositMoney;

    public MoneyReceiver() {
    }

    public MoneyReceiver(String stk, long depositMoney) {
        this.stk = stk;
        this.depositMoney = depositMoney;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public long getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(long depositMoney) {
        this.depositMoney = depositMoney;
    }
}
