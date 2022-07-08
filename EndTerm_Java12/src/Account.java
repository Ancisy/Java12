public class Account {
    private String stk;
    private String fullname;

    private String phoneNumber;

    private String password;
    private long depositsMoney;

    public Account() {
    }

    public Account(String stk, String fullname, String phoneNumber, String password, long depositsMoney) {
        this.stk = stk;
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.depositsMoney = depositsMoney;
    }


    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getDepositsMoney() {
        return depositsMoney;
    }

    public void setDepositsMoney(long depositsMoney) {
        this.depositsMoney = depositsMoney;
    }
}
