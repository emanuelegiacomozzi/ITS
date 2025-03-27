class Student:
    def __init__(self,name:str, studyProgram:str):
        self.name = name
        self.studyProgram = studyProgram
        self.age = None
        self.gender = None
    
    def __str__(self):
        return f"Student(name={self.name},studyProgram={self.studyProgram}, age={self.age}, gender={self.gender})"

    def set_age(self, new_age:int):
        self.age = new_age
    
    def set_gender(self, new_gender:str):
        self.gender = new_gender

emanuele = Student("Emanuele", "Python")
alessandro = Student("Alessandro", "Python")
michele = Student("Michele", "Java")
emanuele.set_age(19)
emanuele.set_gender("M")
alessandro.set_age(25)
alessandro.set_gender("M")
michele.set_age(22)
michele.set_gender("M")
print(emanuele)
print(alessandro)
print(michele)

#esercizio 2
class Animal:
    def __init__(self, name:str):
        self.name = name
        self.legs = None
    
    def set_legs(self, new_legs:int):
        self.legs = new_legs
    
    def get_legs(self):
        return self.legs

    def __str__(self):
        return f"Animal(name={self.name}, lengs={self.legs})"

cane = Animal("Cane")
gatto = Animal("Gatto")
cane.set_legs(4)
gatto.set_legs(4)
print(cane)
print(gatto)

#esercizio 3
class Food:
    def __init__(self,name:str,price:float,description:str):
        self.name = name
        self.price = price
        self.description = description
    
    def __str__(self) -> str:
        return f"{self.name.capitalize()}(price={self.price}, description={self.description})"
    

class Menu:
    def __init__(self,foods:list = []):
        self.foods = foods
   
    def add_food(self, food:Food):
        self.foods.append(food)
    
    def remove_food(self, food:Food):
        if food in self.foods:
            self.foods.remove(food)

pizza = Food("Margherita", 7.00 , "Pomodoro e mozzarella")
pasta = Food("Carbonara", 12.50, "Guanciale, uova e pecorino")
dolce = Food("Cornetto", 3.00, "Cornetto alla crema")
menu = Menu()
menu.add_food(pizza)
menu.add_food(pasta)
print(pizza)
print(pasta)
print(dolce)

'''
9-1. Restaurant: Make a class called Restaurant. The __init__() method for Restaurant should store two attributes: a restaurant_name and a cuisine_type. Make a method called describe_restaurant() that prints these two pieces of information, and a method called open_restaurant() that prints a message indicating that the restaurant is open. Make an instance called restaurant from your class. Print the two attributes individually, and then call both methods.
9-2. Three Restaurants: Start with your class from Exercise 9-1. Create three different instances from the class, and call describe restaurant() for each instance.
'''
class Restaurant:
    def __init__(self,name:str,cuisine_type:str):
        self.name = name
        self.cuisine_type = cuisine_type
    
    def description_restaurant(self):
        return f"{self.name.capitalize()}, {self.cuisine_type.capitalize()}"
    
    def open_restaurant(self):
        return f"The restaurant {self.name} is open"

restaurant = Restaurant("Da Pippo", "Pizzeria")
restaurant1 = Restaurant("Carbonaro", "Roman cuisine")
restaurant2 = Restaurant("Mario", "Napoletan cuisine")
print(restaurant.description_restaurant())
print(restaurant1.description_restaurant())
print(restaurant2.description_restaurant())
print(restaurant.open_restaurant())

'''
9-3. Users: Make a class called User. Create two attributes called first_name and last_name, and then create several other attributes that are typically stored in a user profile. Make a method called describe_user() that prints a summary of the user’s information. Make another method called greet_user() that prints a personalized greeting to the user. Create several instances representing different users, and call both methods for each user.
9-5. Login Attempts: Add an attribute called login_attempts to your User class from Exercise 9-3. Write a method called increment_login_attempts() that increments the value of login_attempts by 1. Write another method called reset_login_attempts() that resets the value of login_attempts to 0. Make an instance of the User class and call increment_login_attempts() several times. Print the value of login_attempts to make sure it was incremented properly, and then call reset_login_attempts(). Print login_attempts again to make sure it was reset to 0.
'''
class User:
    def __init__(self, first_name:str, last_name:str, password:str, login_attempts:int):
        self.first_name = first_name
        self.last_name = last_name
        self.password = password
        self.login_attempts = login_attempts
    
    def description_user(self):
        return f"First name = {self.first_name}\nLast name = {self.last_name}\nPassword = {self.password}\nLogin attempts = {self.login_attempts}"
    
    def greet_user(self):
        return f"Hello {self.first_name.capitalize()}, welcome on our site"
    
    def increment_login_attempts(self):
        self.login_attempts += 1
    
    def reset_login_attempts(self, new_login_attempts = 0):
        self.login_attempts = new_login_attempts
    
user = User("Marco", "Rossi", "VzXe45%",11)
user1 = User("Mario", "Verdi", "HGTyu76",13)
user2 = User("Laura", "Neri", "ERWLAu7",15)
print(user.description_user())
print(user.greet_user())
print()
print(user1.description_user())
print(user1.greet_user())
print()
print(user2.description_user())
print(user2.greet_user())
user3 = User("Gianni", "Storti", "Hertu74", 10)
user3.increment_login_attempts()
user3.increment_login_attempts()
user3.increment_login_attempts()
user3.increment_login_attempts()
print(user3.description_user())
user3.reset_login_attempts()
print(user3.description_user())

'''
9-4. Number Served: Start with your program from Exercise 9-1. Add an attribute called number_served with a default value of 0. Create an instance called restaurant from this class. Print the number of customers the restaurant has served, and then change this value and print it again. Add a method called set_number_served() that lets you set the number of customers that have been served. Call this method with a new number and print the value again. Add a method called increment_number_served() that lets you increment the number of customers who’ve been served. Call this method with any number you like that could represent how many customers were served in, say, a day of business. 
'''

class Restaurant:
    def __init__(self,name:str,cuisine_type:str, number_served=0):
        self.name = name
        self.cuisine_type = cuisine_type
        self.number_served = number_served
    
    def description_restaurant(self):
        return f"{self.name}, {self.cuisine_type}, {self.number_served}"
    
    def open_restaurant(self):
        return f"The restaurant {self.name} is open"
    
    def set_number_served(self,new_number_served:int):
        self.number_served = new_number_served
    
    def increment_number_served(self):
        self.number_served += 23


restaurant = Restaurant("Da Pippo", "Pizzeria", number_served=20)
print(restaurant.description_restaurant())
restaurant.set_number_served(22)
print(restaurant.description_restaurant())
restaurant.increment_number_served()
print(restaurant.description_restaurant())

'''
9-6. Ice Cream Stand: An ice cream stand is a specific kind of restaurant. Write a class called IceCreamStand that inherits from the Restaurant class you wrote in Exercise 9-1  or Exercise 9-4. Either version of the class will work; just pick the one you like better. Add an attribute called flavors that stores a list of ice cream flavors. Write a method that displays these flavors. Create an instance of IceCreamStand, and call this method.
'''

class Restaurant:
    def __init__(self,name:str,cuisine_type:str):
        self.name = name
        self.cuisine_type = cuisine_type
    
    def description_restaurant(self):
        return f"{self.name.capitalize()}, {self.cuisine_type.capitalize()}"
    
    def open_restaurant(self):
        return f"The restaurant {self.name} is open"

restaurant = Restaurant("Da Pippo", "Pizzeria")
print(restaurant.description_restaurant())
print(restaurant.open_restaurant())

class IceCreamStand(Restaurant):
    def __init__(self, name: str, cuisine_type: str, flavors:list):
        super().__init__(name, cuisine_type)
        self.flavors = flavors
    
    def __str__(self):
        return super().__str__()

ice_cream = IceCreamStand("Da Pippo", "Pizzeria", ["chocolate","strawberry","vanilla"])
print(ice_cream.flavors)

'''
9-7. Admin: An administrator is a special kind of user. Write a class called Admin that inherits from the User class you wrote in Exercise 9-3 or Exercise 9-5. Add an attribute, privileges, that stores a list of strings like "can add post", "can delete post", "can ban user", and so on. Write a method called show_privileges() that lists the administrator’s set of privileges. Create an instance of Admin, and call your method. 
'''

class User:
    def __init__(self, first_name:str, last_name:str, password:str, login_attempts:int):
        self.first_name = first_name
        self.last_name = last_name
        self.password = password
        self.login_attempts = login_attempts
    
    def description_user(self):
        return f"First name = {self.first_name}\nLast name = {self.last_name}\nPassword = {self.password}\nLogin attempts = {self.login_attempts}"
    
    def greet_user(self):
        return f"Hello {self.first_name.capitalize()}, welcome on our site"
    
    def increment_login_attempts(self):
        self.login_attempts += 1
    
    def reset_login_attempts(self, new_login_attempts = 0):
        self.login_attempts = new_login_attempts

class Admin(User):
    def __init__(self, first_name: str, last_name: str, password: str, login_attempts: int, privileges:list[str]):
        super().__init__(first_name, last_name, password, login_attempts)
        self.privileges = privileges

    def show_privileges(self):
        for privilege in self.privileges:
            print(privilege)

    
user = User("Marco", "Rossi", "VzXe45%",11)
user1 = User("Mario", "Verdi", "HGTyu76",13)
user2 = User("Laura", "Neri", "ERWLAu7",15)
print(user.description_user())
print(user.greet_user())
print()
print(user1.description_user())
print(user1.greet_user())
print()
print(user2.description_user())
print(user2.greet_user())
user3 = User("Gianni", "Storti", "Hertu74", 10)
user3.increment_login_attempts()
user3.increment_login_attempts()
user3.increment_login_attempts()
user3.increment_login_attempts()
print(user3.description_user())
user3.reset_login_attempts()
print(user3.description_user())
admin = Admin("Franco", "Franchi", "000000", 10, ["You can eliminate post", "You can add post", "You can exclude a post"])
admin.show_privileges()


'''
9-8. Privileges: Write a separate Privileges class. The class should have one attribute, privileges, that stores a list of strings as described in Exercise 9-7. Move the show_privileges() method to this class. Make a Privileges instance as an attribute in the Admin class. Create a new instance of Admin and use your method to show its privileges.
'''
class User:
    def __init__(self, first_name:str, last_name:str, password:str, login_attempts:int):
        self.first_name = first_name
        self.last_name = last_name
        self.password = password
        self.login_attempts = login_attempts
    
    def description_user(self):
        return f"First name = {self.first_name}\nLast name = {self.last_name}\nPassword = {self.password}\nLogin attempts = {self.login_attempts}"
    
    def greet_user(self):
        return f"Hello {self.first_name.capitalize()}, welcome on our site"
    
    def increment_login_attempts(self):
        self.login_attempts += 1
    
    def reset_login_attempts(self, new_login_attempts = 0):
        self.login_attempts = new_login_attempts

class Admin(User):
    def __init__(self, first_name: str, last_name: str, password: str, login_attempts: int, privileges:list[str]):
        super().__init__(first_name, last_name, password, login_attempts)
        self.privileges = Privileges(privileges)

    def show_privileges(self):
        self.privileges.show_privileges()

class Privileges:

    def __init__(self, privileges:list[str]):
        self.privileges = privileges
        
    def show_privileges(self):
        print("Privileges: ")
        for privilege in self.privileges:
            print(privilege)


admin = Admin("Franco", "Franchi", "000000", 10, ["You can eliminate post", "You can add post", "You can exclude a post"])
admin.show_privileges()

'''
9-10. Imported Restaurant: Using your latest Restaurant class, store it in a module. Make a separate file that imports Restaurant. Make a Restaurant instance, and call one of Restaurant’s methods to show that the import statement is working properly.
'''

'''
9-11. Imported Admin: Start with your work from Exercise 9-8. Store the classes User, Privileges, and Admin in one module. Create a separate file, make an Admin instance, and call show_privileges() to show that everything is working correctly.
'''

'''
9-13. Dice: Make a class Die with one attribute called sides, which has a default value of 6. Write a method called roll_die() that prints a random number between 1 and the number of sides the die has. Make a 6-sided die and roll it 10 times. Make a 10-sided die and a 20-sided die. Roll each die 10 times.
'''
import random 

class Die:
    def __init__(self,sides:int=6):
        self.sides = sides
    
    def roll_die(self):
        return random.randint(1,self.sides)

die6 = Die()
print("roll a 6 die 10 times:")
for side in range(10):
    print(die6.roll_die())

die10 = Die(10)
print("\nroll a 10 die 10 times:")
for side in range(10):
    print(die10.roll_die())

die20 = Die(20)
print("\nroll a 20 die 10 times:")
for side in range(10):
    print(die20.roll_die())




