#ereditarietà

class Person:

    def __init__(self, name:str, surname:str, date_of_birth:str, gender:str, codice_fiscale:str) -> None:
        self.name:str = name
        self.surname:str = surname
        self.date_of_birth:str = date_of_birth
        self.gender:str = gender
        self.codice_fiscale:str = codice_fiscale

    def calculate_age(self) -> int:

        return 10
    
    def __eq__(self, value: object) -> bool:
        
        return value.codice_fiscale == self.codice_fiscale

person1:Person = Person(name="Emanuele", 
                        surname="Giacomozzi",
                        date_of_birth="14/04/2004",
                        gender="Man")


class Dipendente(Person):

    def __init__(self, name: str, surname: str, date_of_birth: str, gender: str, ore_lavorate:int) -> None:
        super().__init__(name, surname, date_of_birth, gender)
        self.ore_lavorate:int = ore_lavorate

    def calcola_stipendio(self)->float:

        return 500.0
    
    def __str__(self) -> str:
        return super().__str__()

dipendente1: Dipendente = Dipendente(name="Emanuele", 
                        surname="Giacomozzi",
                        date_of_birth="14/04/2004",
                        gender="Man",
                        ore_lavorate=500)


class Professore(Dipendente):

    def __init__(self, name: str, surname: str, date_of_birth: str, gender: str, ore_lavorate: int, materia_insegnata:str, ore_lezione:int) -> None:
        super().__init__(name, surname, date_of_birth, gender, ore_lavorate)

        self.materia_insegnata:str = materia_insegnata
        self.ore_lezione:int = ore_lezione
    
    def __str__(self) -> str:
        return f"Professor {self.name} {self.surname}"

professore1:Professore = Professore(name="Emanuele", 
                        surname="Giacomozzi",
                        date_of_birth="14/04/2004",
                        gender="Man",
                        ore_lavorate=500,
                        materia_insegnata="Arte",
                        ore_lezione = 70)

print(person1.calculate_age())

print(dipendente1.ore_lavorate)
print(dipendente1.name)
print(dipendente1.calculate_age())
print(dipendente1.calcola_stipendio())


print(professore1.ore_lezione)
