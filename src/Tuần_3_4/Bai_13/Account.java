package Tuần_3_4.Bai_13;

public abstract class Account {
double balance;
String acct_id;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    boolean withdraw(double amount){
        return false;
    }

    void deposit(){

    }
}
