from flask import Flask, jsonify, request
import sys 
import dbclient as db

api = Flask(__name__)

cur = db.connect()
if cur is None:
    print("Errore nella connessione con il database")
    sys.exit()

@api.route('/vendi_casa', methods=['POST'])
def VendiCasa():
    global cur
    content_type = request.headers.get("Content-Type")
    if content_type == 'application/json':
        jsonReq = request.json 
        catastale = jsonReq['Catastale']
        indirizzo = jsonReq['Indirizzo']
        civico = jsonReq['Civico']
        piani = jsonReq['Piani']
        metri = jsonReq['Metri']
        vani = jsonReq['Vani']
        prezzo = jsonReq['Prezzo']
        stato = jsonReq['Stato']
        filiale = jsonReq['Filiale Proponente']
        sQuery = "insert into case_in_vendita(catastale,indirizzo,numero_civico,piano,metri,vani,prezzo,stato,filiale_proponente) values ("
        sQuery += "'" + catastale + "','" + indirizzo + "','" + civico + "','" + piani + "','" + metri + "','" + vani + "','" + prezzo + "','" + stato + "','" + filiale + "');"
        print(sQuery)
        iRet = db.write_in_db(cur,sQuery)
        if iRet == -2:
            return jsonify({"Esito": "001", "Msg": "Casa già presente"}), 200
        elif iRet == -1:
            return jsonify({"Esito": "002", "Msg": "Formato richiesta non valido"}), 200
        else:
            return jsonify({"Esito": "000", "Msg": "Casa in vendita aggiunta con successo"}), 200
    else:
        return jsonify({"Esito": "002", "Msg": "Formato richiesta non valido"}), 200

api.route('/affitta_casa', methods=['POST'])
def AffittaCasa():
    global cur
    try:
        content_type = request.headers.get("Content-Type")
        if content_type == 'application/json':
            jsonReq = request.json
            catastale = jsonReq.get('Catastale')
            indirizzo = jsonReq.get('Indirizzo')
            civico = jsonReq.get('Civico')
            tipo_affitto = jsonReq.get('Tipo di Affitto')
            bagno_personale = jsonReq.get('Bagni')
            prezzo = jsonReq.get('Prezzo Mensile')
            filiale = jsonReq.get('Filiale Proponente')

            sQuery = "insert into case_in_affitto(catastale,indirizzo,civico,tipo_affitto,bagno_personale,prezzo_mensile,filiale_proponente) values ("
            sQuery += "'" + catastale + "','" + indirizzo + "','" + civico + "','" + tipo_affitto + "','" + bagno_personale + "','" + prezzo + "','" + filiale  + "');"                                
            print(sQuery)
            iRet = db.write_in_db(cur,sQuery)
            if iRet == -2:
                return jsonify({"Esito": "001", "Msg": "Casa già presente"}), 200
            elif iRet == -1:
                return jsonify({"Esito": "002", "Msg": "Formato richiesta non valido"}), 200
            else:
                return jsonify({"Esito": "000", "Msg": "Casa in affitto aggiunta con successo"}), 200
        else:
            return jsonify({"Esito": "002", "Msg": "Formato richiesta non valido"}), 200
    except Exception as e:  
        print(f"Errore: {str(e)}")  # Stampa il dettaglio dell'errore
        return jsonify({"Esito": "003", "Msg": "Errore interno del server"}), 500

api.route('/read_case_vend/<catastale>', methods=['GET'])
def read_case_in_vendita(catastale):
    global cur
    sQuery = "select * from case_in_vendita where catastale='" + catastale + "';"
    print(sQuery)
    iNumRecords = db.read_in_db(cur, sQuery)
    if iNumRecords != 1:
        print(iNumRecords)
        return jsonify({"Esito":"001", "Msg":"Casa non trovata"}), 200
    else:
        dResponse = db.read_next_row(cur)
        print(dResponse)
        casa = dResponse[1]
        return jsonify({"Esito":"000", "Msg":"Casa trovata", "Dati": casa}), 200

api.route('/read_case_vend/<catastale>', methods=['GET'])
def read_case_in_vendita(catastale):
    global cur
    sQuery = "select * from case_in_affitto where catastale='" + catastale + "';"
    print(sQuery)
    iNumRecords = db.read_in_db(cur, sQuery)
    if iNumRecords != 1:
        print(iNumRecords)
        return jsonify({"Esito":"001", "Msg":"Casa non trovata"}), 200
    else:
        dResponse = db.read_next_row(cur)
        print(dResponse)
        casa = dResponse[1]
        return jsonify({"Esito":"000", "Msg":"Casa trovata", "Dati": casa}), 200

api.run(host="0.0.0.0", port=8080, ssl_context="adhoc", debug=True)

