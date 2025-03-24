from flask import Flask, render_template, request

api = Flask(__name__)

utenti = [['mario', 'password1', 'M', '0'], ['gianni', 'password2', 'M', '0'], ['Anita', 'password3', 'F', '0']]

    
@api.route('/', methods=['GET'])
def index():
    return render_template('index.html')

@api.route('/pippo', methods=['GET'])
def index2():
    return render_template('index2.html')

@api.route('/regok', methods=['GET'])
def reg_ok():
    return render_template('reg_ok.html')

@api.route('/regko', methods=['GET'])
def reg_ko():
    return render_template('reg_ko.html')

@api.route('/registrati', methods=['GET'])
def registrati():

    nome = request.args.get('nome')
    

    password = request.args.get("password")
    
    if request.args.get("sesso")=="1":
        sesso ="M"
    else:
        sesso ="F"
    
    utente = []
    utente.append(nome)
    utente.append(password)
    utente.append(sesso)
    utente.append("0")

    if utente in utenti:
        index = utenti.index(utente)
        utenti[index[3]]="1"
        return render_template('reg_ok.html')

    return render_template('reg_ko.html')

@api.route('/login.html', methods=['GET'])
def login():
    return render_template('login.html')

@api.route('/login_ok.html', methods=['GET'])
def login_ok():

    nome = request.args.get('nome')
    password = request.args.get("password")

    utente = []
    utente.append(nome)
    utente.append(password)

    if utente in utenti:
        return render_template('login_ok.html')
    

api.run(host="0.0.0.0",port=8085)