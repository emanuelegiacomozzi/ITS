from abc import ABC, abstractmethod

class CodificatoreMessaggio(ABC):

    @abstractmethod
    def codifica(testoInChiaro:str):
        pass

class DecodificatoreMessaggio(ABC):

    @abstractmethod
    def decodifica(testoCodificato:str):
        pass

class CifratoreAScorrimento(CodificatoreMessaggio, DecodificatoreMessaggio):

    def __init__(self,chiave:int) -> None:
        CodificatoreMessaggio().__init__()
        self.chiave = chiave
    
    def codifica(self,testoInChiaro):

        
        for i in range(len(testoInChiaro)):
            pass

    