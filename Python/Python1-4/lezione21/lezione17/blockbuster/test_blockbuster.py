import unittest

import sys
import os

# Aggiungi il percorso del modulo al PYTHONPATH
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from movie_genre import Azione, Commedia, Drama
from noleggio import Noleggio

class TestFilm(unittest.TestCase):

    def setUp(self):
        self.filmA1 = Azione(1000, "Jumanji")
        self.filmA2 = Azione(1001, "Avengers")
        self.filmA3 = Azione(1002, "Matrix")
        self.filmA4 = Azione(1003, "Fast and Furious")
        self.filmA5 = Azione(1004, "Terminator")
        self.filmC1 = Commedia(2001, "Una notte da leoni")
        self.filmC2 = Commedia(2002, "Un weekend da bamboccioni")
        self.filmC3 = Commedia(2003, "Così è la vita")
        self.filmC4 = Commedia(2004, "Tre uomini e una gamba")
        self.filmD1 = Drama(3001, "La vita è bella")
        self.film_list = [self.filmA1, self.filmA2, self.filmA3, self.filmA4, self.filmA5, self.filmC1, self.filmC2, self.filmC3, self.filmC4, self.filmD1]
        self.noleggio = Noleggio(self.film_list)
    
    def test_isAvaible_True(self):

        self.assertTrue(self.noleggio.isAvaible(self.filmA1))
    
    def test_isAvaible_False(self):

        self.film_list.remove(self.filmA1)
        self.assertFalse(self.noleggio.isAvaible(self.filmA1))
    
    def test_rentAMovie(self):

        clientID = "C001"
        self.noleggio.rentAMovie(self.filmA2, clientID)
        self.assertIn(self.filmA2, self.noleggio.rented_film[clientID])
    
    def test_noleggio(self):
        clientID1 = "C001"
        clientID2 = "C002"
        self.noleggio.rentAMovie(self.filmA1, clientID1)
        self.assertIn(self.filmA1, self.noleggio.rented_film[clientID1])
        self.noleggio.rentAMovie(self.filmA1, clientID2)
    
    def test_giveBack(self):
        clientID1 = "C001"
        self.noleggio.rentAMovie(self.filmA3, clientID1)
        self.assertIn(self.filmA3, self.noleggio.rented_film[clientID1])
        self.noleggio.giveBack(self.filmA3, clientID1, 10)
        self.assertTrue(self.noleggio.isAvaible(self.filmA3))
        self.assertNotIn(self.filmA3, self.noleggio.rented_film[clientID1])

    def test_penale_ritardo(self):

        self.filmA1.calcolaPenaleRitardo(10)
        self.assertEqual(self.filmA1.getPenale(), 30.00)
        self.filmC1.calcolaPenaleRitardo(2)
        self.assertEqual(self.filmC1.getPenale(), 5.00)
        self.filmD1.calcolaPenaleRitardo(4)
        self.assertEqual(self.filmD1.getPenale(), 8.00)

    def test_printMovies(self):

        self.noleggio.printMovies()
        self.assertEqual(self.filmA1.getTitle(), "Jumanji")
    
    def test_printRentMovies(self):

        client = "C004"
        self.noleggio.rentAMovie(self.filmC3, client)
        self.noleggio.rentAMovie(self.filmD1, client)
        self.noleggio.printRentMovies(client)
    
    

        



if __name__=="__main__":
    unittest.main()
