import requests, sys

import urllib3

urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)

base_url = "https://127.0.0.1:8080"

def GetCasaVendita():
    catastale = input("Inserisci catastal: ")
    indirizzo = input("Inserisci indirizzo: ")
    civico = input("Inserisci civico")
    piano = input("Inserisci il numero di piani: ")
    metri = input("Inserisci i metri: ")
    vani = input("Inserisci il numero di vani: ")
    prezzo = input("Inserisci il prezzo")
    stato = input("Inserisci lo stato(LIBERO o OCCUPATO): ")
    filiale = input("Inserisci la partita iva della filiale proponente: ")
    casa_in_vendita = {
        "Catastale" : catastale,
        "Indirizzo" : indirizzo,
        "Civico" : civico,
        "Piani" : piano,
        "Metri" : metri,
        "Vani" : vani,
        "Prezzo" : prezzo,
        "Stato" : stato,
        "Filiale Proponente" : filiale
    }
    return casa_in_vendita


def GetCasaAffitto():
    catastale = input("Inserisci catastale: ")
    indirizzo = input("Inserisci indirizzo: ")
    civico = input("Inserisci il numero civico")
    tipo_affitto = input("Inserisci il tipo di affitto (PARZIALE o TOTALE): ")
    bagno_personale = input("Inserisci il numero di bagni: ")
    prezzo = input("Inserisci il prezzo mensile: ")
    filiale = input("Inserisci la partita iva della filiale proponente: ")
    casa_in_affitto = {
        "Catastale" : catastale,
        "Indirizzo" : indirizzo,
        "Civico" : civico,
        "Tipo di affitto" : tipo_affitto,
        "Bagni" : bagno_personale,
        "Prezzo Mensile": prezzo,
        "Filiale Proponente" : filiale
    }
    return casa_in_affitto


def GetCercaCasa():

    catastale = input("Inserisci catastale della casa in vendita")
    return {"Catastale" : catastale}

def EseguiOperazione(iOper, sServizio, dDatiToSend):
    try:
        if iOper == 1 or iOper == 2:
            response = requests.post(sServizio, json=dDatiToSend, verify=False)
        elif iOper == 3 or iOper == 4:
            response = requests.get(sServizio, verify=False)

        if response.status_code==200:
            print(response.json())
        else:
            print("Attenzione, errore " + str(response.status_code))
    except:
        print("Problemi di comunicazione con il server, riprova più tardi.")


iFlag = 0
while iFlag == 0:
    print("\nOperazioni disponibili: ")
    print("1.Aggiungi una casa in vendita")
    print("2.Aggiungi una casa in affitto")
    print("3.Cerca casa in vendita")
    print("4.Cerca casa in affitto")
    print("5.Esci")

    try:
        oper = int(input("Cosa vuoi fare? "))
    except ValueError:
        print("Inserisci numero valido") 
        continue 

    if oper == 1:
        print("Aggiungi casa in vendita")
        api_url = base_url + '/vendi_casa'
        jsonDataRequest = GetCasaVendita()
        EseguiOperazione(1, api_url, jsonDataRequest)       
    
    if oper == 2:
        print("Aggiungi casa in affitto")
        api_url = base_url + '/affitta_casa'
        jsonDataRequest = GetCasaAffitto()
        EseguiOperazione(2, api_url, jsonDataRequest)       
    
    if oper == 3:
        print("Cerca casa in vendita")
        api_url = base_url + '/read_case_vend'
        jsonDataRequest = GetCercaCasa()
        EseguiOperazione(3, api_url + '/' + jsonDataRequest['Catastale'], None)       
    
    if oper == 4:
        print("Cerca casa in affitto")
        api_url = base_url + '/read_case_affitt'
        jsonDataRequest = GetCercaCasa()
        EseguiOperazione(4, api_url + '/' + jsonDataRequest['Catastale'], None)       
    
    elif oper == 5:
        print("Buona giornata")
        iFlag = 1
    
    else:
        print("Operazione non disponibile, riprova.")