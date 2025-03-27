def ciao(name:str)->str:

    return f"Ciao, {name}"

def salve(name:str)->str:
    return f"Salve, {name}"

def saluta(func)->str:

    return func("Bob")

print(saluta(ciao))
print(saluta(salve))

#######################################

def parent():

    print("Sono in parent!")

    def first_child():

        print("Sono in First Child!")
    
    #def second_child():

        #print("Sono in Second Child")
    
    #second_child()
    #second_child()
    return first_child

print(parent())

##########################################

def decorator(func):

    def wrapper():

        print(f"Prima di func")

        func()

        print(f"Dopo func")
    
    return wrapper

def ciao():

    print(f"Ciao!")

ciao = decorator(ciao)

ciao()


############################################

def decorator(func):

    def wrapper(*args):

        import time

        start = time.time()

        func(*args)

        print(f"Time elapsed: {time.time() - start}") #tempo esecuzione funzione
    
    return wrapper

def ciao():

    print(f"Ciao")

ciao = decorator(ciao)

ciao()


#############################################################################

class Analisi:

    @staticmethod
    def tempo(func):

        def wrapper(*args):
            import time

            start = time.time()

            func(*args)

            print(f"Time elapsed: {time.time() - start}")
        
        return wrapper


@Analisi.tempo
def area_cerchio(raggio:float):

    return raggio * raggio * 3.14

area_cerchio(5)


################################################
def generatore():

    yield "A"
    yield "B"
    yield "C"

prova_generatore = generatore()

print(next(prova_generatore))
print(next(prova_generatore))
print(next(prova_generatore))

################################################

from contextlib import contextmanager

@contextmanager
def context_manager_decorator(*args):
    import time

    start_time: float = time.time()

    yield

    end_time: float = time.time()
    elapsed_time : float = end_time - start_time
    print(f"{elapsed_time=}")

@context_manager_decorator
def area_cerchio(raggio:float):

    return raggio * raggio * 3.14

area_cerchio(1)