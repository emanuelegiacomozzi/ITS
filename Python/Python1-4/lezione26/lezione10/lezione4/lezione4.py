#esercizio 1

def subtract(x:float, y:float):
    sub:str = x - y
    return sub
print(subtract(10,8))

#esercizio 2

def check_value(x:int):
    if x > 5:
        print(f"{x} è maggiore di 5")
    elif x < 5:
        print(f"{x} è minore di 5")
    else:
        print(f"{x} è uguale a 5")
    return x
x:int= int(input("Inserisci un numero: "))
check_value(x)

#esercizio 3

def check_length(x:str):
    if len(x) > 10:
        print(f"La lunghezza di {x} è maggiore di 10")
    elif len(x) < 10:
        print(f"La lunghezza di {x} è minore di 10")
    else: 
        print(f"La lunghezza di {x} è uguale a 10")
    return x
x:str = input("Inserisci una stringa: ")
check_length(x) 

#esercizio 4

def print_numbers(l:list):
    for i in l:
        print(i)
    return i
l:list = [1,2,3,4]
print_numbers(l)

#esercizio 5

def check_each(l:list):
    for i in l:
        if i > 5:
            print(f"{i} è maggiore di 5")
        elif i < 5:
            print(f"{i} è minore di 5")
        else: 
            print(f"{i} è uguale a 5")
    return i
l:list = [2, 5, 7, 8, 9]
check_each(l)

#esercizio 6
def add_one(n:int):
    return n+1
n:int = int(input("Inserisci un numero: "))
print(add_one(n))
def add_one_to_list(l:list):
    new_list:list = []
    for n in l:
        x = n + 1 
        new_list.append(x)
    return new_list
l:list = [4, 4, 11]
print(add_one_to_list(l))

#esercizi opzionali 
'''
School Grading System:

 Create a function that takes a student's name and their scores in different subjects as input.
The function calculates the average score and prints the student's name, average, and a message indicating whether the student passed the exam (average >= 60) or failed.
Create a for loop to iterate over a list of students and scores, calling the function for each student.
'''
def school_grading_system(students_scores:list):
    for student,scores in students_scores:
        print("Name :",student, "\nScores: ",scores)
        sum_scores = sum(scores)
        average = sum_scores / len(scores)
        if average >= 60:
            result:str = "Passed"
        else:
            result:str = "Failed"
        print("Average: ",average) 
        print("Result: ",result)
        print()
students_scores:list = [("Marco",[80,60,45,49.8]), ("Andrea",[90,100,85,95]), ("Giorgio",[45,48.9,50,80]), ("Sara",[60,65,70,50])]
school_grading_system(students_scores)

'''
2. Guess the Number Game:

Create a function that generates a random number within a range specified by the user.
Prompt the user to guess the number within a specified maximum number of attempts.
Provide feedback to the user after each guess, indicating whether their guess is too high, too low, or correct.
Terminate the loop when the user guesses the number correctly or reaches the maximum number of attempts.
'''
import random
def number_game(min_num, max_num, max_attempts):
    num:int = random.randint(min_num,max_num)
    print(f"Welcome! Guess a random number from {min_num} to {max_num} which i have chosen for you")
    print(f"You've a maximum of {max_attempts} attempts. Good luck!")
    attempts:int = 0
    while attempts < max_attempts:
        guess:int = int(input("Insert a number: "))
        if guess > num:
            print("Number too high")
        elif guess < num:
            print("Number to low")
        else:
            print("Congratulations! You win")
            return
        attempts += 1
    print(f"Sorry, you have finish your attempts. The correct number was {num}")
number_game(1,50,5)

