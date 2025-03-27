'''
8-15. Printing Models: Put the functions for the example printing_models.py in a separate file called printing_functions.py. Write an import statement at the top of printing_models.py, and modify the file to use the imported functions.
'''
from lezione4b import make_cars

car = make_cars("Ferrari", "Magnum pi", color="Red", displacement = 2.927)
print(car)

'''
8-16. Imports: Using a program you wrote that has one function in it, store that function in a separate file. Import the function into your main program file, and call the function using each of these approaches:
import module_name
from module_name import function_name
from module_name import function_name as fn
import module_name as mn
from module_name import *
'''
import lezione4b
car = lezione4b.make_cars("Subaru", "Impreza", color="Black", displacement = 1.344)
print(car)

from lezione4b import make_cars
car = make_cars("Subaru", "Crosstrek", color="White", displacement = 1.345)
print(car)

from lezione4b import make_cars as mc
car = mc("Ferrari", "Magnum pi", color="Red", displacement = 2.927)
print(car)

import lezione4b as lb
car = lb.make_cars("Porsche718", "Cayman", color="Black", displacement = 2.450)
print(car)

from lezione4b import *
car = make_cars("Lamborghini", "Urus", color="Blue", displacement = 2.900)
print(car) 
