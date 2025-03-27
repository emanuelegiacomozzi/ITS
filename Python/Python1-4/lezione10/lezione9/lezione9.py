def complex_statistical_function(x, distribution_type, **kwargs):

    if distribution_type == "geometric":

        p:float = kwargs["p"]
    
    elif distribution_type == "poisson":

        lambda_1:float = kwargs["lambda_1"]

complex_statistical_function(x=1.0, distribution_type="geometric", p=5.0)
complex_statistical_function(x=2.0, distribution_type="poisson", lambda_1=5.0)

#esercizi vari

#esercizio 5

class Account:

    def __init__(self, account_id:str, balance:float):
        self.account_id = account_id
        self.balance = balance

    def deposit(self,amount:float):
        self.amount = amount
        
    def get_balance(self):
        self.new_balance = self.balance + self.amount
        return self.new_balance

class Bank:

    def __init__(self):
        self.accounts = {}
    
    def create_account(self, account_id:Account):
        self.account_id = account_id
        self.balance = 0.0
    
    def deposit(self,account_id:str,amount:str):
        self.account_id = account_id
        self.amount = amount
        
    
    def get_balance(self, account_id:str):
        self.account_id = account_id
        self.balance += self.amount
        return self.balance
    


account1 = Account("123", 100)
account1.deposit(50)
print("Saldo corrente: ", account1.get_balance())

bank = Bank()
account2 = bank.create_account("123")
bank.deposit("123",100)
print(bank.get_balance("123"))






#esercizio 6

def anagram(s:str, t:str) -> bool:
    s = s.lower()
    t= t.lower()
    lista = list(s)
    lista2 = list(t)
    if sorted(lista) == sorted(lista2):
        return True
    else:
        return False


print(anagram("rat", "car"))

#esercizio 7


    
    


