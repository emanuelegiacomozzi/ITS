import sys
import os
import os.path
import time

#pip3 install psycopg2-binary
import dbclient as db


print("Inizio programma prova database")
cur = db.connect()
if cur is None:
	print("Errore connessione al DB")
	sys.exit()

sQuery = "select * from cittadini"

sQueryPerReadCodiceFiscale = "select * from cittadino where codice_fiscale = '" + sCodiceFiscaleCittadino + "';"
iNumRows = db.read_in_db(cur, sQueryPerReadCodiceFiscale)
if iNumRows == 0:
	print("codice fiscale non presente nel db")
else:
	#prendo dati query e li mando al client
	pass 

iNumRows = db.read_in_db(cur,sQuery)
for ii in range(0,iNumRows):
	myrow = db.read_next_row(cur)
	print(myrow)
	