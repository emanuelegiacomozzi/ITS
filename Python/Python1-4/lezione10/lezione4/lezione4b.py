'''
8-1. Message: Write a function called display_message() that prints one sentence telling everyone what you are learning about in this chapter. Call the function, and make sure the message displays correctly.
'''
def display_message():
   print("Hello everyone, i'm learning python")
display_message()

'''
8-2. Favorite Book: Write a function called favorite_book() that accepts one parameter, title. The function should print a message, such as "One of my favorite books is Alice in Wonderland". Call the function, making sure to include a book title as an argument in the function call.
'''
def favorite_book(title:str):
   print(f"One of my favorite books is {title} ")
favorite_book("Lord of the rings")

'''
8-3. T-Shirt: Write a function called make_shirt() that accepts a size and the text of a message that should be printed on the shirt. The function should print a sentence summarizing the size of the shirt and the message printed on it. Call the function once using positional arguments to make a shirt. Call the function a second time using keyword arguments.
'''
def make_shirt(size:str, message:str):
   print(f"Size : {size}, {message}")
make_shirt("Large", "made in Vietnam")
size:str = "Large"
message:str = "made in Vietnam"
make_shirt(size, message)

'''
8-4. Large Shirts: Modify the make_shirt() function so that shirts are large by default with a message that reads I love Python. Make a large shirt and a medium shirt with the default message, and a shirt of any size with a different message.
'''
def make_shirt(size:str, message:str="I love Python"):
   print(f"Size : {size}, {message}")
make_shirt("Large")
make_shirt("Medium")
make_shirt("Small","I love Java")

'''
8-5. Cities: Write a function called describe_city() that accepts the name of a city and its country. The function should print a simple sentence, such as Reykjavik is in Iceland. Give the parameter for the country a default value. Call your function for three different cities, at least one of which is not in the default country.
'''
def description_city(city:str, country:str="Spain"):
   print(f"{city} is in {country}")
description_city("Madrid")
description_city("Valencia")
description_city("Roma")

'''
8-6. City Names: Write a function called city_country() that takes in the name of a city and its country. The function should return a string formatted like this: "Santiago, Chile". Call your function with at least three city-country pairs, and print the values that are returned.
'''
def city_country(city:str, country:str):
    s:str = f"{city}, {country}"
    return s
print(city_country("Amsterdam", "Netherland"))
print(city_country("Brasilia", "Brasile"))
print(city_country("Pechino", "Cina"))

'''
8-7. Album: Write a function called make_album() that builds a dictionary describing a music album. The function should take in an artist name and an album title, and it should return a dictionary containing these two pieces of information. Use the function to make three dictionaries representing different albums. Print each return value to show that the  dictionaries are storing the album information correctly. Use None to add an optional parameter to make_album() that allows you to store the number of songs on an album. If the calling line includes a value for the number of songs, add that value to the album’s dictionary. Make at least one new function call that includes the number of songs on an album.
'''
def make_album(artist:str, album:str, songs:int=None):
   artist_album:dict = {"artist": {artist}, "album": {album}}
   if songs:
      artist_album["songs"] = songs
   return artist_album
print(make_album("Bruno Mars", "24K magic"))
print(make_album("Eminem", "The Eminem Show"))
print(make_album("Il Tre", "Invisibili"))
print(make_album("Ed Sheraan", "Divide", songs=14))

'''
8-8. User Albums: Start with your program from Exercise 8-7. Write a while loop that allows users to enter an album’s artist and title. Once you have that information, call make_album() with the user’s input and print the dictionary that’s created. Be sure to include a quit value in the while loop.
'''
def make_album(artist:str, album:str,):
   artist_album:dict = {"artist": {artist}, "album": {album}}
   return artist_album
while True:
   artist:str = input("Artist: ")
   if artist == "quit":
      break
   album:str = input("Album: ")
   if album == "quit":
      break
   print(make_album(artist,album))



'''
8-9. Messages: Make a list containing a series of short text messages. Pass the list to a function called show_messages(), which prints each text message.
'''
def show_messages(messages:list):
   for message in messages:
      print(message)
   return messages
messages:list = ["How are you?", "I'm fine", "Thank you", "What about you?", "I'm fine too"]
show_messages(messages)

'''
8-10. Sending Messages: Start with a copy of your program from Exercise 8-9. Write a function called send_messages() that prints each text message and moves each message to a new list called sent_messages as it’s printed. After calling the function, print both of your lists to make sure the messages were moved correctly.
'''

def send_messages(sent_messages:list):
   for message in messages:
      print(message)
      sent_messages.append(message)
   messages.clear()
   return sent_messages
sent_messages:list = []
print("The elements have been mooved: ", send_messages(sent_messages))
print("Old list: ", messages)

'''
8-11. Archived Messages: Start with your work from Exercise 8-10. Call the function send_messages() with a copy of the list of messages. After calling the function, print both of your lists to show that the original list has retained its messages.
'''
messages:list = ["How are you?", "I'm fine", "Thank you", "What about you?", "I'm fine too"]
copy_messages = messages.copy()
def send_messages(sent_messages:list):
   for message in messages:
      print(message)
      sent_messages.append(message)
   messages.clear()
   return sent_messages
sent_messages:list = []
print("The elements have been mooved: ", send_messages(sent_messages))
print("Copy of messages: ", copy_messages)

'''
8-12. Sandwiches: Write a function that accepts a list of items a person wants on a sandwich. The function should have one parameter that collects as many items as the function call provides, and it should print a summary of the sandwich that’s being ordered. Call the function three times, using a different number of arguments each time.
'''
def sandwiches(*sandwich:list):
   print("The ingredients of sandwich are:\n ")
   for ingredient in sandwich:
      print(ingredient)
sandwich1:list = ["Ham", "Cheese", "Lettuce\n"]
sandwich2:list = ["Turkey", "Swiss Cheese", "Tomato", "Mayonnaise\n"]
sandwich3:list = ["Peanut Butter", "Jelly"]
sandwiches(*sandwich1)
sandwiches(*sandwich2)
sandwiches(*sandwich3)

'''
8-13. User Profile:  Build a profile of yourself by calling build_profile(), using your first and last names and three other key-value pairs that describe you. All the values must be passed to the function as parameters. The function then must return a string such as "Eric Crow, age 45, hair brown, weight 67"
'''
def build_profile(name:str, last_name:str, age:int, height:float, weight:int):
   print(f"Utent profile:\nName: {name}\nLast_name: {last_name}\nAge: {age}\nHeight: {height}\nWeight: {weight}")
build_profile("Emanuele", "Giacomozzi", 19, 1.86, 85)

'''
8-14. Cars: Write a function that stores information about a car in a dictionary. The function should always receive a manufacturer and a model name. It should then accept an arbitrary number of keyword arguments. Call the function with the required information and two other name-value pairs, such as a color or an optional feature. Your function should work for a call like this one: car = make_car('subaru', 'outback', color='blue', tow_package=True) Print the dictionary that’s returned to make sure all the information was stored correctly. 
'''
def cars(manufacturer, model, **info):
   car:dict = {"manufacturer": manufacturer, "model": model}
   car.update(info)
   return car
print(cars("Ferrari", "Magnum pi", color="Red", displacement = 2.927 ))

'''
8-15. Printing Models: Put the functions for the example printing_models.py in a separate file called printing_functions.py. Write an import statement at the top of printing_models.py, and modify the file to use the imported functions.
'''
def make_cars(manufacturer, model, **info):
   car:dict = {"manufacturer": manufacturer, "model": model}
   car.update(info)
   return car


'''
8-16. Imports: Using a program you wrote that has one function in it, store that function in a separate file. Import the function into your main program file, and call the function using each of these approaches:
import module_name
from module_name import function_name
from module_name import function_name as fn
import module_name as mn
from module_name import *
'''
def make_cars(manufacturer, model, **info):
   car:dict = {"manufacturer": manufacturer, "model": model}
   car.update(info)
   return car

'''
8-17. Styling Functions: Choose any three programs you wrote for this chapter, and make sure they follow the styling guidelines described in this section.
'''


   


