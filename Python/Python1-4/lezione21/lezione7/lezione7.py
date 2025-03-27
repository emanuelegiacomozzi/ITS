def inverti_mappa(dizionario: dict[str:int]) -> dict[int:str]:
    dizionario2 = {}
    for key,value in dizionario.items():
        if value not in dizionario2.values():
            dizionario2[value] = key
    return dizionario2
print(inverti_mappa({'a': 1, 'b': 2, 'c': 3}))
print(inverti_mappa({'a': 3, 'b': 3, 'c': 3}))

#esercizio 2
def somma_condizionale(numeri: list[int]) -> int :
    somma = 0
    for num in numeri:
        if num % 2 == 0 and num % 3 == 0:
            somma += num
    return somma
numeri = [1,2,3,6,12]
print(somma_condizionale(numeri))

#esercizio 3
def rimuovi_elementi(lista: list[int], da_rimuovere: dict[int:int]) -> list[int]:
    for key,value in da_rimuovere.items():
        for i in range(value):
            if key in lista:
                lista.remove(key)
    return lista
print(rimuovi_elementi([1, 2, 3, 2, 4], {2: 2}))

#esercizio 4
def filtra_e_mappa(prodotti: dict[str:float]) -> list[str:float]:
    prodotti_scontati = {}
    for key,value in prodotti.items():
        if value > 20.0:
            percentuale = (value/100)*10
            sconto = value-percentuale
            value = sconto
            prodotti_scontati.update({key:value})
            return prodotti_scontati
print(filtra_e_mappa({'Penna': 15.0, 'Zaino': 50.0, 'Quaderno': 22.0}))
print(filtra_e_mappa({'Tavolo': 120.0, 'Sedia': 85.0}))

#esercizio 5

def create_contact(name:str, email:str=None, telefono:int=None):
    contact = {"profile":name, "email":email, "telefono":telefono}
    return contact
contact1 = create_contact("Emanuele Giacomozzi", "emanuele@gmail.com", 33344455567)
print(contact1)

def update_contact(contact:dict, name:str, email:str=None, telefono:int=None):
    if contact["profile"] == name:
        if email:
            contact["email"] = email
        if telefono:
            contact["telefono"] = telefono

    return contact
contact1 = create_contact("Emanuele Giacomozzi", "emanuele@gmail.com", 3335554466)
print(contact1)

#esercizio 6

def aggrega_voti(registro:list[dict]):
    new_registro = {}
    for studente in registro:
        nome = studente["name"]
        voto = studente["voto"]

        if nome in new_registro:
            new_registro[nome].append(voto)
        else:
            new_registro[nome] = [voto]
    return new_registro
print(aggrega_voti([{"name": "Alice", "voto":6}, {"name":"Bob","voto":7},{}]))
