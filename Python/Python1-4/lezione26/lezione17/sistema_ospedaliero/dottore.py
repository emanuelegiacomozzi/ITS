from persona import Persona 

class Dottore(Persona):

    def __init__(self, first_name: str, last_name: str,specialization:str, parcel:float):
        super().__init__(first_name, last_name)

        self.specialization = specialization
        self.parcel = parcel

        if type(specialization) != str:
            self.specialization = None
            print("La specializzazione inserita non è una stringa!")
        
        if type(parcel) != float:
            self.parcel = None
            print("La parcella inserita non è un float")
    
    def setSpecialization(self, specialization:str):

        if type(specialization) == str:
            self.specialization = specialization
        else:
            print("La specializzazione inserita non è una stringa")
    
    def setParcel(self, parcel:float):

        if type(parcel) == float:
            self.parcel = parcel
        else:
            print("La parcel inserita non è un float")
    
    def getSpecialization(self):

        return self.specialization

    def getParcel(self):

        return self.parcel
    
    def isAValidDoctor(self):

        if self.age > 30:
            print(f"Doctor {self.first_name} {self.last_name} is valid!")
        else:
            print(f"Doctor {self.first_name} {self.last_name} is not valid!") 

    def doctorGreet(self):

        super().greet()
        print(f"Sono un medico {self.specialization}")  

