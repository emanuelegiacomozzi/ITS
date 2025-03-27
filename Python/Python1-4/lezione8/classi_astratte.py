#Exercise 1: Creating an Abstract Class with Abstract Methods
from abc import ABC, abstractmethod

class Shape(ABC):

    @abstractmethod

    def area():

        pass

    def perimeter():

        pass


class Circle(Shape):

    def __init__(self, radius:float) -> None:
        super().__init__()

        self.radius = radius
        self.area_circle = 3.1415 * radius**2
        self.perimeter_circle = radius * 3.1415**2
    
    def area(self):
        return self.area_circle
    
    def perimeter(self):
        return self.perimeter_circle
    
circle = Circle(radius=12)
print("Circle area: ", circle.area())
print("Circle perimeter: ", circle.perimeter())

class Rectangle(Shape):

    def __init__(self, base:float, half:float) -> None:
        super().__init__()

        self.base = base
        self.half = half
        self.area_rectangle = base * half
        self.perimeter_rectangle = base*2 + half*2
    
    def area(self):
        return self.area_rectangle
    
    def perimeter(self):
        return self.perimeter_rectangle

rectangle = Rectangle(base=11.2, half=5)
print("Rectangle area: ", rectangle.area())
print("Rectangle perimeter: ", rectangle.perimeter())

#Exercise 2: Implementing Static Methods

class MathOperations:

    @staticmethod
    def add(num1,num2):
        return num1+num2
    
    @staticmethod
    def mutiply(num1,num2):
        return num1*num2

print("Num sum: ", MathOperations.add(10,20))
print("Num product: ", MathOperations.add(15,10))

#Exercise 3: Library Management System 

class Book:

    def __init__(self,title:str, author:str, isbn:int) -> None:
        self.title = title
        self.author = author
        self.isbn = isbn
    
    def __str__(self):
        return f"title = {self.title}, author = {self.author}, isbn = {self.isbn}"
    
    @classmethod
    def from_string(cls, book_str:str):
        title, author, isbn = book_str.split(',')
        return cls(title, author, isbn)

book_str = "La Divina Commedia, D. Alighieri, 999000666"
divina_commedia = Book.from_string(book_str)

print(divina_commedia)

class Member:

    def __init__(self, name:str, member_id:int):
        self.name = name
        self.member_id = member_id
        self.borrowed_books = []
    
    def borrow_books(self, book:str):
        if book not in self.borrowed_books:
            self.borrowed_books.append(book)
            return self.borrowed_books 
    
    def return_book(self,book:str):
        if book in self.borrowed_books:
            self.borrowed_books.remove(book)
            print(f"{book} isn't borrow")
        return self.borrowed_books
    

    def __str__(self) -> str:
        borrowed_title_list = []
        for book in self.borrowed_books:
            borrowed_title_list.append(book.title)
        borrowed_title = ','.join(borrowed_title_list)
        return f"name = {self.name}, member_id = {self.member_id}, borrowed books = {borrowed_title}"

    @classmethod
    def from_string(cls, member_str:str):
        name, member_id = member_str.split(',')
        return cls(name, member_id)

member_str = "Paolo, 12345"
member1 = Member.from_string(member_str)
print(member1)

member1.borrow_books(divina_commedia)
print(member1)

member1.return_book(divina_commedia)
print(member1)


#Exercise 4: University Management System

class Person(ABC):

    def __init__(self, name:str, age:int):
        self.name = name
        self.age = age
    
    @abstractmethod
    def get_role():
        pass

    def __str__(self):
        return f"Name={self.name}, Age={self.age}"
    
class Student(Person):

    def __init__(self, name: str, age: int, student_id:int):
        super().__init__(name, age)

        self.student_id = student_id
        self.courses = []
    
    def get_role(self):
        return "Student"
    
    def enroll(self, course):
        if course not in self.courses:
            self.courses.append(course)
            course.add_student(self)
        return [str(course) for course in self.courses]

    def __str__(self):
        return f"Student: {self.name}, Age: {self.age}, ID: {self.student_id}"
    
class Professor(Person):

    def __init__(self, name: str, age: int, department:str, professor_id:int):
        super().__init__(name, age)

        self.department = department
        self.professor_id = professor_id
        self.courses = []
    
    def get_role(self):
        return "Professor"
    
    def assign_to_course(self, course):
        if course not in self.courses:
            self.courses.append(course)
            course.set_professor(self)
        return [str(course) for course in self.courses]
    
    def __str__(self):
        return f"Professor: {self.name}, Age: {self.age}, ID: {self.professor_id}, Department: {self.department}"
    
class Course:

    def __init__(self, course_name:str, course_code:str):
        self.course_name = course_name
        self.course_code = course_code
        self.students = []
        self.professor = None
    
    def add_student(self, student:Student):
        if student not in self.students:
            self.students.append(student)
    
    def set_professor(self, professor:Professor):
        self.professors = professor
    
    def __str__(self):
        return f"Course: {self.course_name}, Code: {self.course_code}"

class Department:

    def __init__(self, department_name:str):
        self.department_name = department_name
        self.courses = []
        self.professors = []
    
    def add_course(self, course:Course):
        if course not in self.courses:
            self.courses.append(course)
        return [str(course) for course in self.courses]
    
    def add_professor(self, professor:Professor):
        if professor not in self.professors:
            self.professors.append(professor)
            professor.department = self.department_name
        return [str(professor) for professor in self.professors]
    
    def __str__(self):
        return f"Department: {self.department_name}"

class University:

    def __init__(self, name:str):

        self.name = name
        self.departments = []
        self.students = []
    
    def add_department(self, department:Department):
        if department not in self.departments:
            self.departments.append(department)
        return [str(department) for department in self.departments]

    def add_students(self, student:Student):
        if student not in self.students:
            self.students.append(student)
        return [str(student) for student in self.students]

    def __str__(self):
        return f"University: {self.name}"
    
university1 = University("LaSapienza")

department1 = Department("Informatic")

course1 = Course('Introduction to Programming', 'CS101')
course2 = Course('Data Structures', 'CS102')

# Create students
student1 = Student('Alice', 20, 'S001')
student2 = Student('Bob', 22, 'S002')

# Create professor
professor1 = Professor('Dr. Smith', 45, 'P001', 'Computer Science')

print(university1.add_department(department1))
print(university1.add_students(student1))
print(university1.add_students(student2))

print(department1.add_course(course1))
print(department1.add_course(course2))

print(department1.add_professor(professor1))
# Enroll students in courses
print(student1.enroll(course1))  # This will print the list of courses Alice is enrolled in
print(student2.enroll(course1))  # This will print the list of courses Bob is enrolled in
print(student2.enroll(course2))  # This will print the list of courses Bob is enrolled in

# Assign professor to courses
print(professor1.assign_to_course(course1))
print(professor1.assign_to_course(course2))


# Print details
print(university1)
print(department1)
print(course1)
print(course2)
print(student1)
print(student2)
print(professor1)



