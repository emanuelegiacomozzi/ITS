import unittest
import sys
import os

# Aggiungi il percorso del modulo al PYTHONPATH
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from sistema_ospedaliero.persona import Persona
from sistema_ospedaliero.dottore import Dottore
from sistema_ospedaliero.paziente import Paziente
from sistema_ospedaliero.fattura import Fattura

class TestPersona(unittest.TestCase):

    def setUp(self):
        self.person = Persona("Gianni", "Rossi")
    
    def test_inizializzazione(self):
        self.assertEqual(self.person.first_name, "Gianni") #verifica che la condizione sia first_name = stringa
        self.assertEqual(self.person.last_name, "Rossi")
        self.assertEqual(self.person.age, 0) #verifica che la condizione sia age = 0
    
    def test_invalid_first_name(self):
        person = Persona(["Gianni"], "Rossi")
        self.assertIsNone(person.first_name) #verifica che la condizione sia None
        self.assertEqual(person.last_name, "Rossi")
        self.assertIsNone(person.age)
    
    def test_invalid_last_name(self):
        person = Persona("Gianni", 23)
        self.assertEqual(person.first_name, "Gianni")
        self.assertIsNone(person.last_name)
        self.assertIsNone(person.age)

    def test_invalid_last_and_first_name(self):
        person = Persona(["Gianni"], {"Rossi":23})
        self.assertIsNone(person.first_name)
        self.assertIsNone(person.last_name)
        self.assertIsNone(person.age)
    
    def test_setName(self):
        self.person.first_name = "Marco"
        self.assertEqual(self.person.first_name, "Marco")

    def test_setLastName(self):
        self.person.last_name = "Verdi"
        self.assertEqual(self.person.last_name, "Verdi")
    
    def test_setAge(self):
        self.person.age = 34
        self.assertEqual(self.person.age, 34)


class TestDottore(unittest.TestCase):

    def setUp(self):
        self.doctor = Dottore("Mario", "Rossi", "Chirurgo", 100.0)

    def test_inizializzazione_dottore(self):
        self.assertEqual(self.doctor.first_name, "Mario")
        self.assertEqual(self.doctor.last_name, "Rossi")
        self.assertEqual(self.doctor.specialization, "Chirurgo")
        self.assertEqual(self.doctor.parcel, 100.0)
    
    def test_invalid_Specialization(self):
        doctor = Dottore("Mario", "Rossi", ["Chirurgo"], 100.0)
        self.assertIsNone(doctor.specialization)
    
    def test_invalid_Parcel(self):
        doctor = Dottore("Mario", "Rossi", "Chirurgo", 100)
        self.assertIsNone(doctor.parcel)

    def test_isAValidDoctor(self):
        self.doctor.age = 27
        self.doctor.isAValidDoctor()

        self.doctor.age = 30
        self.doctor.isAValidDoctor()

        self.doctor.age = 38
        self.doctor.isAValidDoctor()

class TestPaziente(unittest.TestCase):

    def setUp(self):
        self.paziente = Paziente("Carlo", "Neri", "P001")

    def test_inizializzazione_paziente(self):
        self.assertEqual(self.paziente.first_name, "Carlo")
        self.assertEqual(self.paziente.last_name, "Neri")
        self.assertEqual(self.paziente.idCode, "P001")

class TestFattura(unittest.TestCase):

    def setUp(self):
        self.paziente1 = Paziente("Carlo", "Neri", "P001")
        self.paziente2 = Paziente("Marco", "Rossi", "P002")
        self.paziente3 = Paziente("Dario", "Verdi", "P003")
        self.dottore1 = Dottore("Mario", "Vacci", "Chirurgo", 100.0)
        self.fattura = Fattura([self.paziente1,self.paziente2,self.paziente3], self.dottore1)

    def test_inizializzazione_fattura(self):
        self.assertEqual(self.fattura.patient, [self.paziente1,self.paziente2,self.paziente3])
        self.assertEqual(self.fattura.doctor, self.dottore1)
        self.assertEqual(self.fattura.fatture, 3)
        self.assertEqual(self.fattura.salary, 0)
    
    def test_salario_fatture(self):
        salario = self.fattura.getSalary()
        fatture = self.fattura.getFatture()
        self.assertEqual(salario, 300.0)
        self.assertEqual(fatture, 3)
    
    def test_append_paziente(self):
        new_paziente = Paziente("Giacomo", "Giorgi", "P004")
        self.fattura.addPatient(new_paziente)
        self.assertIn(new_paziente, self.fattura.patient)
        self.assertEqual(self.fattura.getSalary(), 400.0)
        self.assertEqual(self.fattura.getFatture(), 4)
    
    def test_remove_paziente(self):
        self.fattura.removePatient("P002")
        self.assertNotIn(self.paziente2, self.fattura.patient)
        self.assertEqual(self.fattura.getSalary(), 300.0)
        self.assertEqual(self.fattura.getFatture(), 3)


if __name__ == "__main__":
    unittest.main()