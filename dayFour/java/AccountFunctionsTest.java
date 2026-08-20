import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountFunctionsTest{

    @Test
    public void testAccountBalanceIsZeroDuringCreation(){
        
        double balance = 0.0;
        
        double expectedBalance = AccountFunctions.checkBalance(balance);
        double actualBalance = 0.0;
        
        assertEquals(actualBalance, expectedBalance);
    }
    
     @Test
    public void testThatAccountCanBeDepositedIntoAfterCreationAndShowsTransactions(){
        
        double deposit = 2000.0;
        double balance = 5000.0;
        
        double expectedBalance = AccountFunctions.deposit(deposit,balance);
        double actualBalance = 7000.0;
        assertEquals(actualBalance, expectedBalance);
    }
    
    @Test
    public void testDepositNegativeAmountBalanceRemainsUnchanged(){
        
        double deposit = -2000.0;
        double balance = 5000.0;
        
        double expectedBalance = AccountFunctions.deposit(deposit,balance);
        double actualBalance = 5000.0;
        assertEquals(actualBalance, expectedBalance);
    }
    
    @Test
    public void testThatAccountWithdrawalWithdrawsAccurateAmount(){
        
        double balance = 5000.0;
        double withdrawal = 2000.0;
        
        double expectedBalance = AccountFunctions.withdraw(withdrawal,balance);
        double actualBalance = 3000.0;
        assertEquals(actualBalance, expectedBalance);
    }
    
    @Test
    public void test_that_AccountWithdrawal_is_not_above_balance(){
        
        double balance = 5000.0;
        double withdrawal = 7000.0;
        
        double expectedBalance = AccountFunctions.withdraw(withdrawal,balance);
        double actualBalance = 5000.0;
        assertEquals(actualBalance, expectedBalance);
    }
    
   
}
