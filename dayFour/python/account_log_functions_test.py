from unittest import TestCase

from account_log_functions import *


class AccountTest(TestCase):

    def test_to_show_acount_balance_is_zero_at_the_beginning(self):
        balance = 0.0
        expected_balance  = "N0.0"

        actual_balance  =  check_balance(balance)

        self.assertEqual(actual_balance, expected_balance)

        
        
        
    def test_thatAccount_canBeDepositedInto_afterCreation_andShows_transactions(self):
    
        amount = 1000
        
        balance = 0.0 
        expected_balance = deposit(amount,balance)
        actual_balance = "Deposited: N1000 | New Balance: N1000"
        
        self.assertEqual(actual_balance, expected_balance)
        

    
    def test_DepositNegativeAmount_balanceRemains_unchanged(self):
    
        amount = -1000
        
        balance = 0.0 
        expected_balance = deposit(amount,balance)
        actual_balance = "Deposited: N-1000 | New Balance: N0.0"
        
        self.assertEqual(actual_balance, expected_balance)
        
    def test_thatAccountWithdrawal_withdrawsAccurate_Amount(self):
    
        amount = 1000
        
        balance = 2000 
        expected_balance = deposit(amount,balance)
        actual_balance = "Withdrew: N1000 | New Balance: N1000"
        
        self.assertEqual(actual_balance, expected_balance)
    
    
    def test_that_AccountWithdrawal_is_not_above_balance(self):
    
        amount = 3000
        
        balance = 2000 
        expected_balance = deposit(amount,balance)
        actual_balance = "Withdrew: N3000 | New Balance: N2000"
        
        self.assertEqual(actual_balance, expected_balance)
    
    
    def test_that_AccountWithdrawal_withdrawsValid_Amount(self):
        
        amount = -1000
        
        balance = 2000 
        expected_balance = deposit(amount,balance)
        actual_balance = "Withdrew: N-1000 | New Balance: N2000"
        
        self.assertEqual(actual_balance, expected_balance)
        
