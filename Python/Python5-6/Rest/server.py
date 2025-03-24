from flask import Flask, json, request
from Rest2.myjson import JsonSerialize,JsonDeserialize
import requests

sFileAnagrafe = "./anagrafe.json"
api = Flask(__name__)

@api.route('/add_cittadino', methods=['POST'])
def GestisciAddCittadino():
    #prendi idati della richiesta
    content_type = request.headers.get('Content-Type')
    print("Ricevuta chiamata " + content_type)
    if content_type == "application/json":
        jRequest =  request.json
        sCodiceFiscale = jRequest["CodiceFiscale"]
        print("Ricevuto" + sCodiceFiscale)
        #carichiamo l'anagrafe
        dAnagrafe = JsonDeserialize(sFileAnagrafe)
        if sCodiceFiscale not in dAnagrafe:
            dAnagrafe[sCodiceFiscale] = jRequest
            JsonSerialize(dAnagrafe,sFileAnagrafe)
            jResponse = {"Esito":"000", "Msg":"Cittadino aggiunto con successo!"}
            return json.dumps(jResponse),200
        else:
            jResponse = {"Error":"001", "Msg":"Codice fiscale già presente"}
            return json.dumps(jResponse),200
    else:
        return "Errore, formato non riconosciuto",200

@api.route('/get_cittadino', methods=['GET'])
def GestisciGetCittadino():
    content_type = request.headers.get('Content-Type')
    print("Ricevuta chiamata " + content_type)
    if content_type == "application/json":
        jRequest =  request.json
        sCodiceFiscale = jRequest["CodiceFiscale"]
        print("Ricevuto" + sCodiceFiscale)
        dAnagrafe = JsonDeserialize(sFileAnagrafe)
        if sCodiceFiscale in dAnagrafe:
            jResponse = dAnagrafe[sCodiceFiscale]
            JsonSerialize(dAnagrafe,sFileAnagrafe)
            return json.dumps(jResponse),200
        else:
            jResponse = {"Error":"001", "Msg":"Cittadino non trovato"}
            return json.dumps(jResponse),200
    else:
        return "Errore, formato non riconosciuto",200

@api.route('/mod_cittadino', methods=['PUT'])
def GestisciModificaCittadino():
    content_type = request.headers.get('Content-Type')
    print("Ricevuta chiamata "+ content_type)
    if content_type == "application/json":
        jRequest = request.json
        sCodiceFiscale = jRequest["CodiceFiscale"]
        print("Ricevuto" + sCodiceFiscale)
        dAnagrafe = JsonDeserialize(sFileAnagrafe)
        if sCodiceFiscale in dAnagrafe:
            dAnagrafe[sCodiceFiscale].update(jRequest)
            JsonSerialize(dAnagrafe, sFileAnagrafe)
            return json.dumps({"Esito": "000", "Msg": "Cittadino aggiornato"}), 200
        else:
            return json.dumps({"Error":"001", "Msg":"Cittadino non trovato"}), 200
    else:
        return "Errore, formato non riconosciuto",200

@api.route('/del_cittadino', methods=['DELETE'])
def GestisciDeleteCittadino():
    content_type = request.headers.get('Content-Type')
    print("Ricevuta chiamata "+ content_type)
    if content_type == "application/json":
        jRequest = request.json
        sCodiceFiscale = jRequest["CodiceFiscale"]
        print("Ricevuto" + sCodiceFiscale)
        dAnagrafe = JsonDeserialize(sFileAnagrafe)
        if sCodiceFiscale in dAnagrafe:
            # Rimuove il cittadino dall'anagrafe
            del dAnagrafe[sCodiceFiscale]
            JsonSerialize(dAnagrafe, sFileAnagrafe)
            return json.dumps({"Esito": "000", "Msg": "Cittadino eliminato"}), 200
        else:
            return json.dumps({"Error":"001", "Msg":"Cittadino non trovato"}),200
    else:
        return "Errore, formato non riconosciuto",200


api.run(host= "127.0.0.1", port=8080)