
def check_balance(account_balance):

    return "N{account_balance}"
    
def deposit(amount,account_balance):

    if amount > 0.0:
        account_balance +=  amount

    return show_transactions_deposit(amount, account_balance)


def withdraw(amount, account_balance):

    if account_balance >= amount > 0:

        account_balance -= amount
        

    return show_transactions_withdraw(amount, account_balance)
    

def show_transactions_deposit(amount, account_balance):
    transaction = f"Deposited: N{amount} | New Balance: N{account_balance}"
    return transaction
        
def show_transactions_withdraw(amount, account_balance):
    transaction = f"Withdrew: N{amount} | New Balance: N{account_balance}"
    return transaction

