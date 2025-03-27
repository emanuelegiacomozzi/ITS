file = open('lezione15/file.txt')

with open(f'lezione15/file.txt') as file:

    print(file)

try:

    file.readline()
    print("Sono nella try")
    raise Exception("Eccezione")

except Exception:

    print("Sono nella except")

finally:

    print("Sono nella finally")
    file.close()

class ContextManager:

    def __enter__(self):

        print("Ciao sono nell'enter")

        return self

    def __exit__(self, exc_type, exc_value, traceback):

        if exc_type is not None:

            print("Eccezione")
        
        return False

with ContextManager() as cm:

    print("Ciao")