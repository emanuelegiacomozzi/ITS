#esercizio 1
#La funzione dovrebbe determinare se un elemento è presente in una lista.
#Un errore nell'implementazione porta a risultati inaspettati.
#TROVA L'ERRORE E CORREGGI IL CODICE
def find_element(lst: list[int], element: int) -> bool:
    for item in lst:
        if item == element:
            return True
    return False
lst = [1, 2, 3, 4, 5]
element = 5
print(find_element(lst,element))

'''
esercizio 2
Scrivi una funzione che ruota gli elementi di una lista verso sinistra di un numero specificato k di posizioni. La rotazione verso sinistra significa che ciascun elemento della lista viene spostato a sinistra di una posizione e l'elemento iniziale viene spostato alla fine della lista. Per la rotazione utilizzare lo slicing e gestire il caso in cui il numero specificato di posizioni sia maggiore della lunghezza della lista
'''

'''
esercizio 3
Scrivi una funzione che calcola la media di una lista di numeri e ritorna il valore arrotondato all'intero più vicino.
'''
def rounded_average(numbers: list[int]) -> int:
    somma = sum(numbers)
    average = somma / len(numbers)
    return round(average)
print(rounded_average([1, 1, 2, 2]))

'''
esercizio 4
Scrivi una funzione che converte una temperatura da gradi Celsius a Fahrenheit e viceversa a seconda del parametro to_fahrenheit. Utilizza il concetto di parametri opzionali per il parametro to_fahrenheit.
'''

def convert_temperature(temperatura,to_fahareneit=True) -> float:
    if to_fahareneit:
        return(temperatura*9/5)+32
    else:
        return(temperatura-32)*5/9
print(convert_temperature(32,False))

'''
esercizio 6
Scrivi una funzione che, data una lista, ritorni un dictionary che mappa ogni elemento alla sua frequenza nella lista.
'''
def frequency_dict(elements: list) -> dict:
    elements_map= {}
    for element in elements:
        elements_map[element] = elements_map.get(element, 0) +1
    return elements_map
print(frequency_dict([1,2,3,'ciao']))

'''
esercizio 7
Scrivi una funzione che verifica se in una stringa le parentesi '(' e ')' sono bilanciate, cioè per ogni parentesi che apre c'è la corrispondente parentesi che chiude.
'''
def check_parentheses(expression: str) -> bool:
    lista = []
    for i in expression:
        if i == '(':
            lista.append(i)
        elif i == ')' and lista:
            lista.pop()
        elif i == ')' and not lista:
            return False
    return not lista
print(check_parentheses("()()"))

'''
esecizio 9
'''
def remove_elements(original_set: set[int], elements_to_remove: list[int]) -> set[int]:
    new_set:set = original_set.copy()
    for i in elements_to_remove:
        new_set.discard(i)
    return new_set

'''
esercizio 10
Scrivi una funzione che unisce due dizionari. Se una chiave è presente in entrambi, somma i loro valori.
'''
def merge_dictionaries(dict1: dict, dict2: dict) -> dict:
    dict3:dict = dict1.copy()
    for key,value in dict2.items():
        if key in dict3:
            dict3[key] += value
        else:
            dict3[key] = value
    return dict3