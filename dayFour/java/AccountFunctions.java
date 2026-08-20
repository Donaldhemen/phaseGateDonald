
public class AccountFunctions{
    
    public static double checkBalance(double balance){
        
        return balance;
    }
    public static double deposit(double amount, double balance){
        if(amount > 0.0){
            balance += amount;
            
        }
        return balance;
    }
    
    public static double withdraw(double amount, double balance){
        
        if (balance >= amount){
            balance -= amount;
        }
        return balance;
    }
    public static double showTransactions(double amount, int balance){
        double transaction = deposit(amount, balance);
        
    }
    
    
}
