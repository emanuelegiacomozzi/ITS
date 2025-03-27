'''
4-1. Pizzas: Think of at least three kinds of your favorite pizza. Store these pizza names in a list, and then use a for loop to print the name of each pizza.
• Modify your for loop to print a sentence using the name of the pizza, instead of printing just the name of the pizza. For each pizza, you should have one line of output containing a simple statement like I like pepperoni pizza.
• Add a line at the end of your program, outside the for loop, that states how much you like pizza. The output should consist of three or more lines about the kinds of pizza you like and then an additional sentence, such as I really love pizza!
'''

def pizza_type(pizza:list):
    for elem in pizza:
        print(f"I like the {elem} pizza")
    print("I love pizza")
    return pizza
pizza:list = ["Margherita", "Capricciosa", "Pistacchiosa"]
pizza_type(pizza)

'''
4-2. Animals: Think of at least three different animals that have a common characteristic. Store the names of these animals in a list, and then use a for loop to print out the name of each animal.
• Modify your program to print a statement about each animal, such as A dog would make a great pet.
• Add a line at the end of your program, stating what these animals have in common. You could print a sentence, such as Any of these animals would make a great pet!
'''

def animal_type(animal:list): #i use a function called animal_type that return the animals list
    for elem in animal:
        if elem == "Elephant":
            print(f"The {animal[0]} has fangs") #if the animal in list is the elephant, print this message
        elif elem == "Giraffe":
            print(f"The {animal[1]} has a long neck") #if the animal is the giraffe, print this message
        else:
            print(f"The {animal[2]} lives in the seas") #else print this message
    print("Each of these animals is very big")
    return elem 
animal:list = ["Elephant", "Giraffe", "Whale"]
animal_type(animal)

'''
4-3. Counting to Twenty: Use a for loop to print the numbers from 1 to 20, inclusive.
'''

numbers:int = range(1,21)
for n in numbers:
    print(n)

'''
4-4. One Million: Make a list of the numbers from one to one million, and then use a for loop to print the numbers. (If the output is taking too long, stop it by pressing CTRL-C or by closing the output window.)
'''
n:int = 1 #i've initialized a variable n and i've assigned the value 1
n1:int = 10 #i've initialized a variable n1 and i've assigned the value 1000001 because the range is from 1 to 1000000 inclusive
numbers:list = list(range(n,n1)) #'i've make a list which has as range n(1), n1(1000000)
print(numbers)

'''
4-5. Summing a Million: Make a list of the numbers from one to one million, and then use min() and max() to make sure your list actually starts at one and ends at one million. Also, use the sum() function to see how quickly Python can add a million numbers.
'''


numbers:list = list(range(1,10))
min_number:int = min(numbers)
print(min_number)
max_number:int = max(numbers)
print(max_number)
sum_numbers:int = sum(numbers)
print(sum_numbers)

'''
4-6. Odd Numbers: Use the third argument of the range() function to make a list of the odd numbers from 1 to 20. Use a for loop to print each number.
'''

odd:list = list(range(1,21,2))
for n in odd:
    print(n)

'''
4-7. Threes: Make a list of the multiples of 3, from 3 to 30. Use a for loop to print the numbers in your list.
'''
multiples:list = list(range(3,31,3))
for n in multiples:
    print(n)

'''
4-8. Cubes: A number raised to the third power is called a cube. 
For example, the cube of 2 is written as 2**3 in Python. Make a list of the first 10 cubes (that is, the cube of each integer from 1 through 10), and use a for loop to print out the value of each cube.
'''
cubes:list = list(range(1,11))
for cube in cubes:
    print(cube**3)

'''
4-9. Cube Comprehension: Use a list comprehension to generate a list of the first 10 cubes.
'''
cubes:list = list(range(1,11))
cubes1:list = [cube**3 for cube in cubes]
print(cubes1 )

'''
4-10. Slices: Using one of the programs you wrote in this chapter, add several lines to the end of the program that do the following:
• Print the message The first three items in the list are:. Then use a slice to print the first three items from that program’s list.
• Print the message Three items from the middle of the list are:. Then use a slice to print three items from the middle of the list.
• Print the message The last three items in the list are:. Then use a slice to print the last three items in the list.
'''
cubes:list = list(range(1,11))
cubes1:list = [cube**3 for cube in cubes]
print(cubes1)
print(len(cubes1)) #i control the lenght of the list cubes1 
print("The first three elements are: ",cubes1[0:3]) #print the first three elements
print("The last three elements are: ",cubes1[-3:]) #prints the last three elements
central_index1:int = len(cubes1) // 2 #calculate the index of the centre of the cubes1 list
central_index2:int = len(cubes1) // 2 - 1 #calculate the index preceding the centre index 
central_index3:int = len(cubes1) // 2 + 1 #calculate the index following the centre index 
print("The three central element are: ", cubes1[central_index2],cubes1[central_index1],cubes1[central_index3])

'''
4-11. My Pizzas, Your Pizzas: Start with your program from Exercise 4-1. Make a copy of the list of pizzas, and call it friend_pizzas. Then, do the following:
• Add a new pizza to the original list.
• Add a different pizza to the list friend_pizzas.
• Prove that you have two separate lists. Print the message My favorite pizzas are:, and then use a for loop to print the first list. Print the message My friend’s favorite pizzas are:, and then use a for loop to print the second list. Make sure each new pizza is stored in the appropriate list
'''
def pizza_type(pizza:list):
    for elem in pizza:
        print(f"I like the {elem} pizza")
    print("I love pizza")
    return pizza
pizza:list = ["Margherita", "Capricciosa", "Pistacchiosa"]
pizza_type(pizza)
friend_pizzas:list = pizza.copy() #i've create a copy of pizza list
pizza.append("Diavola")
friend_pizzas.append("Marinara")
my_pizzas:list = [elem for elem in pizza] #i've use the list comprehension to print the list
friend_pizzas1:list = [elem for elem in friend_pizzas]
print("My favorite pizzas are: ", my_pizzas)
print("Your favorite pizzas are: ", friend_pizzas1)

'''
4-12. More Loops: All versions of foods.py in this section have avoided using for loops when printing, to save space. Choose a version of foods.py, and write two for loops to print each list of foods.
'''
#exercise 4-4
n:int = 1 
n1:int = 10 
numbers:list = list(range(n,n1)) 
for num in numbers:
    print(num)

'''
4-14. PEP 8: Look through the original PEP 8 style guide at https://python.org/dev/peps/pep-0008. You won’t use much of it now, but it might be interesting to skim through it.
'''

'''
4-15. Code Review: Choose three of the programs you’ve written in this chapter and modify each one to comply with PEP 8.
'''
#first
cubes:list = list(range(1,11))
cubes1:list = [cube**3 for cube in cubes]
print(cubes1)
print(len(cubes1)) #i control the lenght of the list cubes1 
print("The first three elements are: ",cubes1[0:3]) #print the first three elements
print("The last three elements are: ",cubes1[-3:]) #prints the last three elements
central_index1:int = len(cubes1) // 2 #calculate the index of the centre of the cubes1 list
central_index2:int = len(cubes1) // 2-1 #calculate the index preceding the centre index 
central_index3:int = len(cubes1) // 2+1 #calculate the index following the centre index 
print("The three central element are: ", cubes1[central_index2],cubes1[central_index1],cubes1[central_index3])

#second
def pizza_type(pizza:list):
    for elem in pizza:
        print(f"I like the {elem} pizza")
    print("I love pizza")
    return pizza
pizza:list = ["Margherita", "Capricciosa", "Pistacchiosa"]
pizza_type(pizza)
friend_pizzas:list = pizza.copy() #i've create a copy of pizza list
pizza.append("Diavola")
friend_pizzas.append("Marinara")
my_pizzas:list = [elem for elem in pizza] #i've use the list comprehension to print the list
friend_pizzas1:list = [elem for elem in friend_pizzas]
print("My favorite pizzas are: ", my_pizzas)
print("Your favorite pizzas are: ", friend_pizzas1)

#third
numbers:list = list(range(1,10))
min_number:int = min(numbers)
print(min_number)
max_number:int = max(numbers)
print(max_number)
sum_numbers:int = sum(numbers)
print(sum_numbers)
 
'''
5-1. Conditional Tests: Write a series of conditional tests. Print a statement
describing each test and your prediction for the results of each test. Your code
should look something like this:
car = 'subaru'
print("Is car == 'subaru'? I predict True.")
print(car == 'subaru')
print("\nIs car == 'audi'? I predict False.")
print(car == 'audi')
• Look closely at your results, and make sure you understand why each line
evaluates to True or False.
• Create at least 10 tests. Have at least 5 tests evaluate to True and another
5 tests evaluate to False.
'''
car:str = 'subaru'
print("Is car == 'subaru'? I predict True.")
print(car == 'subaru')
print("\nIs car == 'audi'? I predict False.")
print(car == 'audi')
print("\nIs car != 'fiat'? I predict True.")
print(car != 'fiat')
car:str = 'blue'
print(f"\nIs car == 'white'? I predict False.")
print(car == 'white')
print("\nIs car == 'blue'? I predict True.")
print(car == 'blue')
car:str = 'cheap'
print("\nIs car == 'cheap'? I predict True.")
print(car == 'cheap')
print("\nIs car == 'expensive'? I predict False.")
print(car == 'expensive')
car:str = 'small'
print("\nIs car == 'big'? I predict False.")
print(car == 'big')
print("\nIs car == 'small'? I predict True.")
print(car == 'small')
print("\nIs len(car) == 4? I predict False.")
print(len(car) == 4)

'''
5-2. More Conditional Tests: You don’t have to limit the number of tests you cre-
ate to 10. If you want to try more comparisons, write more tests and add them

to conditional_tests.py. Have at least one True and one False result for each of
the following:
• Tests for equality and inequality with strings
• Tests using the lower() method
• Numerical tests involving equality and inequality, greater than and less
than, greater than or equal to, and less than or equal to
• Tests using the and keyword and the or keyword
• Test whether an item is in a list
• Test whether an item is not in a list
'''
name:str = 'Mario'
print("Name == 'Mario'?I predict True")
print(name == 'Mario')
print("Name != 'Mario'?I predict False")
print(name != 'Mario')
print("\nIs name.lower() == 'Mario'.lower()? I predict True" )
print(name.lower() == 'Mario'.lower())
print("\nIs 10 > 9? I predict True")
print(10 > 9)
print("Is 8 > 9? I predict False")
print(8 > 9)
print("Is 10 >= 11? I predict False")
print(10 >= 11)
print("Is 10 <= 10? I predict True")
print(10 <= 10)
print("Is 11 == 11? I predict True")
print(11 == 11)
print("Is 10 != 10? I predict False")
print(10 != 10)
print("\nIs 10 > 9 and 10 > 11? I predict False")
print(10 > 9 and 10 > 11)
print("Is 10 > 9 and 10 > 11? I predict True")
print(10 > 9 or 10 > 11)
color:list = ["Blue", "Black", "Red", "Brown"]
print("\nIs Red in this list? I predict True")
print("Red" in color)
print("Is black in this list? I predict False")
print("black" in color)

'''
5-3. Alien Colors #1: Imagine an alien was just shot down in a game. Create a variable called alien_color and assign it a value of 'green', 'yellow', or 'red'.
• Write an if statement to test whether the alien’s color is green. If it is, print a message that the player just earned 5 points.
• Write one version of this program that passes the if test and another that fails. (The version that fails will have no output.)
'''
alien_color:str = "Green"
if alien_color == "Green":
    print("You've just earned 5 points ")
#second version
alien_color:str = "Yellow"
if alien_color == "Green":
    print("You've just earned 5 points ")

'''
5-4. Alien Colors #2: Choose a color for an alien as you did in Exercise 5-3, and write an if-else chain.
• If the alien’s color is green, print a statement that the player just earned 5 points for shooting the alien.
• If the alien’s color isn’t green, print a statement that the player just earned 10 points.
• Write one version of this program that runs the if block and another that runs the else block.
'''
alien_color:str = "Green"
if alien_color == "Green":
    print("You've just earned 5 points for shooting the alien ")
else:
    print("You've just earned 10 points")
#second version
alien_color:str = "Red"
if alien_color == "Green":
    print("You've just earned 5 points for shooting the alien ")
else:
    print("You've just earned 10 points")

'''
5-5. Alien Colors #3: Turn your if-else chain from Exercise 5-4 into an if-elif-else chain.

• If the alien is green, print a message that the player earned 5 points.
• If the alien is yellow, print a message that the player earned 10 points.
• If the alien is red, print a message that the player earned 15 points.
• Write three versions of this program, making sure each message is printed for the appropriate color alien.
'''
alien_color:str = "Green"
if alien_color == "Green":
    print("You've just earned 5 points")
elif alien_color == "Yellow":
    print("You've just earned 10 points")
else:
    print("You've just earned 15 points")
#second version
alien_color:str = "Yellow"
if alien_color == "Green":
    print("You've just earned 5 points")
elif alien_color == "Yellow":
    print("You've just earned 10 points")
else:
    print("You've just earned 15 points")
#third version
alien_color:str = "Red"
if alien_color == "Green":
    print("You've just earned 5 points")
elif alien_color == "Yellow":
    print("You've just earned 10 points")
else:
    print("You've just earned 15 points")

'''
5-6. Stages of Life: Write an if-elif-else chain that determines a person’s stage of life. Set a value for the variable age, and then:
• If the person is less than 2 years old, print a message that the person is a baby.
• If the person is at least 2 years old but less than 4, print a message that the person is a toddler.
• If the person is at least 4 years old but less than 13, print a message that the person is a kid.
• If the person is at least 13 years old but less than 20, print a message that the person is a teenager.
• If the person is at least 20 years old but less than 65, print a message that the person is an adult.
• If the person is age 65 or older, print a message that the person is an elder.
'''
age:int = 18
if age < 2:
    print("This person is a baby")
elif age >= 2 and age < 4:
    print("This person is a toddler")
elif age >= 4 and age < 13:
    print("This person is a kid")
elif age >= 13 and age < 20:
    print("This person is a teeneger")
elif age >= 20 and age < 65:
    print("This person is an adult ")
else:
    print("This person is an elder")

'''
5-7. Favorite Fruit: Make a list of your favorite fruits, and then write a series of independent if statements that check for certain fruits in your list.
• Make a list of your three favorite fruits and call it favorite_fruits.
• Write five if statements. Each should check whether a certain kind of fruit is in your list. If the fruit is in your list, the if block should print a statement, such as You really like Apples!
'''
favorite_fruits:list = ["Apple", "Banana", "Strawberry", "Watermelon", "Grape"]
if "Apple" in favorite_fruits:
    print("I love Apples")
if "Banana" in favorite_fruits:
    print("Banana is my favorite fruit")
if "Strawberry" in favorite_fruits:
    print("I like strawberries")
if "Watermelom" in favorite_fruits:
    print("Watermelon is so fresh")
if "Grape" in favorite_fruits:
    print("Grape is very good")

'''
5-8. Hello Admin: Make a list of five or more usernames, including the name 'admin'. Imagine you are writing code that will print a greeting to each user after they log in to a website. Loop through the list, and print a greeting to each user.
• If the username is 'admin', print a special greeting, such as Hello admin, would you like to see a status report?
• Otherwise, print a generic greeting, such as Hello Jaden, thank you for logging in again.
'''
usernames:list = ["mario", "carlo", "flavio", "andrea", "marta", "admin"]
for username in usernames:
    if username == "admin":
        print("Hello admin, would you like to see a status report?")
    else:
        print(f"Hello {username}, thank you for logging in again ")

'''
5-9. No Users: Add an if test to hello_admin.py to make sure the list of users is not empty.
• If the list is empty, print the message We need to find some users!
• Remove all of the usernames from your list, and make sure the correct message is printed.
'''
usernames:list = ["mario", "carlo", "flavio", "andrea", "marta", "admin"]
usernames.clear()
if not usernames:
    print("We need to find some users!")

'''
5-10. Checking Usernames: Do the following to create a program that simulates how websites ensure that everyone has a unique username.
• Make a list of five or more usernames called current_users.
• Make another list of five usernames called new_users. Make sure one or two of the new usernames are also in the current_users list.
• Loop through the new_users list to see if each new username has already been used. If it has, print a message that the person will need to enter a new username. If a username has not been used, print a message saying that the username is available.
• Make sure your comparison is case insensitive. If 'John' has been used, 'JOHN' should not be accepted. (To do this, you’ll need to make a copy of current_users containing the lowercase versions of all existing users.)
'''
current_users:list = ["mario", "carlo", "flavio", "andrea", "marta", "admin"]
new_users:list = ["sara", "marco", "simone", "gaia", "lorenzo", "admin"]
for user in new_users:
    if user in current_users:
        print(f"{user} it has been used, please enter a new username")
    else:
        print(f"the username {user} is available")

'''
5-11. Ordinal Numbers: Ordinal numbers indicate their position in a list, such as 1st or 2nd. Most ordinal numbers end in th, except 1, 2, and 3.
• Store the numbers 1 through 9 in a list.
• Loop through the list.
• Use an if-elif-else chain inside the loop to print the proper ordinal ending for each number. Your output should read "1st 2nd 3rd 4th 5th 6th 7th 8th 9th", and each result should be on a separate line.
'''
ordinal_numbers:list = list(range(1,10))
for num in ordinal_numbers:
    if num == 1:
        print(f"{num}st")
    elif num == 2:
        print(f"{num}nd")
    elif num == 3:
        print(f"{num}rd")
    else:
        print(f"{num}th")
    
