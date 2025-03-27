from dottore import Dottore
from paziente import Paziente

class Fattura:

    def __init__(self, patient:list[Paziente], doctor:Dottore):
        
        self.patient = patient
        self.doctor = doctor
        if doctor.isAValidDoctor():
            self.fatture:int = len(patient)
            self.salary:int = 0
        else:
            self.patient = self.doctor = self.fatture = self.salary = None
            print("Non è possibile creare la classe fattura poichè il dottore non è valido!")
    
    def getSalary(self):
        
        if self.patient is not None :
            self.salary = self.doctor.getParcel() * len(self.patient)
            return self.salary
        else:
            return None
    
    def getFatture(self):

        if self.patient is not None:
            self.fatture = len(self.patient)
            return self.fatture
        else:
            return None
    
    def addPatient(self, newPatient:Paziente):
        self.patient.append(newPatient)
        self.getSalary()
        self.getFatture()
        print(f"Alla lista del Dottor {self.doctor} è stato aggiunto il paziente {newPatient.getidCode}")
    
    def removePatient(self, idCode:str):
        if self.patient is not None:
            patient_to_remove = None
            for patient in self.patient:
                if patient.idCode == idCode:
                    patient_to_remove = patient
                    break
                if patient_to_remove:
                    self.patient.remove(patient_to_remove)
                    self.getSalary()
                    self.getFatture()
                    print(f"Alla lista del Dottor {self.doctor} è stato rimosso il paziente {idCode}")


