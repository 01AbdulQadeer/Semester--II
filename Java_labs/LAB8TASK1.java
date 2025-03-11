package lab8.task1;
abstract class BankAccount {
    protected int service_years;
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    
    public void show() {
        System.out.println("Service years: " + service_years);
    }
}

class CheckingAccount extends BankAccount {
    @Override
    public void deposit(double amount) {
        System.out.println("50000.0");
    }
    
    @Override
    public void withdraw(double amount) {
        System.out.println("40000.0");
    }
}

class SavingsAccount extends BankAccount {
    @Override
    public void deposit(double amount) {
        System.out.println("20000.0");
    }
    
    @Override
    public void withdraw(double amount) {
        System.out.println("10000.0");
    }
}

public class LAB8TASK1 {
   public static void main(String[] args) {
    CheckingAccount checking = new CheckingAccount();
    SavingsAccount savings = new SavingsAccount();
    
    checking.deposit(1000.00);
    savings.deposit(5000.00);
    
    checking.withdraw(500.00);
    savings.withdraw(1000.00);
    
    checking.show();
    savings.show();
    
}

    
}
