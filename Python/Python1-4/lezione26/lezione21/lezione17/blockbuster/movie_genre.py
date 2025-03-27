from blockbuster.film import Film

class Azione(Film):

    def __init__(self, id: int, title: str):
        super().__init__(id, title)
        self.__genere:str = "Azione"
        self.__penale:float = 3.0
    
    def getGenere(self):

        return self.__genere

    def getPenale(self):

        return self.__penale
    
    def calcolaPenaleRitardo(self, giorni:int):

        self.__penale *= giorni
        return self.__penale

class Commedia(Film):

    def __init__(self, id: int, title: str):
        super().__init__(id, title)
        self.__genere:str = "Commedia"
        self.__penale:float = 2.50
    
    def getGenere(self):

        return self.__genere

    def getPenale(self):

        return self.__penale
    
    def calcolaPenaleRitardo(self, giorni:int):

        self.__penale *= giorni
        return self.__penale

class Drama(Film):

    def __init__(self, id: int, title: str):
        super().__init__(id, title)
        self.__genere:str = "Drama"
        self.__penale:float = 2.0

    def getGenere(self):

        return self.__genere

    def getPenale(self):

        return self.__penale
    
    def calcolaPenaleRitardo(self, giorni:int):

        self.__penale *= giorni
        return self.__penale

        

