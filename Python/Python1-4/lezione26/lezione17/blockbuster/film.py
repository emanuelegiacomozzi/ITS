class Film:

    def __init__(self, id:int, title:str):

        self.__id = id
        self.__title = title
    
    def setID(self, id:int):

        self.__id = id
    
    def SetTitle(self, title:str):

        self.__title = title
    
    def getId(self):

        return self.__id
    
    def getTitle(self):

        return self.__title
    
    def isEqual(self, otherFilm:str):

        if self.getId() == otherFilm.getId():
            return True
        else:
            return False
    
           
