class Persona:

    def __init__(self, first_name:str, last_name:str):

        if type(first_name) != str:
            self.first_name = None
            print("Il nome inserito non è una stringa")
        else:
            self.first_name = first_name

        if type(last_name) != str:
            self.last_name = None
            print("Il cognome inserito non è una stringa")
        else:
            self.last_name = last_name

        if type(first_name) == str and type(last_name) == str:
            self.age = 0
        else:
            self.age = None
        
    def setName(self, first_name:str):
        
        if type(first_name) == str:
            self.first_name = first_name
        else:
            print("Il nome inserito non è una stringa")
    
    def setLastName(self, last_name:str):

        if type(last_name) == str:
            self.last_name = last_name
        else:
            print("Il cognome inserito non è una stringa")
    
    def setAge(self, age:int):

        if type(age) == int:
            self.age = age
        else:
            print("L'età deve essere un numero intero")
    
    def greet(self):

        print(f"Ciao, sono {self.first_name} {self.last_name}! Ho {self.age} anni")









        
