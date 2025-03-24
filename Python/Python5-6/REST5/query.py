import dbclient as db
import sys

    # Connessione al database
cur = db.connect()
if cur is None:
	print("Errore connessione al DB")
	sys.exit()


def CreaInterfaccia():
    print("Operazioni disponibili")
    print("1. Esegui query di scrittura")
    print("2. Esegui query di lettura")
    print("3. Exit")


CreaInterfaccia()
sOper = input("Seleziona operazione: ")
while(sOper != "3"):
    if sOper == "1":
        query = input("Inserisci la query di scrittura: ")
        ret = db.write_in_db(cur, query)
        if ret == 0:
            print("Query eseguita correttamente.")
        elif ret == -1:
            ("Errore")
        else:
            print("Errore scrittura")

    
    if sOper == "2":
        query = input("Inserisci la query di lettura: ")
        ret = db.read_in_db(cur, query)
        if ret >= 0:
            for _ in range(ret):
                row = db.read_next_row(cur)
                print(row)
        else:
            print("Errore lettura")


    else:
        print("Inserisci un numero valido")
    
    CreaInterfaccia()
    sOper = input("Seleziona operazione: ")


