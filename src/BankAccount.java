public class BankAccount  implements  Interfaces{
    private  double balance;

    public BankAccount(double amount) {
        this.balance = amount;

    }
    public double getBalance() {
        return balance;
    }
    public  void deposit(double amount){
        this.balance += amount;
    }

    @Override
    public double getMeasure() {
        return (this.getBalance());
    }
    @Override
    public String getData(){
        return "This is of type BankAccount";
    }
}
