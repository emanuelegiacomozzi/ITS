import unittest #libreria unittest
#from ..ripasso.ripasso import Calc
from ripasso.ripasso import Calc

class TestCalculations(unittest.TestCase): #TestCase è una classe di unittest, contiene le funzioni seguenti

    def setUp(self): #equivale ad init
        self.calculation = Calc(8,2)

    def test_sum(self):
        self.assertEqual(self.calculation.get_sum(), 10, 'The sum is wrong')

    def test_sum(self):
        self.assertEqual(self.calculation.get_sum(), 7, 'The sum is wrong')

if __name__ == "__main__":
    unittest.main