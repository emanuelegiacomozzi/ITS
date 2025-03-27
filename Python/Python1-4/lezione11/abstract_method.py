from abc import ABC, abstractmethod #decorator

class AbcAnimal(ABC): #definizione di classe astratta

    @abstractmethod #definizione di metodo astratto
    def verso():

        pass

    @abstractmethod
    def movimento():

        pass

class Gatto(AbcAnimal):

    def __init__(self, nome:str) -> None:
        super().__init__()

        self.nome = nome
        self.velocità = 10.0 #m/s

    def verso(self):
        return print("Miao")
    
    def movimento(self, t:int):
        return self.velocità * t

gatto_1:Gatto = Gatto(nome="Pluto")
gatto_1.verso()
print(gatto_1.movimento(t=10))


class Cane(AbcAnimal):

    def __init__(self, nome:str) -> None:
        super().__init__()

        self.nome = nome
        self.velocità = 10.0
    
    def verso(self):
        return print("Bau")

    def movimento(self, t:int):
        return self.velocità * t

cane_1:Cane = Cane(nome="Ciccio")
cane_1.verso()
print(cane_1.movimento(t=15))

#esempio 2

class ContoBancario:

    total_accounts = 0

    def __init__(self, iban, saldo, nome):
        self.iban = iban
        self.saldo = saldo
        self.nome = nome

        ContoBancario.total_accounts += 1
    
    def deposito(self, importo):
        self.saldo += importo
        print(f'{importo} depositato. Il nuovo saldo è {self.saldo}')
    
    def prelievo(self, importo):
        self.saldo -= importo
        print(f'{importo} prelevato. Il nuovo saldo è {self.saldo}')
    
    @classmethod
    def get_total_accounts(cls):
        print(f'Account totali creati: {cls.total_accounts}')
    
    @staticmethod
    def valida_account(iban):
        if isinstance(iban, int) and len(str(iban)) == 10:
            print('iban valido')
            return True
        else:
            print('iban non valido')
            return  False

account1 = ContoBancario(123345567890, 0, 'Alice')
account2 = ContoBancario(9876543210, 1000, 'Bob')
account3 = ContoBancario(9876543210, 1000, 'Bob')

account1.deposito(500)
account1.prelievo(200)


account2.deposito(200)
account2.prelievo(150)

ContoBancario.get_total_accounts()

ContoBancario.valida_account(1234567890)
ContoBancario.valida_account('123445ABCD')