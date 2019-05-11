package Tuần_2.Bai_4;

public class Account {
long stk;
String tenTK;
double budget;
final double interest = 0.035;


    public Account(long stk, String tenTK, double budget) {
        this.stk = stk;
        this.tenTK = tenTK;
        this.budget = budget;
    }

    public Account() {
    }

    public long getStk() {
        return stk;
    }

    public void setStk(long stk) {
        this.stk = stk;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
public Account(long stk,String tenTK){
        budget=50;
}

void charge(double money){
        budget+=money;
}
void take(double money){
        budget-=money+(money*0.1);
}
void daoHan(){
        budget+=budget*interest;
}
void chuyenKhoan(Account ac1,Account ac2,double money){
        ac2.budget+=money;
        ac1.budget-=money;

}
    @Override
    public String toString() {
        return "Account{" +
                "stk=" + stk +
                ", tenTK='" + tenTK + '\'' +
                ", budget=" + budget +
                '}';
    }
}
