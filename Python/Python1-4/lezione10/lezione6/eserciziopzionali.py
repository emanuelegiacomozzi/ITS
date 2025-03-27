def unisci_dizionari(dict1:dict, dict2:dict):
    dict3 = {}
    dict3["Dizionario 1"] = dict1
    dict3["Dizionario 2"] = dict2 
    for key,value in dict1.items():
        for key1,value1 in dict2.items():
            if key in dict1 == key1 in dict2:
                somma = value + value1
                dict3["Somma chiavi"] = somma
    return dict3
dict1 = {"A": 23, "B": 45, "C":12, "D":8}
dict2 = {"F": 24, "A":34, "C":13, "E":3}
print(unisci_dizionari(dict1, dict2))


'''
1 Scrivi una funzione che prenda un dizionario e un valore, e ritorni la prima chiave che corrisponde a quel valore, o None se il valore non è presente.
'''
def dict_value(dizionario:dict, valore:int):
    for key,value in dizionario.items():
        if value == valore:
            return key
    return None
dizionario = {"A":1,"B":2,"C":3}
valore = 3
print(dict_value(dizionario,valore))

'''
2 Scrivi una funzione che inverte le chiavi e i valori in un dizionario. Se ci sono valori duplicati, scarta i duplicati.
'''
def chiavi_valori(dizionario:dict):
    dizionario2 = {}
    for key,value in dizionario.items():
        if value not in dizionario2:
            dizionario2[value] = key
    return dizionario2
dizionario = {"A":1, "B":2, "C":3, "D":4, "E": 1}
print(chiavi_valori(dizionario))
        
'''
3 Scrivi una funzione che riceve una lista di numeri, filtra i numeri pari, e restituisce una nuova lista con i numeri pari moltiplicati per un fattore dato.
'''
def lista_numeri(lista:list):
    lista2 = []
    fattore = int(input("Inserisci un fattore: "))
    for num in lista:
        if num % 2 == 0:
            num *= fattore
            lista2.append(num)
    return lista2
lista = [1,4,2,5,6]
print(lista_numeri(lista))

'''
4 Scrivi una funzione che determina se un numero è 'magico'. Un numero è considerato magico se è divisibile per 4 ma non per 6.
'''
def numero_magico(numero:int):
    if numero % 4 == 0 and numero % 6 != 0:
        return f"{numero} è un numero magico"
    else: 
        return f"{numero} non è un numero magico"
numero = int(input("Inserisci un numero: "))
print(numero_magico(numero))

'''
5 Scrivi una funzione che accetti una lista di numeri e ritorni la somma dei numeri che sono divisibili sia per 2 che per 3.
'''
def numeri_divisibili(lista:list[int]):
    somma = 0
    for num in lista:
        if num % 2 == 0 and num % 3 == 0:
            somma += num
    return f"La somma è: {somma} "
lista = [2,24,7,6,9,8,10,34,25,65,12,3]
print(numeri_divisibili(lista))

'''
6 Scrivi una funzione che accetti un dizionario di prodotti con i prezzi e restituisca un nuovo dizionario con solo i prodotti che hanno un prezzo superiore a 20, scontati del 10%.
'''
def negozio(prodotti:dict[str,float]):
    prodotti2:dict = {}
    for prodotto,prezzo in prodotti.items():
        if prezzo > 20:
            prezzo_scontato = prezzo*10 / 100
            prodotti2[prodotto] = prezzo_scontato
    return prodotti2
prodotti = {"Fazzoletti": 2.80, "Pennarelli": 10, "Quadri":21, "Cover":25}
print(negozio(prodotti))

'''
7 Scrivi una funzione che prenda in input una lista di dizionari che rappresentano voti di studenti e aggrega i voti per studente in un nuovo dizionario.
'''

'''
8 Scrivi una funzione che elimini dalla lista dati certi elementi specificati in un dizionario. Il dizionario contiene elementi da rimuovere come chiavi e il numero di volte che devono essere rimossi come valori.
'''

'''
9 Scrivi una funzione che converta una lista di tuple (chiave, valore) in un dizionario. Se la chiave è già presente, aggiungi il valore alla lista di valori già associata alla chiave
'''

'''
10 Scrivi una funzione che prende una lista di numeri e ritorna un dizionario che classifica i numeri in liste separate per numeri pari e dispari.
'''
def return_dictionary(lista:list[int]):
    dizionario = {}
    lista_pari = []
    lista_dispari = []
    for num in lista:
        if num % 2 == 0:
            lista_pari.append(num)
            dizionario["Numeri Pari"] = lista_pari
        else:
            lista_dispari.append(num)
            dizionario["Numeri Disari"] = lista_dispari
    return dizionario
lista = [1,2,4,5,7,12]
print(return_dictionary(lista))

'''
11. Scrivi una funzione che converte una temperatura da gradi Celsius a Fahrenheit e viceversa a seconda del parametro. Utilizza il concetto di parametri opzionali.
'''
def converti_temperatura(temperatura:float, conversione:bool = True):
    if conversione:
        return (temperatura - 32) * 9 / 5
    else:
        return temperatura * 9 / 5 + 32
    
celsius = 25
faharenheit = 20
print("Da celsius a faharenheit = ", converti_temperatura(celsius, conversione=True))
print("Da faharenheit a celsius = ",converti_temperatura(faharenheit,conversione=True))

'''
12. Scrivi una funzione che somma tutti i numeri interi di una lista che sono maggiori di un dato valore intero definito threshold.
'''
def somma_lista(lista:list[int]):
    thresold:int = int(input("Inserisci valore: "))
    somma = 0
    for num in lista:
        if num > thresold:
            somma += num
    return somma
print("Somma = ", somma_lista([1,4,5,12,45,6,8,9]))

'''
13. Scrivi una funzione che, data una lista, ritorni un dictionary che mappa ogni elemento alla sua frequenza nella lista.
'''
def frequency_dict(elements:list):
    dizionario = {}
    for element in elements:
        x = elements.count(element)
        dizionario[element] = x
    return dizionario
print(frequency_dict([2,3,4,2,3,4,4]))

'''
14. Scrivi una funzione che ritorna un dizionario che unisce due dizionari. Se una chiave è presente in entrambi, somma i loro valori nel nuovo dizionario.
'''
def unisci_dizionari(dict1:dict, dict2:dict):
    dict3 = {}
    dict3["Dizionario 1"] = dict1
    dict3["Dizionario 2"] = dict2 
    for key,value in dict1.items():
        for key1,value1 in dict2.items():
            if key in dict1 == key1 in dict2:
                somma = value + value1
                dict3["Somma chiavi"] = somma
    return dict3
dict1 = {"A": 23, "B": 45, "C":12, "D":8}
dict2 = {"F": 24, "A":34, "C":13, "E":3}
unisci_dizionari(dict1, dict2) 

'''
15. Scrivi una funzione che, dato un insieme e una lista di numeri interi da rimuovere, ritorni un nuovo insieme senza i numeri specificati nella lista.
'''
def set_list(s:set, l:list):
    new_set = set()
    for num in s:
        if num not in l:
            new_set.add(num)
    return new_set
print(set_list({1,2,4,5,7}, [2,5]))

'''
16. Scrivi una funzione che ritorna il valore massimo, minimo e la media di una lista di numeri interi.
'''
def min_max_avg(l:list[int]):
    numero_max = max(l)
    numero_min = min(l)
    somma = sum(l)
    avg:float = somma / len(l)
    return f"Numero massimo: {numero_max}\nNumero minimo: {numero_min}\nLa media è: {avg}"
print(min_max_avg([2,4,7,6,2]))
            
        

