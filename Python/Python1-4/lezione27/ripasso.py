def merge_dictionaries(dict1: dict, dict2: dict) -> dict:
    for key,value in dict2.items():
        if key in dict1:
            dict1[key] += value
        else:
            dict1[key] = value
    return dict1

print(merge_dictionaries({'x': 5}, {'c': -5}))
######################################################################################################
def lista_a_dizionario(tuples: tuple) -> dict[str:list[int]]:
    dizionario = {}
    for i in tuples:
        if i[0] not in dizionario:
            dizionario[i[0]] = [i[1]]
        else:
            dizionario[i[0]].append(i[1])
    return dizionario       
    
print(lista_a_dizionario([('a', 1), ('b', 2), ('a', 3)]))
##################################################################################
def transform(x: int) -> int:
    if x % 2 == 0:
        x /= 2
        return x
    else:
        return (x*3)-1
print(transform(4))
###############################################################################################
def filtra_e_mappa(prodotti: dict[str:float]) -> dict[str:float]:
    new_prodotti:dict = {}
    for key,value in prodotti.items():
        if value > 20:
            sconto = value/100*10
            value -= sconto
            new_prodotti[key] = value
    return new_prodotti
print(filtra_e_mappa({'Penna': 15.0, 'Zaino': 50.0, 'Quaderno': 22.0}))
######################################################################
def frequency_dict(elements: list) -> dict:
    dizionario:dict = {}
    for i in elements:
        if i not in dizionario:
            dizionario[i] = 1
        else:
            dizionario[i] +=1
    return dizionario
print(frequency_dict(['mela', 'banana', 'mela', 'mela', 'mela']))
###########################################################################


	




'''
class RecipeManager:

    def __init__(self):

        self.dizionario:dict = {}
    
    def create_recipe(self, name:str ,ingredients:list):
        self.name = name
        self.ingredients = ingredients
        if name not in self.dizionario:
            self.dizionario[name] = ingredients
            return self.dizionario
        else:
            return "La ricetta esiste"
    

    def add_ingredient(self, recipe_name:str, ingredient:str):
        recipe_name = self.name
        if recipe_name in self.dizionario:
            if ingredient not in self.ingredients:
                self.ingredients.append(ingredient)
                return self.dizionario
            else:
                return "L'ingrediente esiste già"
    
    
    def remove_ingredient(self, recipe_name:str, ingredient:str):
        self.ingredient = ingredient
        if recipe_name in self.dizionario:
            if ingredient in self.ingredients:
                self.ingredients.remove(ingredient)
                return self.ingredients
            else:
                return "L'ingrediente non esiste"
    
    
    def update_ingredient(self, recipe_name:str, old_ingredient:str, new_ingredient:str):
        if recipe_name in self.dizionario:
            self.remove_ingredient(recipe_name, old_ingredient)
            self.add_ingredient(recipe_name, new_ingredient)
            self.ingredients[-1], self.ingredients[-2] = self.ingredients[-2], self.ingredients[-1]
            return self.dizionario
        else:
            return "L'ingrediente non esiste"
    
    def list_recipes(self):
        for self.recipe_name, self.ingredients in self.dizionario.items():
            return f"{self.recipe_name}, {self.ingredients}"
    

    def list_ingredients(self, recipe_name:str):
        if recipe_name in self.dizionario:
            return self.ingredients
    

    def search_recipe_by_ingredient(self, ingredient:str):
        if self.recipe_name in self.dizionario:
            if ingredient in self.ingredients:
                return [self.recipe_name]
            else:
                return "Nessuna ricetta contiene l'ingrediente"            

    

    

    

    

manager = RecipeManager()
print(manager.create_recipe("Pizza Margherita", ["Farina", "Acqua", "Lievito", "Pomodoro", "Mozzarella"]))
print(manager.add_ingredient("Pizza Margherita", "Basilico"))
print(manager.remove_ingredient("Pizza Margherita", "Acqua"))
print(manager.update_ingredient("Pizza Margherita", "Mozzarella", "Mozzarella di Bufala"))
print(manager.list_ingredients("Pizza Margherita"))
print(manager.list_recipes())
print(manager.search_recipe_by_ingredient("Basilico"))



###################################################################################################
class Account:
    def __init__(self, account_id:str):
       
        self.account_id = account_id
        self.balance = 0
      
    def deposit(self, amount:float):
        
        self.balance += amount
    
    def get_balance(self):
        
        return self.balance
        

class Bank:
    def __init__(self):
        
        self.accounts:dict[str, Account] = {}
    
    def create_account(self, account_id:str):
        self.accounts[account_id] = Account(account_id)
            
    
    def deposit(self, account_id: str, amount: float):
        self.accounts[account_id].deposit(amount)
    
    def get_balance(self, account_id: str) -> float:
         return self.accounts[account_id].get_balance()

bank = Bank()
account1 = bank.create_account("123")
bank.deposit("123",100)
print(bank.get_balance("123"))


##############################################################################################################à
class Member:
    def __init__(self, member_id:str, name:str):
        self.member_id = member_id
        self.name = name
        self.borrowed_books:list[Book] = []
    
    def borrow_book(self, book:str):
        if book not in self.borrowed_books:
            self.borrowed_books.append(book)
    
    def return_book(self, book:str):
        if book in self.borrowed_books:
            self.borrowed_books.remove(book)

class Book:
    def __init__(self, book_id:str, title:str, author:str):
        self.book_id = book_id
        self.title = title
        self.author = author
        self.is_borrowed:bool = False
    
    def borrow(self):
        if self.is_borrowed:
            print("Libro non in prestito")
        else:
            self.is_borrowed == True
    
    def return_book(self):
        if self.is_borrowed == True:
            print("Libro restituito")
        else:
            self.is_borrowed
        

class Library:
    def __init__(self):
        self.books: dict[str, Book] = {}
        self.members: dict[str, Member] = {}
    
    def add_book(self, book_id: str, title: str, author: str):
        self.books[book_id] = Book(book_id, title, author)
        print(self.books)
    
    def register_member(self, member_id:str, name: str):
        self.members[member_id] = Member(member_id, name)
        print(self.books)
    
    def borrow_book(self, member_id: str, book_id: str):
        print(self.members[member_id].borrow_book(book_id))
    
    def return_book(self, member_id: str, book_id: str):
        print(self.members[member_id].return_book(book_id))

library = Library()

library.add_book("B001", "The Great Gatsby", "F. Scott Fitzgerald")
library.add_book("B002", "1984", "George Orwell")
library.add_book("B003", "To Kill a Mockingbird", "Harper Lee")

# Register members
library.register_member("M001", "Alice")
library.register_member("M002", "Bob")
library.register_member("M003", "Charlie")

# Borrow books
library.borrow_book("M001", "B001")
library.borrow_book("M002", "B002")

library.return_book("M001", "B001")
library.return_book("M002", "B002")

###############################################################################################################àà
class Movie:

    def __init__(self, movie_id:str, title:str, director:str):
        self.movie_id = movie_id
        self.title = title
        self.director = director
        self.is_rented:bool = False
    
    def rent(self):
        if self.is_rented:
            self.is_rented == True
        else:
            print(f"Il film {self.title} è gia noleggiato.")
    
    def return_movie(self):
        if self.is_rented == True:
            self.is_rented == False
        else:
            print(f"Il film {self.title} non è attualmente noleggiato.")

class Customer:

    def __init__(self, customer_id:str, name:str):
        self.customer_id = customer_id
        self.name = name
        self.rented_movies:list[Movie] = []
    
    def rent_movie(self, movie:Movie):
        if movie not in self.rented_movies:
            self.rented_movies.append(movie)
        else:
            print(f"Il film {movie.title} è gia noleggiato")
    
    def return_movie(self, movie:Movie):
        if movie in self.rented_movies:
            self.rented_movies.remove(movie)
        else:
            print(f"Il film {movie.title} non è stato noleggiato da questo cliente")
    
class VideoRentalStore:
'''