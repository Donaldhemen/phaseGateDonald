

from account_log_functions import *

def main():



    balance =  0


    print("Welcome to Transaction Log App . . . . . ")

    menu =  """


        1. Deposit
        
        2. Withdrawal
        
        3. Show Transactions
        
        0. Exit

    """

    tracker  = 1
        
    while (tracker != 0):

        choice =  input(f"{menu}\nEnter Your Choice:  ")

        match choice:
                    
            case "1":
                    amount  =  input("Enter your Amount to Deposit:  ")
                    
                    for digit in amount:
                        if  not digit.isdigit():
                            print("Invalid")
                            break
                            
                            
                    else: 
                        amount = float(amount)
                    
                        new_balance =  deposit(amount,balance)
                    
                        if new_balance == balance:
                            print("Invalid Amount Inputted")
                            
                        else:
                            balance  =  new_balance
                            print(balance)
                        
            case "2": 
                    
                amount  =  float(input("Enter your Amount to Deposit:  "))
                    
                new_balance =  withdraw(amount, balance)
                if new_balance == balance:
                        print("Invalid Amount Inputted")
                        
                else:
                    balance  =  new_balance
                    print(balance)
            
            case "3" :
                print(withdraw(amount, balance))
                print(deposit(amount,balance))
            case "0":
                print(balance) 
                print("Thank you for using Transaction Log App")
                tracker  = 0        

            case _ : print("Invalid input")

             
             

if __name__ == "__main__":

    main()    

    
    
    
    
    
    
    
    
