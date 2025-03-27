'''
class Pagamento:

    def __init__(self):

        self.__importo:float = 0.0

    def setImporto(self, importo:float):

        self.__importo = importo
    
    def getImporto(self):

        return self.__importo
    
    def dettagliPagamento(self):

        return f"Importo del pagamento: €{self.__importo:.2f}"
    

class PagamentoContanti(Pagamento):

    def __init__(self, importo:float):
        super().__init__()
        self.setImporto(importo)
    
    def dettagliPagamento(self):
        return f"Pagamento in contanti di: €{self.__importo:.2f}"

    def inPezziDa(self):

        banconote:list = [500, 200, 100, 50, 20, 10, 5]
        monete:list = [2,1,0.50,0.20,0.10,0.05,0.01]
        importo = self.getImporto()
        for banconota in banconote:
            pezzi_banconota = importo//banconota
            importo = round(importo - pezzi_banconota * banconota, 2)
        
class PagamentoCartaDiCredito(Pagamento):

    def __init__(self, titolare_carta:str, data:str, num_carta:int):
        super().__init__()
        self.titolare_carta = titolare_carta
        self.data = data
        self.num_carta = num_carta

    def dettagliPagamento(self):
        return f"Pagamento di: €{self.importo:.2f} effettuato con la carta di credito\nNome sulla carta: {self.titolare_carta}\nData di scadenza: {self.data}\nNumero della carta: {self.num_carta}"

carta_credito = PagamentoCartaDiCredito("Mario Rossi", "12/24", 1234567890123456)
print(carta_credito.dettagliPagamento())
'''



#Rendering grafico
from abc import ABC, abstractmethod

class Forma(ABC):

    def __init__(self, nome:str) -> None:
        self.nome = nome
    
    @abstractmethod
    def getArea():

        pass

    @abstractmethod
    def render():

        pass

class Quadrato(Forma):

    def __init__(self, lenght:float) -> None:
        super().__init__("Quadrato")
        self.lenght = lenght
    
    def getArea(self):

        return self.lenght*self.lenght

    def render(self):

        print(f"Ecco un {self.nome} di lato {self.lenght}")
        for _ in range(self.lenght):
            if _ == 0 or _ == self.lenght-1:
                print("*" * self.lenght)
            else:
                print("*" + ' '* (self.lenght-2) + '*')
        print(f"L'area di questo quadrato vale: {self.getArea()}")
        
quadrato = Quadrato(6)
quadrato.render()

class Rettangolo(Forma):

    def __init__(self, base:float, altezza:float) -> None:
        super().__init__("Rettangolo")

        self.base = base
        self.altezza = altezza
    
    def getArea(self):
        return self.base * self.altezza

    def render(self):

        print(f"Ecco un {self.nome} avente base {self.base} ed altezza {self.altezza}!")
        for _ in range(self.altezza):
            if _ == 0 or _ == self.altezza - 1:
                print('*' * self.base)
            else:
                print('*' + ' ' * (self.base-2) + '*' )

        print(f"L'area di questo rettangolo vale: {self.getArea()}")

rettangolo = Rettangolo(8, 4)
rettangolo.render()

class Triangolo(Forma):

    def __init__(self,cateto1:float, cateto2:float) -> None:
        super().__init__("Triangolo")

        self.cateto1 = cateto1
        self.cateto2 = cateto2
    
    def getArea(self):

        return (self.cateto1 * self.cateto2) / 2
       
    def render(self):

        print(f"Ecco un {self.nome} avente base {self.cateto1} ed altezza {self.cateto2}")
        for _ in range(self.cateto2):
            if _ == 0:
                print('*')
            elif _ == self.cateto1 - 1:
                print('*' * self.cateto1)
            elif _ == 1 :
                print('*' + '*')
            else:
                print('*' + ' ' + '*')

triangolo = Triangolo(4,4)
triangolo.render()


                    

            
            
        
            







