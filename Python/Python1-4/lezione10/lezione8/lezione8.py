#animal = specie, età
#studente = matricola
#persona = nome,età, cf
#cat = nome. età
#rabbit = nome,età

class Animal:
    def __init__(self, nome:str, specie:str, età:int):
        self.nome = nome
        self.specie = specie
        self.età = età
    
    def __str__(self) -> str:
        return f"{self.__class__.__name__}(name={self.nome}, specie={self.specie}, età={self.età})"

class Persona(Animal):
    def __init__(self, nome:str, cognome:str, cf:str, specie: str, età: int):
        super().__init__(nome,specie, età)
        self.cognome = cognome
        self.cf = cf

    def speak(self):
        return f"Ciao mi chiamo {self.nome} {self.cognome} e ho {self.età} anni"

    def __str__(self):
        return f"Persona({self.nome.capitalize()} ,{self.cognome.capitalize()} cf={self.cf}, age={self.età}, specie={self.specie})"
    

class Cat(Animal):
    def __init__(self, nome:str, specie: str, età: int):
        super().__init__(nome,specie, età)
        

class Rabbit(Animal):
    def __init__(self, nome:str, specie:str, età:str):
        super().__init__(nome,specie, età)

class Student(Persona):
    def __init__(self, nome: str, cognome: str, cf: str, specie: str, età: int, matricola:int):
        super().__init__(nome, cognome, cf, specie, età)
        self.matricola = matricola

animale1 = Animal(nome="Willy", specie="Balena", età=60)
persona1 = Persona(nome="Emanuele", cognome="Rossi", cf="PFM4I4FMKRMVMV", età=20, specie="Persona")   
print(animale1)
print(persona1)
print(persona1.speak())
gatto1 = Cat(nome="Fufu", specie="Siamese", età=5)
print(gatto1)
rabbit1 = Rabbit(nome="Gigi", specie="Grigio", età=3)
print(rabbit1)

