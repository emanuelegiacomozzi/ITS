import json, requests
import urllib3

urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)

base_url = "http://127.0.0.1:8080"

def InserisciDatiCittadino():
    nome = input("Inserisci nome cittadino: ")
    cognome = input("Inserisci cognome cittadino: ")
    dataNascita = input("Inserisci data nascita: ")
    codFiscale = input("Inserisci codice fiscale: ")
    jRequest = {"Nome":nome, "Cognome":cognome, "DataNascita":dataNascita, "CodiceFiscale":codFiscale}
    return jRequest

def RichiediDatiCittadino():
    codFiscale = input("Inserisci il codice fiscale del cittadino: ")
    jRequest = {"CodiceFiscale": codFiscale}
    return jRequest

def ModificaCittadino():
    codFiscale = input("Inserisci codice fiscale del cittadino (obbligatorio): ") 
    nome = input("Inserisci nome cittadino (lascia vuoto per non modificare): ")
    cognome = input("Inserisci cognome cittadino (lascia vuoto per non modificare): ")
    dataNascita = input("Inserisci data nascita (lascia vuoto per non modificare): ")
    jRequest = {"CodiceFiscale": codFiscale}  
    if nome:  
        jRequest["Nome"] = nome
    if cognome:  
        jRequest["Cognome"] = cognome
    if dataNascita:  
        jRequest["DataNascita"] = dataNascita
    return jRequest

def EliminaCittadino():
    codFiscale = input("Inserisci codice fiscale del cittadino da eliminare: ")
    jRequest = {"CodiceFiscale": codFiscale}
    return jRequest

def CreaInterfaccia():
    print("Operazioni disponibili")
    print("1. Inserisci cittadino (es. atto di nascita)")
    print("2. Richiedi dati cittadino (es. cert. residenza)")
    print("3. Modifica dati cittadino")
    print("4. Elimina cittadino")
    print("5. Exit")


CreaInterfaccia()
sOper = input("Seleziona operazione: ")
while (sOper != "5"):
    if sOper == "1":
        api_url = base_url + "/add_cittadino" #indirizzo server + invocazione
        jsonDataRequest = InserisciDatiCittadino() #richiamo della funzione per inserire
        try:
            response = requests.post(api_url, json=jsonDataRequest) #post http, con url che abbiamo costruito
            print(response.status_code)
            print(response.headers["Content-Type"])
            data1 = response.json() 
            print(data1)
        except:
            print("Problemi di comunicazione con il server")
    
    if sOper == "2":
        api_url = base_url + "/get_cittadino"
        jsonDataRequest = RichiediDatiCittadino()
        try:
            response = requests.get(api_url, json=jsonDataRequest)
            print(response.status_code)
            print(response.headers["Content-Type"])
            data1 = response.json()
            print("Dati cittadino: ", data1)
        except:
            print("Problemi di comunicazione con il server")

    if sOper == "3":
        api_url = base_url + "/mod_cittadino"
        jsonDataRequest = ModificaCittadino()
        try:
            response = requests.put(api_url, json=jsonDataRequest)
            print(response.status_code)
            print(response.headers["Content-Type"])
            data1 = response.json()
            print(data1)
        except:
            print("Problemi di comunicazione con il server")
    
    if sOper == "4":
        api_url = base_url + "/del_cittadino"
        jsonDataRequest = EliminaCittadino()
        try:
            response = requests.delete(api_url, json=jsonDataRequest)
            print(response.status_code)
            print(response.headers["Content-Type"])
            data1 = response.json()
            print(data1)
        except:
            print("Problemi di comunicazione con il server")
    
        

    CreaInterfaccia()
    sOper = input("Seleziona operazione: ")
